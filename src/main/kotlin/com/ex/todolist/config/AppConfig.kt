package com.ex.todolist.config

import com.ex.todolist.database.TodoDataBase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration // 애플리케이션 구동 시 빈 생성
class AppConfig {

    // 빈 셍상되면 메소드 실행
    @Bean(initMethod = "init")
    fun todoDataBase(): TodoDataBase {
        return TodoDataBase()
    }

}