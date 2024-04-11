package view;

import br.edu.fateczl.filaobj.Fila;
import controller.ParqueController;
import model.Pessoa;

public class Principal {
	public static void main(String[] args) throws Exception {
		
		ParqueController pc = new ParqueController();
		
		Fila f = new Fila (); 
		
		String nomes [] = {"Ana", "João", "Maria", "Pedro", "Sofia", "Lucas", "Laura", "Gabriel", "Julia", "Matheus", "Isabella", "Rafael", "Carolina", "Felipe", "Giovanna", "Daniel", "Amanda", "Bruno", "Mariana", "Thiago", "Beatriz", "Lucas", "Camila", "Eduardo", "Fernanda", "Guilherme", "Letícia", "André", "Larissa", "Gabriel"};
		
		for(String nm : nomes) {
			String nome = nm; 
			int idade = (int) ((Math.random()*30)+10);
			float altura = (float) ((Math.random()*0.65)+1.35);
			
			Pessoa p = new Pessoa (nome, idade, altura);
			f.insert(p);
		}
			
		pc.brinquedo(f);
		
		
		
	}

}
