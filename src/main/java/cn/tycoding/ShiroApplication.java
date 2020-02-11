package cn.tycoding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession  //启用redis session存储
@MapperScan("cn.tycoding.*.mapper")
public class ShiroApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShiroApplication.class, args);
    }

}

