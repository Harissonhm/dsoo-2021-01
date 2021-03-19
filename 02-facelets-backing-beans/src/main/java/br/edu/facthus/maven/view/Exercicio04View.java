package br.edu.facthus.maven.view;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Exercicio04View {
	
	private String dataNascimentoStr;
	
	private String saida;

	public void calculaIdade() {
		// Data nascimento
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);
		
		// Data atual
		LocalDate dataAtual = LocalDate.now();
		
		// Cálculo da idade
		int idade = Period.between(dataNascimento, dataAtual).getYears();
		saida = String.format("Você tem %d anos.", idade);
	}
	
	public String getDataNascimentoStr() {
		return dataNascimentoStr;
	}

	public void setDataNascimentoStr(String dataNascimentoStr) {
		this.dataNascimentoStr = dataNascimentoStr;
	}

	public String getSaida() {
		return saida;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}
	
	
	
	
}
