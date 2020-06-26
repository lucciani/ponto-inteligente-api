package com.lucciani.pontointeligente.api.dtos;

import java.util.Optional;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

public class FuncionarioDto {
	
	private Long id;
	private String nome;
	private String email;
	private Optional<String> senha = Optional.empty();
	private Optional<String> valorHora = Optional.empty();
	private Optional<String> qtHorasTrabalhoDia = Optional.empty();
	private Optional<String> qtHorasAlmoco = Optional.empty();
	
	public FuncionarioDto() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@NotEmpty(message = "Nome não pode ser vazio")
	@Length(min = 3, max = 200, message = "Nome deve conter entre 3 e 200 caracteres.")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@NotEmpty(message = "Email não pode ser vazio.")
	@Length(min = 5, max = 200, message = "Email deve conter entre 5 e 200 caracteres.")
	@Email(message = "Email inválido.")
	public String getEmail() {
		return email; 
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Optional<String> getSenha() {
		return senha;
	}

	public void setSenha(Optional<String> senha) {
		this.senha = senha;
	}

	public Optional<String> getValorHora() {
		return valorHora;
	}

	public void setValorHora(Optional<String> valorHora) {
		this.valorHora = valorHora;
	}

	public Optional<String> getQtHorasTrabalhoDia() {
		return qtHorasTrabalhoDia;
	}

	public void setQtHorasTrabalhoDia(Optional<String> qtHorasTrabalhoDia) {
		this.qtHorasTrabalhoDia = qtHorasTrabalhoDia;
	}

	public Optional<String> getQtHorasAlmoco() {
		return qtHorasAlmoco;
	}

	public void setQtHorasAlmoco(Optional<String> qtHorasAlmoco) {
		this.qtHorasAlmoco = qtHorasAlmoco;
	}

	@Override
	public String toString() {
		return "FuncionarioDto [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", valorHora="
				+ valorHora + ", qtHorasTrabalhoDia=" + qtHorasTrabalhoDia + ", qtHorasAlmoco=" + qtHorasAlmoco + "]";
	}
	
}
