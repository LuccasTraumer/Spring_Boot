package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.sun.istack.NotNull;

import br.com.alura.forum.model.Topico;

public class TopicoDto {
	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	
	public TopicoDto(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();
	}
	public Long getId() {return this.id;}
	public String getTitulo() {return this.titulo;}
	public String getMensagem() {return this.mensagem;}
	public LocalDateTime getDataCriacao() {return this.dataCriacao;}

	
	public static List<TopicoDto> converter(List<Topico> topico){
		return topico.stream().map(TopicoDto::new).collect(Collectors.toList());
	}

}
