package com.li88qq.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author li88qq
 * @version 1.0 2023/8/26 18:06
 */
@SpringBootApplication(scanBasePackages = {"com.li88qq.db", "com.li88qq.api"})
@MapperScan(basePackages = {"com.li88qq.db.dao", "com.li88qq.api.dao"})
public class Application{

    /**
     * 启动
     *
     * @param args 启动参数
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
