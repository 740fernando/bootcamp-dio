package br.com.dio.desafio.application;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setTitulo("Bootcamp JAVA");
		curso.setDescricao("\r\n" + "Abstraindo um Bootcamp Usando Orientação a Objetos em Java");
		curso.setCargaHoraria(8);

		Curso outroCurso = new Curso();
		outroCurso.setTitulo("Bootcamp c#");
		outroCurso.setDescricao("\r\n" + "Abstraindo um Bootcamp Usando Orientação a Objetos em c sharp");
		outroCurso.setCargaHoraria(8);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria bootcamp java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());

		System.out.println(curso);
		System.out.println(outroCurso);
		System.out.println(mentoria);
	}
}
