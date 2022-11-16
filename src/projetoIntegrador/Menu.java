package projetoIntegrador;
import java.util.Scanner;

import projetoIntegrador.Tema;

import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class Menu{

	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);

		int escolha_menu, escolha_tema;
		boolean sair = false;
		int escolha_sair = 0;
		escolha_menu = 0;
		escolha_tema = 0;
		Tema objTemaSelecionado;
		Quiz objQuiz = new Quiz();

	 //carregamento do quiz
		objQuiz.CarregarMusica();
		objQuiz.CarregarCopaDoMundo();
		objQuiz.CarregarCapitais();
	
		//Começando o quiz

		do {
			
			
			
			System.out.println("<<<<<<<<<<<<Quiz Three Themes>>>>>>>>>>>>");
			System.out.println("<>                                     <>");
			System.out.println("<>    DIGITE [1] PARA: //JOGAR         <>");
			System.out.println("<>                                     <>");
			System.out.println("<>    DIGITE [2] PARA: //COMO JOGAR    <>");
			System.out.println("<>                                     <>");
			System.out.println("<>    DIGITE [3] PARA: //CRÉDITOS      <>");
			System.out.println("<>                                     <>");
			System.out.println("<>    DIGITE [4] PARA: //SAIR          <>");
			System.out.println("<>                                     <>");
			System.out.println("<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>");
			
			System.out.print("\n");

			System.out.print("Digite uma opção: ");
			escolha_menu = entrada.nextInt();
			System.out.print("\n");
		
			switch(escolha_menu) {
			//jogar
			case 1:
				sair = false;
				do {
					
					for (Tema t : objQuiz.colListaTemas) {
						System.out.println(Integer.toString(t.ID) + " - " +  t.value);	
					}
					System.out.print("Digite uma opção: ");
					escolha_tema = entrada.nextInt();
					System.out.print("\n");
					
					
					objTemaSelecionado = objQuiz.getTema(escolha_tema);
					
					objTemaSelecionado.ListarPerguntas(entrada);
				
					objTemaSelecionado.ExibirResultado(entrada);
					
					System.out.print("Quer tentar outro tema? (1=SIM | 2=NAO) ");
					escolha_sair = entrada.nextInt();
					System.out.print("\n");
					
					if (escolha_sair==2) {
						sair = true;		
						System.out.print("Obrigado por jogar!");
					}
					
				}while(sair == false);
				break;
			//como jogar
			case 2:
				System.out.println("<<<<<<<<<<<<<<<<<<<<COMO JOGAR>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("<>                                               <>");
				System.out.println("<> *	O jogo consiste em representar um quiz,  <>");
				System.out.println("<> dessa forma tendo 4 alternativas para cada    <>");
				System.out.println("<> pergunta.     	                         <>");
				System.out.println("<>                                               <>");
				System.out.println("<> *	Existem três temas para escolherem, que  <>");
				System.out.println("<> são: música, copa do mundo e capitais do      <>");
				System.out.println("<> Brasil. Cada tema possue 10 perguntas.        <>");
				System.out.println("<>                                               <>");
				System.out.println("<> *	Selecione a que achar correta e no final <>");
				System.out.println("<> saberá se ela estava de fato correta ou se    <>");
				System.out.println("<> era a resposta errada.                        <>");
				System.out.println("<>                                               <>");
				System.out.println("<> *	Para selecionar cada resposta, digite o  <>");
				System.out.println("<> letra correspondente à mesma.                 <>");
				System.out.println("<>                                               <>");
				System.out.println("<>                   BOA SORTE!                  <>");
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.print("\n");
				System.out.print("Digite 5 para voltar para o menu: ");
				escolha_menu = entrada.nextInt();
				break;
			//créditos	
			case 3:
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<CRÉDITOS>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("<>                                               <>");
				System.out.println("<>                Rafael Soares                  <>");
				System.out.println("<>                Murilo Santos                  <>");
				System.out.println("<>               Richardson Maia                 <>");
				System.out.println("<>                  Brian Lima                   <>");
				System.out.println("<>             Gabriel Boaventura                <>");
				System.out.println("<>                 Ygor Gomes                    <>");
				System.out.println("<>                                               <>");
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.print("\n");
				System.out.print("Digite 5 para voltar para o menu: ");
				escolha_menu = entrada.nextInt();
				break;
			//sair
			case 4:
	
				System.out.print("\n");
				System.out.print("Obrigado por jogar!");
				sair = true;
				break;
			
			case 5:
				System.out.println("<<<<<<<<<<<<Quiz Three Themes>>>>>>>>>>>>");
				System.out.println("<>                                     <>");
				System.out.println("<>    DIGITE [1] PARA: //JOGAR         <>");
				System.out.println("<>                                     <>");
				System.out.println("<>    DIGITE [2] PARA: //COMO JOGAR    <>");
				System.out.println("<>                                     <>");
				System.out.println("<>    DIGITE [3] PARA: //CRÉDITOS      <>");
				System.out.println("<>                                     <>");
				System.out.println("<>    DIGITE [4] PARA: //SAIR          <>");
				System.out.println("<>                                     <>");
				System.out.println("<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>");
			
				System.out.print("\n");
		
				System.out.print("Digite uma opção: ");
				escolha_menu = entrada.nextInt();
				System.out.print("\n");
				break;
			
			}
		}while(sair == false);
		entrada.close();
	}
}
