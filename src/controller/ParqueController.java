package controller;

import br.edu.fateczl.filaobj.Fila;
import model.Pessoa;

public class ParqueController {
	
	public ParqueController () {
		super();
	}
	
	public void brinquedo (Fila f) throws Exception {
		while(!f.isEmpty()) {
			
			Pessoa p = (Pessoa) f.remove();
			
			System.out.println("Participante: " + p.nome() + " Altura: " + (float) p.altura() + " Idade: "+ p.idade());
			
			if(p.idade()<16 && p.altura()<1.60) {
				System.out.println("Participante " + p.nome() + " impedido de entrar por não ter idade e altura suficiente ");	
			}else if(p.idade()<16) {
				System.out.println("Participante " + p.nome() + " impedido de entrar por não ter idade suficiente ");	
			}else if(p.altura()<1.60) {
				System.out.println("Participante " + p.nome() + " impedido de entrar por não ter altura suficiente ");	
			}else {
				System.out.println("Participante " + p.nome() + " teve sua entrada permitida ");	
			}
			
			
		}
	}

}
