package exa.ubi.revision;

import java.util.Scanner;

public class MenuPrincipal {
	public Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuPrincipal objMain = new MenuPrincipal();
		objMain.mostrarMenu();
	}

	public void mostrarMenu(){
		MenuPrincipal objMenu = new MenuPrincipal();
		String opcion;	// En esta variable guardo la opción que introducirá el usuario

		System.out.println("MENU PRINCIPAL");
		System.out.println("--------------");
		System.out.println("1. REVISAR KIDS");
		System.out.println("2. REVISAR TEENS");
		System.out.println("3. REVISAR YOUTH");
		System.out.println("4. REVISAR CONVERSATION");
		System.out.println("----------------------------------------------");
		System.out.println("X. Salir");
		System.out.print("\n -> ");

		opcion = sc.next();

		// Llamo al método ejecutarAccion para que ejecute la opción elegida
		objMenu.ejecutarAccion(opcion);
	}
	// Dependiendo de la opción elegida por el usuario se llevará a cabo una acción u otra
	public void ejecutarAccion(String accion){
		MenuPrincipal objEjec = new MenuPrincipal();
		Kids kids=new Kids();
		Teens teens=new Teens();
		Youth youth=new Youth();
		Conversation conv=new Conversation();
		
		
		accion = accion.toUpperCase();	// Me aseguro de convertir las cadenas a mayúsculas

		switch (accion) {
		case "1":
			kids.revisar_kids();
			objEjec.mostrarMenu();
			break;
		case "2":
			teens.revisar_teens();
			objEjec.mostrarMenu();
			break;
		case "3":
			youth.revisar_youth();
			objEjec.mostrarMenu();
			break;
		case "4":
			conv.revisar_conv();
			objEjec.mostrarMenu();
			break;
		case "X":
			// Antes de salir cierro el objeto de tipo Scanner sc
			System.out.println("Hasta luego");
			sc.close();
			System.exit(0);
			break;
		default:
			// Si el usuario introduce una opción no contemplada muestro un mensaje de error
			System.out.println("OPCIÓN NO VÁLIDA, ELIJA OTRA.\n");
			objEjec.mostrarMenu();
		}
	}
	
}
