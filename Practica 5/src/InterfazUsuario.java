

import java.util.Scanner;

public class InterfazUsuario {
	
	public static String pedirString() {
        Scanner entradaEscaner = new Scanner(System.in); //Creaci�n de un objeto Scanner
        return entradaEscaner.nextLine();
	}
	
	public static int menuUsuario() {
		System.out.println("Men�: ");
		System.out.println("-1: Consultar lista de usuarios.");
		System.out.println("-2: Descargar informaci�n.");
		System.out.println("-3: Cerrar.");
		System.out.println("�Qu� desea hacer? (Introduzca la opci�n deseada 1,2,3)");
		
		Scanner reader = new Scanner(System.in);
		return reader.nextInt();
	}

	public static void mostrar(String mensaje) {
		System.out.println(mensaje);
	}

}
