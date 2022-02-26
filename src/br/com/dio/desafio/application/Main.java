package br.com.dio.desafio.application;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setTitulo("JAVA");
		curso.setDescricao("\r\n" + "Objetos em Java");
		curso.setCargaHoraria(8);

		Curso outroCurso = new Curso();
		outroCurso.setTitulo(" C#");
		outroCurso.setDescricao("\r\n" + " c sharp");
		outroCurso.setCargaHoraria(8);
		
		Conteudo conteudo = new Curso(); // polimorfismo

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria bootcamp java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());

//		System.out.println(curso);
//		System.out.println(outroCurso);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp ");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(outroCurso);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev = new Dev();
		dev.setNome("Fernando");
		dev.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Fernando : "+dev.getConteudosInscritos());
		dev.progredir();
		dev.progredir();
		System.out.println("------------------");
		System.out.println("Conteúdos inscritos Fernando : "+dev.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Fernando : "+dev.getConteudosConcluidos());
		System.out.println("XP : "+ dev.calcularTotalXp());
		System.out.println("------------------");

		Dev outroDev = new Dev();
		outroDev.setNome("Lauren");
		outroDev.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Lauren : "+outroDev.getConteudosInscritos());
		outroDev.progredir();
		outroDev.progredir();
		outroDev.progredir();
		System.out.println("------------------");
		System.out.println("Conteúdos inscritos Lauren : "+outroDev.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Lauren : "+outroDev.getConteudosConcluidos());
		System.out.println("XP : "+ outroDev.calcularTotalXp());
		System.out.println("------------------");
	}
}
