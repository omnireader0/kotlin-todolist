package com.ex.todolist.service

import com.ex.todolist.database.Todo
import com.ex.todolist.database.convertTodo
import com.ex.todolist.model.http.TodoDto
import com.ex.todolist.model.http.convertTodoDto
import com.ex.todolist.repository.TodoRepositoryImpl
import org.springframework.stereotype.Service

@Service
class TodoService(
    val todoRepositoryImpl: TodoRepositoryImpl
) {

    // C
    fun create(todoDto: TodoDto): TodoDto? {
        return todoDto.let {
            Todo().convertTodo(it)
        }.let {
            todoRepositoryImpl.save(it)
        }?.let {
            TodoDto().convertTodoDto(it)
        }
    }

    // R
    fun read(index: Int): TodoDto? {
        return todoRepositoryImpl.findOne(index)?.let {
            TodoDto().convertTodoDto(it)
        }
    }

    fun readAll(): MutableList<TodoDto> {
        return todoRepositoryImpl.findAll()
            .map {
                TodoDto().convertTodoDto(it)
            }.toMutableList()
    }

    // U
    fun update(todoDto: TodoDto): TodoDto? {
        return todoDto.let {
            Todo().convertTodo(it)
        }.let {
            todoRepositoryImpl.save(it)
        }?.let {
            TodoDto().convertTodoDto(it)
        }
    }

    // D
    fun delete(index: Int): Boolean {
        return todoRepositoryImpl.delete(index)
    }
}



