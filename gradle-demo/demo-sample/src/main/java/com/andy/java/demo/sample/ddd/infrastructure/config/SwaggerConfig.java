package com.andy.java.demo.sample.ddd.infrastructure.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author ccb
 */
@Data
@Configuration
@EnableSwagger2
public class SwaggerConfig
{
    @Bean
    public Docket createRestApi()
    {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .apis(RequestHandlerSelectors.basePackage(scanPath))
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo()
    {
        return new ApiInfoBuilder()
                .title(title)
                .description(desc)
                .version(version)
                .build();
    }

    @Value("${module.swagger.title}")
    @Getter @Setter
    private String title;

    @Value("${module.swagger.desc}")
    private String desc;

    @Value("${module.swagger.version}")
    private String version;

    @Value("${module.swagger.scan-path}")
    private String scanPath;
}
