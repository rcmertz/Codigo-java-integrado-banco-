package com.example.Planejamento;

import com.example.Planejamento.ConnectionFactory.ConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.Connection;

@SpringBootApplication
public class PlanejamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanejamentoApplication.class, args);
		Connection c = new ConnectionFactory().getConnection();
		System.out.println("conectou");
	}

}
