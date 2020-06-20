package com.lucciani.pontointeligente.api.utils;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtilsTest {
	
	private static final String SENHA = "123456";
	private final BCryptPasswordEncoder bCrEncoder = new BCryptPasswordEncoder();
	
	@Test
	public void testSenhaNula() {
		assertNull(PasswordUtils.gerarBCrypt(null));
	}
	
	@Test
	public void testGerarHashSenha() {
		String hash = PasswordUtils.gerarBCrypt(SENHA);
		
		assertTrue(bCrEncoder.matches(SENHA, hash));
	}

}
