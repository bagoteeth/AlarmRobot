package net.liangyihui.alarmrobot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.naming.spi.ResolveResult;

/**
 * @Author ruofa
 * @Date 2021/1/21 9:54
 * @Version 1.0
 */
@Configuration
public class AppConfig {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
