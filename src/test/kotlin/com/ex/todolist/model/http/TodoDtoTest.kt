package com.ex.todolist.model.http

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import javax.validation.Validation

class TodoDtoTest {
    val validator = Validation.buildDefaultValidatorFactory().validator

    @Test
    fun todoDtoTest(){

        val todoDto = TodoDto().apply {
            this.title = "test"
            this.description = ""
            this.schedule = "2020-10-20 13:00:00"
        }

        val result = validator.validate(todoDto)
        Assertions.assertEquals(true, result.isEmpty())
    }
}