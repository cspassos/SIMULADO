package com.simulado.simulado.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.simulado.simulado.DTO.PerguntaDTO;
import com.simulado.simulado.model.Pergunta;

@Repository
public interface PerguntaRespostaRepository  extends JpaRepository<Pergunta, Long>, PerguntaRespostaRepositoryCustom{

	@Query("SELECT new com.simulado.simulado.DTO.PerguntaDTO(pergunta.pergunta, resposta.resposta)"
			+ " FROM Pergunta pergunta"
			+ " INNER JOIN pergunta.resposta resposta"
			+ " WHERE pergunta.idPergunta = :idPergunta")
	List<PerguntaDTO> buscarPerguntaResposta(@Param("idPergunta") Long idPergunta);

}
