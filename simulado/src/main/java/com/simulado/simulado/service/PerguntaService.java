package com.simulado.simulado.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simulado.simulado.DTO.PerguntaDTO;
import com.simulado.simulado.repository.PerguntaRespostaRepository;

@Service
public class PerguntaService {
	
	@Autowired
	PerguntaRespostaRepository perguntaRespostaRepository;
	
	
	public PerguntaDTO buscarPerguntaRespostaAleatoria() {

		PerguntaDTO perguntaRespostas = new PerguntaDTO();
		List<String> listaRespostas = new ArrayList<>();
		
		int idAleatorio = gerarIdAleatorio(1, 3);
		Long id = Long.valueOf(idAleatorio);
		
		List<PerguntaDTO> perguntaDTO = perguntaRespostaRepository.buscarPerguntaResposta(id);
		
		for (PerguntaDTO resposta : perguntaDTO) {
			listaRespostas.add(resposta.getResposta());
		}
		
		perguntaRespostas.setPergunta(perguntaDTO.get(0).getPergunta());
		perguntaRespostas.setRespostas(listaRespostas);
		
		return perguntaRespostas;
	}

	private int gerarIdAleatorio(int a, int b) {
		final int min = Math.min(a, b);
	    final int max = Math.max(a, b);

	    Random r = new Random();
	    
	    return min + r.nextInt((max - min) + 1);
	}


	public PerguntaDTO buscarPorId(Long idPergunta) {

		PerguntaDTO perguntaRespostas = new PerguntaDTO();
		List<String> listaRespostas = new ArrayList<>();
		
		List<PerguntaDTO> perguntaDTO = perguntaRespostaRepository.buscarPerguntaResposta(idPergunta);
		
		for (PerguntaDTO resposta : perguntaDTO) {
			listaRespostas.add(resposta.getResposta());
		}
		
		perguntaRespostas.setPergunta(perguntaDTO.get(0).getPergunta());
		perguntaRespostas.setRespostas(listaRespostas);
		
		return perguntaRespostas;
	}
	
	public PerguntaDTO buscarPorIds(List<Long> idsPergunta) {
		
		Long idPergunta = perguntaRespostaRepository.selecionarPerguntaValida(idsPergunta);
	
		return buscarPorId(idPergunta);
	}
	
}
