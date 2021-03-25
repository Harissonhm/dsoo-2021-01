package br.edu.facthus.maven.view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Exercicio05View {
	
	private String email;
	
	private String saida;
	
	private String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	
	private Pattern pattern = Pattern.compile(regex);

	public void validaEmail() {
		Matcher matcher = pattern.matcher(email);
		
		if (matcher.matches())
			saida = "O email é válido!";
		else
			saida = "O email não é válido...";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSaida() {
		return saida;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}
	
}
