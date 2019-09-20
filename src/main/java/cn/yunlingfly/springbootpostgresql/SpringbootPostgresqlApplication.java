package cn.yunlingfly.springbootpostgresql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 添加扫描的Mapper包
@MapperScan("cn.yunlingfly.springbootpostgresql.infra.mapper")
public class SpringbootPostgresqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPostgresqlApplication.class, args);
    }

}
