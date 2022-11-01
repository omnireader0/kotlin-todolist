package com.ex.todolist.database

data class TodoDataBase(
    var index: Int=0, // 인덱스 일단 0번 부터 시작
    var todoList: MutableList<Todo> = mutableListOf()
){

    fun init(){
        this.index = 0
        this.todoList = mutableListOf()
        println("[DEBUG] todo database init")
    }
}