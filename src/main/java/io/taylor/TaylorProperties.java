package io.taylor;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.time.Duration;

@Data
@Component
@ConfigurationProperties("taylor")
//@Validated
public class TaylorProperties {
    private String name;
    private int age;
    private String fullName;
    private Duration sessionTimeout = Duration.ofSeconds(30);
}
