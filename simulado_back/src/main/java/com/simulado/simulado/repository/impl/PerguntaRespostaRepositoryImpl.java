package com.simulado.simulado.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

import com.simulado.simulado.repository.PerguntaRespostaRepositoryCustom;

public class PerguntaRespostaRepositoryImpl implements PerguntaRespostaRepositoryCustom{

	@Autowired
	private EntityManager entityManager; 
	
	@Override
	public Long selecionarPerguntaValida(List<Long> idsPergunta) {
		
		StringBuilder queryPer = new StringBuilder();
		queryPer.append("SELECT pergunta.idPergunta");
		queryPer.append(" FROM Pergunta pergunta");
		queryPer.append(" WHERE pergunta.idPergunta not in (:idsPergunta)");
		queryPer.append(" ORDER BY RAND()");
		
		TypedQuery<Long> typedQuery = entityManager.createQuery(queryPer.toString(), Long.class);
//		typedQuery.setFirstResult(3);
		typedQuery.setMaxResults(1);
		typedQuery.setParameter("idsPergunta", idsPergunta);
		
		return typedQuery.getSingleResult();
	}
	
}
