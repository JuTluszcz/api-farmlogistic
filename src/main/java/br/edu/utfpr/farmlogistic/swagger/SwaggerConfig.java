package br.edu.utfpr.farmlogistic.swagger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import java.util.Collections;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30)
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.edu.utfpr.farmlogistic.swagger")) // Ajuste o pacote base
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiDetails());
    }

    private ApiInfo apiDetails() {
        return new ApiInfo(
                "API de Gerenciamento de Alimentação e Animais",
                "Documentação da API para gerenciar animais e suas alimentações",
                "1.0",
                "Termos de Serviço",
                new Contact("Seu Nome", "seu-website.com", "email@exemplo.com"),
                "Licença da API",
                "URL da Licença",
                Collections.emptyList()
        );
    }
}
