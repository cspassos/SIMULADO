package com.simulado.simulado.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "PERGUNTA")
public class Pergunta {

	@Id
	@Column(name ="ID_PERGUNTA", nullable = false)
	private Long idPergunta;

	@Column(name ="PERGUNTA", nullable = false)
	private String pergunta;
	
	@OneToMany(mappedBy = "pergunta", targetEntity = Resposta.class)
	private List<Resposta> resposta;
	
//GET E SET
	public String getPergunta() { 
		return pergunta;  
	}
	public void setPergunta(String pergunta) { 
		this.pergunta = pergunta;
	}
	public Long getIdPergunta() {
		return idPergunta;
	}
	public void setIdPergunta(Long idPergunta) {
		this.idPergunta = idPergunta;
	}
	public List<Resposta> getResposta() {
		return resposta;
	}
	public void setResposta(List<Resposta> resposta) {
		this.resposta = resposta;
	}
}
