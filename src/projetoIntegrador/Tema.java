package projetoIntegrador;


import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Tema {
	Collection<pergunta> perguntas;
	String value;
	int ID;
	
	public Tema(int ID, String value, Collection<pergunta> perguntas){
		this.ID = ID;
		this.value = value;
		this.perguntas = perguntas;
		Collections.shuffle((List<pergunta>)this.perguntas);
	}
	
	public void ListarPerguntas(Scanner entrada) {
		
		//tema escolhido
		for (pergunta p : this.perguntas) {		    		
			System.out.println(p.value);		
			for (resposta r : p.respostas) {
				System.out.println(Integer.toString(r.ID) + " - " +  r.value);	
			}
			System.out.println("Digite sua resposta: ");
			p.ValidarResposta(entrada.nextInt());
		}
	}

	public void ExibirResultado(Scanner entrada) {
		
		int nota_total = 0;
		int nota_final = 0;
		for (pergunta p : this.perguntas) {		    		
			if(p.respostaCerta) {
				nota_final = nota_final + 10;
			}
			nota_total = nota_total + 10;
		}
		System.out.println("O resultado final do Quiz "+this.value+" é: "+nota_final+ "/"+nota_total);
	}
}


