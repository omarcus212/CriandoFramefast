package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.senai.sp.jandira.model.Cliente.*;

public class Pessoa {

	private String nome;
	private String emial;
	private String dataNascmento;
	private double peso;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setEmial(String emial) {
		this.emial = emial;
	}

	public String getEmial() {
		return emial;
	}

	public void setDataNascmento(LocalDate dataNascmento) {
    
		 
		 
	}

	public String getDataNascmento() {
		return dataNascmento;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

}
