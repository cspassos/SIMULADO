package com.simulado.simulado.Enum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;

//@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum StatusRespostaEnum {
	
	//VERDADEIRO
	V,
	//FALSO
	F
	
	
//	VERDADEIRO("V", "Verdadeiro"),
//	FALSO("F", "Falso");
//	
//	private String id;
//	private String descricao;
//	
//	private StatusRespostaEnum(String id, String descricao) {
//		this.id = id;
//		this.setDescricao(descricao);
//	}
//	
//	@JsonCreator
//	public static StatusRespostaEnum parse(String value) {
//		for (StatusRespostaEnum tipo : StatusRespostaEnum.values()) {
//			if(tipo != null && tipo.getId().equalsIgnoreCase(value)){
//				return tipo;
//			}
//		}
//		return null;
//	}
//	
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public String getDescricao() {
//		return descricao;
//	}
//
//	public void setDescricao(String descricao) {
//		this.descricao = descricao;
//	}
}
