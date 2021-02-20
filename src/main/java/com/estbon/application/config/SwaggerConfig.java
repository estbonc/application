package com.estbon.application.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StopWatch;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author liushuaishuai
 * @date 2018/1/8 下午2:23
 *
 * Swagger Configuration
 */
@Configuration
@EnableSwagger2
@EnableAutoConfiguration
@Slf4j
public class SwaggerConfig {

    @Value("${swagger.project.title}")
    private String title;
    @Value("${swagger.project.description}")
    private String description;
    @Value("${swagger.project.version}")
    private String version;

    @Bean
    public Docket createRestApi(){
        log.error("Start swagger");
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        ApiInfo apiInfo = new ApiInfoBuilder()
                .title(title)
                .description(description)
                .termsOfServiceUrl("")
                .version(version)
                .build();

        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.estbon.application.resource.api"))
                .paths(PathSelectors.any())
                .build();

        stopWatch.stop();
        log.info("Start Swagger in {} ms",stopWatch.getLastTaskTimeMillis());

        return docket;
    }

}
