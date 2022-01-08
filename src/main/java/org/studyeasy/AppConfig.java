package org.studyeasy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.studyeasy.cars.Corolla;
import org.studyeasy.cars.Swift;
import org.studyeasy.specs.EngineType;


@Configuration
@ComponentScan
public class AppConfig {
    @Bean("engineType")
    public EngineType V6(){
        return new EngineType("V8 type");
    }

    @Bean("corolla")
    public Corolla Corolla(){
        return new Corolla();
    }
    @Bean("swift")
    public Swift Swift(){
        return new Swift();
    }
}
