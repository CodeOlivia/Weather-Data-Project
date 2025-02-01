package zerobase.weather.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;


//http://localhost:8080/swagger-ui/index.html
//스프링 부트 v3이상부터는 jakarta를 사용하는데 거기 지원하는 springfox의 부재가 있어서 openapi로 대체하여 사용

@Configuration
@OpenAPIDefinition(info = @Info(title = "날씨 일기 프로젝트", version = "1.0", description = "날씨 일기를 CRUD할 수 있는 백엔드 API입니다."))
public class SwaggerConfig {
}