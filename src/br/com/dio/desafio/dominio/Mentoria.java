package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate data;

	public Mentoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [titutlo= "+getTitulo()+" Descricao = "+getDescricao()+" data= " + data + "]";
	}


	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}
}
