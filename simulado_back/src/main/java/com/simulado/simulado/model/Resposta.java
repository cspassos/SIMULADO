package com.simulado.simulado.model;

import javax.persistence.*;

import com.simulado.simulado.Enum.StatusRespostaEnum;

@Entity
@Table(name = "RESPOSTA")
public class Resposta {

	@EmbeddedId
	private RespostaId id;
	
	@Column(name ="RESPOSTA", nullable = false)
	private String resposta;
	
	@Enumerated(EnumType.STRING)
	@Column(name ="STATUS_RESPOSTA")
	private StatusRespostaEnum statusRespostaEnum;
	
	@ManyToOne
	@JoinColumn(name = "ID_PERGUNTA", nullable = false, updatable = false, insertable = false)
	private Pergunta pergunta;
	
//GET E SET
	public RespostaId getId() {
		return id;
	}

	public void setId(RespostaId id) {
		this.id = id;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public StatusRespostaEnum getStatusRespostaEnum() {
		return statusRespostaEnum;
	}

	public void setStatusRespostaEnum(StatusRespostaEnum statusRespostaEnum) {
		this.statusRespostaEnum = statusRespostaEnum;
	}
}
