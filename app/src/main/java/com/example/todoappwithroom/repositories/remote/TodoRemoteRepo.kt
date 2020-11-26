package com.example.todoappwithroom.repositories.remote

import android.content.Context
import android.os.StrictMode
import com.example.todoappwithroom.models.TodoInsert
import com.example.todoappwithroom.models.TodoModel
import com.example.todoappwithroom.repositories.TodoRepository

class TodoRemoteRepo(context: Context) :TodoRepository {
    override fun getAllTodo(): List<TodoModel> {
        val policy = StrictMode.ThreadPolicy.Builder()
            .permitAll().build()
        StrictMode.setThreadPolicy(policy)
        return TodoClient.todoService.getAllTodo().execute().body()?.data as MutableList<TodoModel>
    }

    override fun insertTodo(task: String, date: String): TodoModel {
        val policy = StrictMode.ThreadPolicy.Builder()
            .permitAll().build()
        StrictMode.setThreadPolicy(policy)
        return TodoClient.todoService.insertTodo(TodoInsert(task)).execute().body()!!.data
    }

    override fun deleteTodo(id: Long): Long {
        TODO("Not yet implemented")
    }

    override fun updateTodo(todoModel: TodoModel): TodoModel {
        TODO("Not yet implemented")
    }
}