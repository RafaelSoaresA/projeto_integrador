package projetoIntegrador;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class pergunta {
	String value;
	Collection<resposta>  respostas;
	int respostaQuiz;
	int ID;
	boolean respostaCerta;
	
	public void ValidarResposta(int respostaQuiz) {
		respostaCerta = false;
		this.respostaQuiz = respostaQuiz;
		for (resposta r : this.respostas) {
			if(this.respostaQuiz == r.ID && r.certo) {
				respostaCerta = true;
				break;
			}
		}
	}
	 		
	public pergunta(String value, Collection<resposta> respostas){
		this.value = value;
		this.respostas = respostas;
		this.respostaQuiz = 0;
		Collections.shuffle((List<resposta>) this.respostas);
		
		int seq = 1;
		for (resposta r : this.respostas) {
		    r.ID = seq;
		    seq++;
		}
	}
}
