package com.example.todoappwithroom.repositories

import com.example.todoappwithroom.models.TodoModel

interface TodoRepository{
    fun getAllTodo(): List<TodoModel>
    fun insertTodo(task: String, date: String): TodoModel
    fun deleteTodo(id: Long): Long
    fun updateTodo(todoModel: TodoModel): TodoModel
}