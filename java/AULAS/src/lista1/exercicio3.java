package lista1;

import java.util.Scanner;

public class exercicio3 {
	public static void main (String[] args ) {
		int tempoevento, horas, minutos, segundos;
		Scanner ler= new Scanner(System.in);
		System.out.println ("Digite os segundos do evento:");
		tempoevento = (int) ler.nextInt(); 
		horas= tempoevento / 3600;
		minutos=  (tempoevento %3600) / 60;
		segundos= (tempoevento% 3600) % 60;
		System.out.println (" Horas: " +horas);
		System.out.println (" minutos: "+minutos);
		System.out.println (" segundos: "+segundos);
	}
}
