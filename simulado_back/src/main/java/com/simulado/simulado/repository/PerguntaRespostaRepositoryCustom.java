package com.simulado.simulado.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;

public interface PerguntaRespostaRepositoryCustom {

	Long selecionarPerguntaValida(@Param("idsPergunta") List<Long> idsPergunta);
}
