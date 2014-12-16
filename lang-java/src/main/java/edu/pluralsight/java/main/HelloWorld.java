package edu.pluralsight.java.main;

import edu.pluralsight.java.printing.IMachine;
import edu.pluralsight.java.printing.Printer;

public class HelloWorld {

	public static void main(String[] args) {
		IMachine machine = new Printer(true, "MY PRINTER");
		// Machine machine = new Machine(false);

		machine.TurnOn();

	}
}
