package br.edu.ifpe.action;

public class Main {

	public static void main(String[] args) {
		Action action = new Action("Robson", "16/07/1999", "123.456.789-10");
		
		action.wakeup();
		action.eat();
		action.sleep();
	}

}
