package application;

import java.time.LocalDate;
import java.util.Scanner;

import dominio.Bootcamp;
import dominio.Conteudo;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargahoraria(8);
		
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso js");
		curso2.setDescricao("descrição curso java");
		curso2.setCargahoraria(6);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		
		
		//System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setName("BootCamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev();
		devCamila.setName("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos camila  " + devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos camila  " + devCamila.getConteudosInscritos());
		System.out.println("Conteúdos concluidos camila " + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularTotalXp());
		System.out.println("--------");
		
		Dev devJoao = new Dev();
		devCamila.setName("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos joao " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos joao " + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos concluidos joao " + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
