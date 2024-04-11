package model;

public class Pessoa {
	
	String nome;
	int idade; 
	float altura; 
	
	public Pessoa (String nome, int idade,float altura) {
		this.nome = nome;
		this.idade = idade; 
		this.altura = altura; 
	}
	
	public String nome() {
		return nome;
	}
	
	public int idade() {
		return idade;
	}
	
	public float altura () {
		return altura; 
	}

}
