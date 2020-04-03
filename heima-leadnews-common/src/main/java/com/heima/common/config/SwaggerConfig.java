package com.heima.common.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2//注意,这里有了这个注解,那么启动类上就不能再有这个注解,不然页面中会没有接口信息
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.heima.*.controller"))
                //controller包的全路径名称
                .paths(PathSelectors.any())
                .build().apiInfo(new ApiInfoBuilder()
                        .title("黑马头条项目接口文档")
                        .description("黑马头条")
                        .version("v1.0")
                        .contact(new Contact("啊啊啊啊","blog.csdn.net","aaa@gmail.com"))
                        .license("The Apache License")
                        //.licenseUrl("http://www.baidu.com")
                        .build());
    }
}
