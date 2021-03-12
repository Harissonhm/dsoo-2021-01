package br.edu.facthus.maven.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class IndexView {
	
	private String texto = "Olá facelets!";
	
	private String mensagem;
	
	public void atualizaMensagem() {
		texto = String.format("Você digitou: %s", mensagem);
	}
	
	public String getTexto() {
		return texto;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
