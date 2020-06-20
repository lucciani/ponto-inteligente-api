package com.lucciani.pontointeligente.api.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {
	
	private static final Logger log = LoggerFactory.getLogger(PasswordUtils.class);
	
	public PasswordUtils() {
	}
	
	/*
	 * Gera um hash utilizando o BCrypt
	 * 
	 * @param senha
	 * @param String
	 */
	
	public static String gerarBCrypt(String senha) {
		if(senha == null) {
			return senha;
		}
		
		log.info("Gerando hash com o BCrypt.");
		BCryptPasswordEncoder bCryEncoder = new BCryptPasswordEncoder();
		return bCryEncoder.encode(senha);
	}
	
	/*
	 * Verifica se a senha é válida
	 * 
	 * @param senha
	 * @param senhaEncoder
	 * @return boolean 
	 */
	public static boolean senhaValida(String senha, String senhaEncoded) {
		log.info("Validando a senha com BCrypt.");
		BCryptPasswordEncoder bCryEncoder = new BCryptPasswordEncoder();
		return bCryEncoder.matches(senha, senhaEncoded);
	}

}
