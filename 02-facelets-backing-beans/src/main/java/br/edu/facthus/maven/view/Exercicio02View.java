package br.edu.facthus.maven.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Exercicio02View {
	
	private Integer numero1;
	
	private Integer numero2;
	
	private String resultado;

	public void realizaSoma() {
		resultado = String.format("%d + %d = %d",
				numero1, numero2, numero1 + numero2);
	}
	
	public void realizaSubtracao() {
		resultado = String.format("%d - %d = %d",
				numero1, numero2, numero1 - numero2);
	}
	
	public void realizaMultiplicacao() {
		resultado = String.format("%d * %d = %d",
				numero1, numero2, numero1 * numero2);
	}
	
	public void realizaDivisao() {
		resultado = String.format("%d / %d = %d",
				numero1, numero2, numero1 / numero2);
	}
	
	public void realizaResto() {
		resultado = String.format("%d %% %d = %d",
				numero1, numero2, numero1 % numero2);
	}
	
	public Integer getNumero1() {
		return numero1;
	}

	public void setNumero1(Integer numero1) {
		this.numero1 = numero1;
	}

	public Integer getNumero2() {
		return numero2;
	}

	public void setNumero2(Integer numero2) {
		this.numero2 = numero2;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
}
