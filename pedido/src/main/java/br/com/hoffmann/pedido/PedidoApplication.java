package br.com.hoffmann.pedido;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"br.com.hoffmann.pedido.repository"})
@ComponentScan(basePackages = {"br.com.hoffmann.pedido.client"})
public class PedidoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PedidoApplication.class, args);
	}

}
