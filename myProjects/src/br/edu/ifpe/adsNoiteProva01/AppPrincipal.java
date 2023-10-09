package br.edu.ifpe.adsNoiteProva01;

import java.util.ArrayList;
import java.util.List;

public class AppPrincipal {
	
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
		
		Reserva reserva = new Reserva("2023-09-25");
		Reserva reserva2 = new Reserva("2023-09-25");
		
		reserva.setFuncionario((Funcionario) funcionario);
		
		reserva.getQuartos().add(quarto);
		reserva.getQuartos().add(quarto2);
		
		reservas.add(reserva);
		reservas.add(reserva2);
		
		Pessoa cliente = new Cliente("Maria", "3692581", 1);
		
		cliente.getReservas().add(reserva);
		
		for (Reserva cl1 : cliente.getReservas()) {
			System.out.println("------------------------------------------------------------");
			System.out.println("Nome do cliente: " + cliente.getNome());
			System.out.println("Rg: " + cliente.getRg());
			System.out.println("Data da reserva: " + cl1.getData());
			System.out.println("------------------------------------------------------------");
			System.out.println("Nome do funcionário: " + cl1.getFuncionario().getNome());
			for (Quarto quar : cl1.getQuartos()) {
				System.out.println("------------------------------------------------------------");
				System.out.println("Nome do Hotel: " + quar.getHotel().getNome());
				System.out.println("Número do Quarto: " + quar.getNumeroDoQuarto());
				System.out.println("Tipo do quarto: " + quar.getTipo());
			}
			System.out.println("------------------------------------------------------------");
		}
		
	}

}
