package com.simulado.simulado.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

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
//	
//	public static void main(String[] args) {
//        Set<Integer> lista = new HashSet<>();
//        lista.add(8);
//        lista.add(17);
//
//        System.out.println(lista.add(8));
//        System.out.println(lista.add(10));
//
//        while(adicionarNumeroRandomico(lista).size() < 30){
//            System.out.println("Gerando os 30 numeros");
//        }
//
//        System.out.println(lista);
//    }
//
//    private static List<Integer> adicionarNumeroRandomico(Set<Integer> lista) {
//        do {
//            System.out.println("Ainda não gerou do-while");
//        } while(lista.add(gerarRandomico()));
//        return lista.stream().collect(Collectors.toList());
//    }
//
//    private static int gerarRandomico() {
//        Random rand = new Random();
//        int randomNum = rand.nextInt((30 - 1) + 1) + 1;
//
//        return randomNum;
//    }
}
