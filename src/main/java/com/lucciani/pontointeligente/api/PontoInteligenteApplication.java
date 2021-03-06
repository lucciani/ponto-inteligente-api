package com.lucciani.pontointeligente.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PontoInteligenteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PontoInteligenteApplication.class, args);
	}

	/*
	 * @Bean public CommandLineRunner commandLineRunner() { return args -> { String
	 * senhaEncoded = PasswordUtils.gerarBCrypt("12345");
	 * System.out.println("Senha encoded: "+senhaEncoded);
	 * 
	 * senhaEncoded = PasswordUtils.gerarBCrypt("12345");
	 * System.out.println("Senha encoded novamente: "+senhaEncoded);
	 * 
	 * System.out.println("Senha válida "+PasswordUtils.senhaValida("12345",
	 * senhaEncoded)); }; }
	 */

}
