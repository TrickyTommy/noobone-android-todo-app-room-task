package com.example.todoappwithroom.presenters

import com.example.todoappwithroom.models.TodoModel
import com.example.todoappwithroom.repositories.TodoRepository
import com.example.todoappwithroom.views.contracts.TodoContract

class TodoPresenter(private val view: TodoContract.View, private val repository: TodoRepository) :
    TodoContract.Presenter {
    override fun getAllTodo() {
        val todolist by lazy { repository.getAllTodo() }
        view.onSuccessGetAllTodo(todolist)
    }

    override fun insertTodo(task: String, date: String) {
        val todo by lazy { repository.insertTodo(task, date) }
        view.onSuccessInsertTodo(todo)
    }

    override fun deleteTodo(id: Long) {
        val todoId by lazy { repository.deleteTodo(id) }
        view.onSuccessDeleteTodo(todoId)

    }

    override fun updateTodo(todoModel: TodoModel) {
        val todo by lazy { repository.updateTodo(todoModel) }
        view.onSuccessUpdateTodo(todo)
    }


}