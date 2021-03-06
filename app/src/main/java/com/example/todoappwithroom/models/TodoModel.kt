package com.example.todoappwithroom.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TodoModel(

    @field:SerializedName("date")
    val date: String,

    @field:SerializedName("createdAt")
    val createdAt: String,

    @field:SerializedName("task")
    val task: String,

    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("status")
    val status: Boolean,

    @field:SerializedName("updatedAt")
    val updatedAt: String
) : Parcelable