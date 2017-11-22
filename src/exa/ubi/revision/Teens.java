package exa.ubi.revision;

import java.util.Scanner;

public class Teens {
	int uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, diez, suma;
	public Scanner sc = new Scanner(System.in);
	int lista[] = new int[10];

	public void revisar_teens(){
		System.out.print("¿Cuantas preguntas han respondido bien?\n");
		int cp=sc.nextInt();
		
		if (cp>0 && cp<=10) {
		for(int i=0;i<cp;i++) {
			System.out.print("Inserte el número de la pregunta correcta");
			System.out.print("\n -> ");
			lista[i]=sc.nextInt();
		}
		
		for (int i=0;i<cp;i++) {
			int pregunta=lista[i];
			
			if (pregunta==1) {
				uno=10;
			} else if(pregunta==2){
				dos=20;
			}else if (pregunta==3){
				tres=5;
			}
			else if(pregunta==4) {
				cuatro=5;
			} else if (pregunta==5) {
				cinco=10;
			} else if (pregunta==6) {
				seis=20;
			} else if(pregunta==7) {
				siete=10;
			}else if(pregunta==8) {
				ocho=10;
			}else if(pregunta==9) {
				nueve=5;
			}else if(pregunta==10) {
				diez=5;
			}
			
		suma=uno+dos+tres+cuatro+cinco+seis+siete+ocho+nueve+diez;
	}
	
	if (suma<=70) {
		System.out.println("Puntaje obtenido: "+suma+"% "+" SE QUEDA DENTRO DEL NIVEL\n");
	}
	else if (suma>70) {
		System.out.println("Puntaje obtenido: "+suma+"% "+" DEBE PRESENTARSE OTRO NIVEL PARA VERIFICAR NIVEL\n");
	}
		}
		else {
			System.out.println("EL MAXIMO DE PREGUNTAS ES 10 (Los examenes no contienen más de 10 preguntas)");
		}
	}
}
