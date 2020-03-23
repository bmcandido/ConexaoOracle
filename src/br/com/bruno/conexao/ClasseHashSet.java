package br.com.bruno.conexao;

import java.util.Collection;
import java.util.HashSet;

public class ClasseHashSet {

	public static void main(String[] args) {

		Collection<String> alunos = new HashSet<>(); //vantagem de usar o HashSet é que a velocidade é maior
//Set
		alunos.add("Bruno Mario Candido");
		alunos.add("Guilherme Han");
		alunos.add("Francielle Rodrigues");
		alunos.add("Jadson Campos");
		System.out.println(alunos);

		for (String retornaalunos : alunos) {
			System.out.println(retornaalunos);

		}
		
		alunos.forEach(aluno-> {
			System.out.println(aluno);
		});
		
		boolean pesquisa = alunos.contains("Josue de sousa");
		
		System.out.println(pesquisa);

	}

}
