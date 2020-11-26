package com.example.todoappwithroom.models

import com.google.gson.annotations.SerializedName

data class TodoInsert(

	@field:SerializedName("task")
	val task: String,

	@field:SerializedName("status")
	val status: String = "false"
)