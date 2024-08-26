package com.teddy924.api.env;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// 경로를 설정해두면 @Value 어노테이션을 활용하여 사용할 수도 있고, .yml에서 바로 사용할 수도 있다.
@PropertySource("classpath:properties/env.properties")
public class EnvConfig {
}
