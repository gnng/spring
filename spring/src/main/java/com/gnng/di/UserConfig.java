package com.gnng.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//配置类注解
@ComponentScan("com.gnng.di")//自动扫描包名下所有使用@Service、@Component、@Repository和@Controller的类，并注册为Bean
public class UserConfig {

}
