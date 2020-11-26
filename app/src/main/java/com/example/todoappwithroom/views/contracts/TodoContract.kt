package com.example.todoappwithroom.views.contracts

import com.example.todoappwithroom.models.TodoModel

class TodoContract {

    interface View {
        fun onSuccessGetAllTodo(todo: List<TodoModel>)
        fun onSuccessInsertTodo(todoModel: TodoModel)
        fun onSuccessDeleteTodo(id: Long)
        fun onSuccessUpdateTodo(todoModel: TodoModel)
    }

    interface Presenter {
        fun getAllTodo()
        fun insertTodo(task: String, date: String)
        fun deleteTodo(id: Long)
        fun updateTodo(todoModel: TodoModel)
    }
}