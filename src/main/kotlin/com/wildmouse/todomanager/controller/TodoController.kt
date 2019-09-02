package com.wildmouse.todomanager.controller

import org.springframework.web.bind.annotation.*

data class Todo(
        var name: String = "",
        var isDone: Boolean = false,
        var id: Int = 0
)

@RestController
@RequestMapping("/todo")
class TodoController {

    @GetMapping
    fun getTodoList() = listOf(
            Todo("todo 1", true, 1),
            Todo("todo 2", false, 2)
    )

    @PostMapping
    fun postTodo(todo: Todo) = "success"

    @PutMapping
    fun updateTodo(id: Int, todo: Todo) = todo.let {
        it.id = id;
        id
    }

    @DeleteMapping
    fun deleteTodo(id: Int) = "success"
}