package com.simulado.simulado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simulado.simulado.DTO.PerguntaDTO;
import com.simulado.simulado.service.PerguntaService;

@Controller
@CrossOrigin("*")
@RequestMapping(value="/pergunta")
public class PerguntaRespostaController {

	@Autowired
	private PerguntaService perguntaService;
	
	@RequestMapping(value="/buscaAleatoria", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PerguntaDTO> buscaAleatoria(){
		PerguntaDTO retorno = perguntaService.buscarPerguntaRespostaAleatoria();
		return new ResponseEntity<PerguntaDTO>(retorno, HttpStatus.OK);
	}
	
	@RequestMapping(value="/buscarPorId/{idPergunta}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PerguntaDTO> buscarPorId(@PathVariable Long idPergunta){
		PerguntaDTO retorno = perguntaService.buscarPorId(idPergunta);
		return new ResponseEntity<PerguntaDTO>(retorno, HttpStatus.OK);
	}
	
	@RequestMapping(value="/buscarPorIds/{idsPergunta}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PerguntaDTO> buscarPorPerguntasDisponiveis(@PathVariable List<Long> idsPergunta){
		PerguntaDTO retorno = perguntaService.buscarPorIds(idsPergunta);
		return new ResponseEntity<PerguntaDTO>(retorno, HttpStatus.OK);
	}
}
