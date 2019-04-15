package com.jrx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
/**
 * @ EnableSwagger2支持Swagger 2的SpringFox支持
 */
@EnableSwagger2
public class SpringFoxConfig {
    @Bean
    public Docket apiDocket() {
//DocumentationType.SWAGGER_2告诉Docket bean我们正在使用Swagger规范的版本2
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                //创建一个构建器，用于定义那写控制器及其生成的文档包含哪些方法
                .select()
                //扫描那个controller
                .apis(RequestHandlerSelectors.basePackage("com.jrx.controller"))
                //  /user/**  PathSelectors.ant("")  表示生成路径
                .paths(PathSelectors.any())

                .build();
    }
//该对象提供有关API的一般信息，例如标题，版本，联系人或许可信息
    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "江融信",
                "练习",
                "0.0.1",
                "www.jiangrongxin.com",
                new Contact("...", "...", "..."),
                "...",

                "... ...",
                Collections.emptyList()
        );
    }
}