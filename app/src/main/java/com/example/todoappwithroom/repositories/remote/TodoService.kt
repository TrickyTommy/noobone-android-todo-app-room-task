package com.example.todoappwithroom.repositories.remote

import com.example.todoappwithroom.models.TodoInsert
import retrofit2.Call
import retrofit2.http.*

interface TodoService {
    @GET("api/v1/todos")
    fun getAllTodo(): Call<TodoResponse>

    @POST("api/v1/todos")
    fun insertTodo(
        @Body
        body: TodoInsert
    ): Call<InsertResponse>

//    @DELETE("api/v1/todos")
//    fun deleteTodo(id: Long): Long

//    @PUT("api/v1/todos")
//    fun updateTodo(todoModel: TodoModel): Call<>

}
