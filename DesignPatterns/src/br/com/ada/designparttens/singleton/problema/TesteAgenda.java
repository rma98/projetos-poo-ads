package br.com.ada.designparttens.singleton.problema;

public class TesteAgenda {
	
	public static void main(String[] args) {
		reservaDia("Sexta-feira");
		reservaDia("Sábado");
	}
	
	public static void reservaDia(String dia) {
		Agenda agenda = new Agenda();
		agenda.ocupa(dia);
		System.out.println(agenda.getDias());
	}
	
}
