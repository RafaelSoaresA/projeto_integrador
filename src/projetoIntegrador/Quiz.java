package projetoIntegrador;

import java.util.ArrayList;
import java.util.Collection;

public class Quiz {
	// Carregamento do Quizz
	//TODO: criar coleção de temas e colocar lista de perguntas dentro
	
	Collection<Tema> colListaTemas;
	Collection<pergunta> colPerguntas;
	Collection<resposta> colRespostas;
	pergunta objPergunta;
	resposta objresposta;
	Tema objTema;
	
	public Quiz() {
		colListaTemas = new ArrayList<Tema>();
	
	}
	public void CarregarMusica() {

		colPerguntas = new ArrayList<pergunta>();
		
		objTema = new Tema(1, "MÚSICAS", colPerguntas);
		//Inicio Pergunta 1
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "Beggin - Maneskin", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "Drivers License - Olivia Rodrigo", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "Hey Jude - Beatles", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "Old Town Road - Lil Nas X", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<<<<<QUIZ MÚSICA>>>>>>>>>>>>>>>\n"
                +"<>   Qual música possui o recorde de 19 <>\n"
                +"<> semanas no top 1 da Billboard?       <>\n"
                +"<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>\n",  colRespostas);
		
		colPerguntas.add(objPergunta);
		
		//Fim pergunta 1
		
		//Inicio Pergunta 2
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "AM", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "Suck it and See", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "Tranquility base Hotel & Casino", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "Humbug", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<<<<<QUIZ MÚSICA>>>>>>>>>>>>>>>>\n"
		          +"<>   Qual albúm da banda Arctic Monkeys  <>\n"
		          +"<> possui a música 'Crying Lightning'?   <>\n"
		          +"<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		
		//Fim pergunta 2
		
		//Inicio Pergunta 3
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "Deja vú", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "Teto de Vidro", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "Máscara", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "Na Sua Estante", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<<<<<QUIZ MÚSICA>>>>>>>>>>>>>>>>\n"
                +"<>   Qual música da Pitty possui o maior <>\n"
                +"<> número de visualizações no YouTube?   <>\n"
                +"<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		
		//Fim pergunta 3
		
		//Inicio Pergunta 4
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "Brasil, São Paulo. 1985", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "EUA, Tennesse. 1983", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "Argentina, Córdoba. 1980", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "Londres, Wembley. 1985", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<<<<<<<<QUIZ MÚSICA>>>>>>>>>>>>>>>>>>\n"
                +"<>   Queen é uma banda lendária e que possui  <>\n"
                +"<> apresentações fantásticas, porém, a maior  <>\n"
                +"<> e mais histórica foi a do Queen no live    <>\n"
                +"<> aid. Qual o local e o ano do show?         <>\n"
                +"<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		
		//fim pergunta 4
		
		//inicio pergunta 5
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "Meu erro", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "Vital e sua moto", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "Lanterna dos afogados", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "Cuide bem do seu amor", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<<<<<<<<<<<<QUIZ MÚSICA>>>>>>>>>>>>>>>>>>>>>>>\n"
                +"<> Em 2001, Hebert Vianna, vocalista dos Paralamas     <>\n"
                +"<> do Sucesso, sofreu um acidente de avião, o deixando <>\n"
                +"<> delimitado e ocasionando na morte de sua esposa.    <>\n"
                +"<> Após isso, a banda lançou uma música em referência  <>\n"
                +"<> ao acidente. Qual o nome da música?                 <>\n"
                +"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		//fim pergunta 5
		
		//inicio pergunta 6
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "11/07/1993", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "09/03/2004", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "07/08/2001", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "13/set/1996", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<<<<<<<<QUIZ MÚSICA>>>>>>>>>>>>>>>>>>>\n"
                +"<> 	Qual foi a data em que o rapper 2Pac   <>\n"
                +"<> faleceu?                                    <>\n"
                +"<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		//fim pergunta 6
		
		//inicio pergunta 7
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "Snoop Dog, Wiz Khalifa e Dr.Dre", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "Eminem, Justin Bieber e Justin Timberlake", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, " Snoop Dog, Jay-Z e 2Pac", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "Eazy - E, Dr. Dre, Ice Cube, The DOC, MC Ren e DJ Yella", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<<<<<<<<QUIZ MÚSICA>>>>>>>>>>>>>>>>>>>\n"
                +"<> 	Quais eram os principais integrantes do<>\n"
                +"<> grupo de de Hip-Hop  N.W.A                  <>\n"
                +"<> (Niggaz Wit Attitudes)?                     <>\n"
                +"<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		//fim pergunta 7
		
		//inicio pergunta 8
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "Dançarino", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "DJ", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "MC", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "Produtor e compositor", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<<<<<<<<QUIZ MÚSICA>>>>>>>>>>>>>>>>>>>\n"
                +"<>    Qual era principal atuação de Dr. Dre?   <>\n"
                +"<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		//fim pergunta 8
		
		//inicio pergunta 9
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "Kenny G", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "Morte do autotune", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "Anos luz", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "Quer voar", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<<<<<<<<QUIZ MÚSICA>>>>>>>>>>>>>>>>>>>\n"
                +"<>   Qual música individual mais escutada do   <>\n"
                +"<>  artista Matuê?                             <>\n"
                +"<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		//fim pergunta 9
	
		//inicio pergunta 10
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "Derek", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "Mateca", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "Matue", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "Raffa Moreira", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<<<<<<<<QUIZ MÚSICA>>>>>>>>>>>>>>>>>>>\n"
		           +"<>	Quem foi o pioneiro a trazer a cultura <>\n"
		           +"<> do Trap para o Brasil?                      <>\n"
		           +"<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		//fim pergunta 10
		colListaTemas.add(objTema);
	}
	
	//COPA DO MUNDO
	public void CarregarCopaDoMundo() {

		colPerguntas = new ArrayList<pergunta>();
		
		objTema = new Tema(2, "COPA DO MUNDO", colPerguntas);
		//Inicio Pergunta 1
		colRespostas = new ArrayList<resposta>();
		objresposta = new resposta(1, "2 títulos", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "4 títulos", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "3 títulos", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "5 títulos", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<QUIZ COPA DO MUNDO>>>>>>>>>>>>\n"
                +"<>    Quantos títulos de Copa do Mundo  <>\n"
                +"<> tem o Brasil?                        <>\n"
                +"<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>\n",  colRespostas);
		
		colPerguntas.add(objPergunta);
		
		//Fim pergunta 1
		
		//Inicio Pergunta 2
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "Estados Unidos", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "Argentina", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "Italia", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "Uruguai", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<QUIZ COPA DO MUNDO>>>>>>>>>>>>>\n"
		          +"<>   Qual foi a primeira seleção a ganhar<>\n"
		          +"<> uma Copa do Mundo?                    <>\n"
		          +"<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		
		//Fim pergunta 2
		
		//Inicio Pergunta 3
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "1970", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "1962", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "1994", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "1958", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<<<QUIZ COPA DO MUNDO>>>>>>>>>>>\n"
                +"<>   Quando foi que o Brasil ganhou sua  <>\n"
                +"<> primeira Copa Do Mundo?               <>\n"
                +"<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		
		//Fim pergunta 3
		
		//Inicio Pergunta 4
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "1 gol", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "nenhum gol", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "3 gols", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "2 gols", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<<<<<QUIZ COPA DO MUNDO>>>>>>>>>>>>>>\n"
                +"<>   Quantos gols Ronaldo fez na final da     <>\n"
                +"<> Copa do Mundo de 2002 contra a Alemanha?   <>\n"
                +"<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		
		//fim pergunta 4
		
		//inicio pergunta 5
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "Bélgica e Alemanha", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "Brasil e França", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "Argentina e Chile", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "Croácia e França", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<<<<<<<<<QUIZ COPA DO MUNDO>>>>>>>>>>>>>>>>>>>\n"
                +"<>  Quais foram as duas seleções finalistas da         <>\n"
                +"<> copa do Mundo de 2018?                              <>\n"
                +"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		//fim pergunta 5
		
		//inicio pergunta 6
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "Brasil", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "Argentina", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "Italia", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "Espanha", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<<<<<QUIZ COPA DO MUNDO>>>>>>>>>>>>>>>>\n"
                +"<> Qual foi a seleção campeã da copa do mundo	<>\n"
                +"<> de 2010?                                     <>\n"
                +"<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		//fim pergunta 6
		
		//inicio pergunta 7
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "2002", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "1998", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, " 2006", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "1994", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<<<<<QUIZ COPA DO MUNDO>>>>>>>>>>>>>>>\n"
                +"<> Em que ano a seleção Brasileira conquistou  <>\n"
                +"<> o tetra?                                    <>\n"
                +"<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		//fim pergunta 7
		
		//inicio pergunta 8
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "Brasil", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "Coreia", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "México", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "Uruguai", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<<<<<QUIZ COPA DO MUNDO>>>>>>>>>>>>>>>\n"
                +"<> Onde foi a primeira edição da Copa do Mundo?<>\n"
                +"<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		//fim pergunta 8
		
		//inicio pergunta 9
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "Marcos", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "Cássio", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "Rogério Ceni", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "Dida", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<<<<<QUIZ COPA DO MUNDO>>>>>>>>>>>>>>>\n"
                +"<> Qual o nome do Goleiro Titular da seleção   <>\n"
                +"<>  Brasileira na copa de 2006?                <>\n"
                +"<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		//fim pergunta 9
	
		//inicio pergunta 10
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "9 gols", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "20 gols", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "4 gols", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "13 gols", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<<<<<QUIZ COPA DO MUNDO>>>>>>>>>>>>>>\n"
                +"<>   Quantos gols o Pelé fez na copa de 1958? <>\n"
                +"<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		//fim pergunta 10
	 //TODO montar perguntas e respostas
		colListaTemas.add(objTema);
	}
	
	public void CarregarCapitais() {

		colPerguntas = new ArrayList<pergunta>();
		
		objTema = new Tema(3, "CAPITAIS", colPerguntas);
		//Inicio Pergunta 1
		colRespostas = new ArrayList<resposta>();
		objresposta = new resposta(1, "Maringá", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "Londrina", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "Cascavel", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "Curitiba", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<QUIZ CAPITAIS>>>>>>>>>\n"
                +"<>Qual a capital do Paraná ? <>\n"               
                +"<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>\n",  colRespostas);
		
		colPerguntas.add(objPergunta);
		
		//Fim pergunta 1
		
		//Inicio Pergunta 2
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "São Gabriel do Oeste", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "Três Lagoas", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "Miranda", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "Campo Grande", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<<<<QUIZ CAPITAIS>>>>>>>>>>>>>>>\n"
		          +"<> Qual a capital do Mato Grosso do Sul ?<>\n"
		          +"<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		
		//Fim pergunta 2
		
		//Inicio Pergunta 3
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "Caldas Novas", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "Brasilia", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "Rio Verde", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "Goiânia ", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<QUIZ CAPITAIS>>>>>>>>>\n"
                +"<>   Qual a capital de Goiás? <>\n"
                +"<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		
		//Fim pergunta 3
		
		//Inicio Pergunta 4
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "Estância", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "Lagarto", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "Nossa Sra.da Glória", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "Aracajú", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<QUIZ CAPITAIS>>>>>>>>>>>\n"
                +"<>   Qual a capital do Sergipe ? <>\n"
                +"<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		
		//fim pergunta 4
		
		//inicio pergunta 5
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "Casa Nova", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "Paulo Afonso", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "Petrolina", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "Recife", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<QUIZ CAPITAIS>>>>>>>>>>>>\n"
                +"<>  Qual a capital do Pernambuco ? <>\n"
                +"<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		//fim pergunta 5
		
		//inicio pergunta 6
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "Piauí", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "Palmas", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "Pacaraima", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "Rio Branco", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<QUIZ CAPITAIS>>>>>>>>\n"
                +"<> Qual a capital do Acre? <>\n"
                +"<<<<<<<<<<<<<<<>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		//fim pergunta 6
		
		//inicio pergunta 7
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "Bom Jesus", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "Flora Rica", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "Fortaleza", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "Belém", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<QUIZ CAPITAIS>>>>>>>>\n"
	                +"<> Qual a capital do Pará? <>\n"
	                +"<<<<<<<<<<<<<<>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		//fim pergunta 7
		
		//inicio pergunta 8
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "Osasco", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "Maracanaú", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "Porto Alegre", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "São Paulo", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<QUIZ CAPITAIS>>>>>>>>>>\n"
                +"<> Qual a capital de São Paulo? <>\n"
                +"<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		//fim pergunta 8
		
		//inicio pergunta 9
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "Maceió", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "Curitiba", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "Caiabu", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "Cuiaba", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<QUIZ CAPITAIS>>>>>>>>>>>>\n"
                +"<>  Qual a capital de Mato Grosso? <>\n"
                +"<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		//fim pergunta 9
	
		//inicio pergunta 10
		colRespostas = new ArrayList<resposta>();
		
		objresposta = new resposta(1, "Potim", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(2, "Palmares", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(3, "Porto Alegre", false);
		colRespostas.add(objresposta);
		objresposta = new resposta(4, "Palma", true);
		colRespostas.add(objresposta);
				
		objPergunta = new pergunta("<<<<<<<<<<<<QUIZ CAPITAIS>>>>>>>>>>\n"
                +"<>   Qual a capital de Tocantis? <>\n"
                +"<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>\n",  colRespostas);
		colPerguntas.add(objPergunta);
		colRespostas = new ArrayList<resposta>();
		
	 //TODO montar perguntas e respostas
		colListaTemas.add(objTema);
	}
	
	public Tema getTema(int ID) {
		for (Tema t : this.colListaTemas) {
			if (ID == t.ID) {
				return t;
			}
		}
		return null;
	}
}
