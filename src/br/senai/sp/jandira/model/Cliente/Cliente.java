package br.senai.sp.jandira.model.Cliente;

import br.senai.sp.jandira.Pessoa;

public class Cliente extends Pessoa {

	private double salario;

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}
	

}
