package projeto.orientacao.a.objetos;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descri��o do curso");
		curso1.setCargaHoraria(2);
			
		
		Curso curso2 = new Curso();		
		curso2.setTitulo("Curso Java Script");
		curso2.setDescricao("descri��o do curso");
		curso2.setCargaHoraria(5);
		
		
		Mentoria mentoria1 = new Mentoria();		
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("descri��o da mentoria");
		mentoria1.setData(LocalDate.now());
				
		/*
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Develper");
		bootcamp.setDescricao("Descri��o do conte�do Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devLisboa = new Dev();
		devLisboa.setNome("Bruno Lisboa");
		devLisboa.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos" + devLisboa.getConteudosInscritos());
		devLisboa.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos" + devLisboa.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + devLisboa.getConteudosConcluidos());
		System.out.println("XP: " + devLisboa.calcularXPTotal());
		
		System.out.println("-----------");
		
		Dev devMaria = new Dev();
		devMaria.setNome("Maria");
		devMaria.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos" + devMaria.getConteudosInscritos());
		devMaria.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos" + devMaria.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + devMaria.getConteudosConcluidos());
		System.out.println("XP: " + devMaria.calcularXPTotal());
		
	}

}
