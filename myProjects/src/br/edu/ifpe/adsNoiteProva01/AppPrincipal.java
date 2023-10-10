package br.edu.ifpe.adsNoiteProva01;

import java.util.ArrayList;
import java.util.List;

public class AppPrincipal {
	
	static List<Pessoa> pessoas = new ArrayList<>();
	static List<Reserva> reservas = new ArrayList<>();
	static List<Quarto> quartos = new ArrayList<>();

	public static void main(String[] args) {
		Hotel hotel = new Hotel("Hotel 01");
		
		Quarto quarto = new Quarto("Duplo", 01);
		Quarto quarto2 = new Quarto("Simples", 02);
		
		quartos.add(quarto);
		quartos.add(quarto2);
		
		quarto.setHotel(hotel);
		quarto2.setHotel(hotel);
		
		Pessoa funcionario = new Funcionario("Paulo", "1472583", "Recepção");
		
		pessoas.add(funcionario);
		
		Reserva reserva = new Reserva("2023-09-25", (Funcionario) funcionario);
		Reserva reserva2 = new Reserva("2023-09-25", (Funcionario) funcionario);
		
		reserva.getQuartos().add(quarto);
		reserva.getQuartos().add(quarto2);
		
		reservas.add(reserva);
		reservas.add(reserva2);
		
		Pessoa cliente = new Cliente("Maria", "3692581", 1);
		
		pessoas.add(cliente);
		
		
		cliente.getReservas().add(reserva);
		
		for (Pessoa p : pessoas) {
			if (p instanceof Cliente) {
				System.out.println("------------------ CLIENTE -----------------------");
				System.out.println("Nome: " + p.getNome());
				System.out.println("RG: " + p.getRg());
				Cliente cl = (Cliente) p;
				System.out.println("Tipo de Cliente: " + cl.getQuantidadeOcupacoes());
			}
			for (Reserva r : p.getReservas()) {
				System.out.println("------------------ RESERVAS -----------------------");
				System.out.println("Data da Reserva: " + r.getData());
				System.out.println("Nome do funcionário que realizou o atendimento: " + r.getFuncionario().getNome());
				for (Quarto q : r.getQuartos()) {
					System.out.println("------------------ QUARTOS -----------------------");
					System.out.println("Nome do Hotel: " + q.getHotel().getNome());
					System.out.println("Número do quarto: " + q.getNumeroDoQuarto());
					System.out.println("Tipo de Quarto: " + q.getTipo());
				}
			}
		}
		
	}

}
