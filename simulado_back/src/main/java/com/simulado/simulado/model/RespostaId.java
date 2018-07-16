package com.simulado.simulado.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.springframework.data.annotation.Id;

@Embeddable
public class RespostaId implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name ="ID_RESPOSTA")
	private Long idRespota;
	
	@Column(name ="ID_PERGUNTA")
	private Long idPergunta;

	public Long getIdRespota() {
		return idRespota;
	}

	public void setIdRespota(Long idRespota) {
		this.idRespota = idRespota;
	}

	public Long getIdPergunta() {
		return idPergunta;
	}

	public void setIdPergunta(Long idPergunta) {
		this.idPergunta = idPergunta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
