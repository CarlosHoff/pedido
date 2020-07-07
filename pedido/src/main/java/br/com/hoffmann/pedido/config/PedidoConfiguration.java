package br.com.hoffmann.pedido.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@Profile("dev")
@EnableSwagger2
@EnableFeignClients
public class PedidoConfiguration {
}
