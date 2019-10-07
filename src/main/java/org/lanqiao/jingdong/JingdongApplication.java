package org.lanqiao.jingdong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@SpringBootApplication
@MapperScan("org.lanqiao.jingdong.mapper")
public class JingdongApplication {

    public static void main(String[] args) {
        SpringApplication.run(JingdongApplication.class, args);
    }

}
