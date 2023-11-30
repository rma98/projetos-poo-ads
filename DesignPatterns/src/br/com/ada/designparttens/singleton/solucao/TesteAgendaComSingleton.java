package br.com.ada.designparttens.singleton.solucao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TesteAgendaComSingleton {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		/*AgendaSingletonEAGER agenda1 = AgendaSingletonEAGER.getInstance();
		AgendaSingletonEAGER agenda2 = AgendaSingletonEAGER.getInstance();
		System.out.println(agenda1);
		System.out.println(agenda2);
		reservaDiaEAGER("Sexta-feira");
		reservaDiaEAGER("Sábado");
		
		AgendaSingletonLAZY agenda1 = AgendaSingletonLAZY.getInstance();
		AgendaSingletonLAZY agenda2 = AgendaSingletonLAZY.getInstance();
		System.out.println(agenda1);
		System.out.println(agenda2);
		
		reservaDiaLAZY("Sexta-feira");
		reservaDiaLAZY("Sábado");
		
		// reflection
		Constructor<AgendaSingletonLAZY> construtorTravesso = AgendaSingletonLAZY.class.getDeclaredConstructor();
		construtorTravesso.setAccessible(true);
		AgendaSingletonLAZY agendaTravessa = construtorTravesso.newInstance();
		AgendaSingletonLAZY agendaTravessa2 = construtorTravesso.newInstance();
		
		System.out.println(agendaTravessa);
		System.out.println(agendaTravessa2);*/
		
		AgendaSingletonEnum agenda1 = AgendaSingletonEnum.getInstance();
		AgendaSingletonEnum agenda2 = AgendaSingletonEnum.getInstance();
		System.out.println(agenda1.hashCode());
		System.out.println(agenda2.hashCode());
		
		reservaDiaEnum("Sexta-feira");
		reservaDiaEnum("Sábado");
		
		// reflection
		/*Constructor<AgendaSingletonEnum> construtorTravesso = AgendaSingletonEnum.class.getDeclaredConstructor();
		construtorTravesso.setAccessible(true);
		AgendaSingletonEnum agendaTravessa = construtorTravesso.newInstance();
		AgendaSingletonEnum agendaTravessa2 = construtorTravesso.newInstance();
		
		System.out.println(agendaTravessa.hashCode());
		System.out.println(agendaTravessa2.hashCode());*/
	}
	
	public static void reservaDiaEAGER(String dia) {
		AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
		agenda.ocupa(dia);
		System.out.println(agenda.getDias());
	}
	
	public static void reservaDiaLAZY(String dia) {
		AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
		agenda.ocupa(dia);
		System.out.println(agenda.getDias());
	}
	
	public static void reservaDiaEnum(String dia) {
		AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance();
		agenda.ocupa(dia);
		System.out.println(agenda.getDias());
	}
	
}
