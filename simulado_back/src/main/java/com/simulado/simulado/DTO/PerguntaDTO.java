package com.simulado.simulado.DTO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PerguntaDTO {
	
	@JsonInclude(Include.NON_NULL)
	private String pergunta;

	@JsonInclude(Include.NON_NULL)
	private String resposta;
	
	@JsonInclude(Include.NON_NULL)
	private List<String> respostas;

	public PerguntaDTO() {
		super();
	}
	
	public PerguntaDTO(String pergunta, String resposta) {
		super();
		this.pergunta = pergunta;
		this.resposta = resposta;
	}
	
	//GET E SET
	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public List<String> getRespostas() {
		return respostas;
	}

	public void setRespostas(List<String> respostas) {
		this.respostas = respostas;
	}

}
