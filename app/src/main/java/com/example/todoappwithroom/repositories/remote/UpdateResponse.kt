package com.example.todoappwithroom.repositories.remote

import com.google.gson.annotations.SerializedName

data class UpdateResponse(

	@field:SerializedName("task")
	val task: String,

	@field:SerializedName("status")
	val status: String
)