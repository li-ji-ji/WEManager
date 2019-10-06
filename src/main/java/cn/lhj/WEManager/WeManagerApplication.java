package cn.lhj.WEManager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"cn.lhj.WEManager.mapper"})
public class WeManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeManagerApplication.class, args);
	}

}
