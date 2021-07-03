package lista1;

import java.util.Scanner;

public class exercicio8 {
public static void main (String[] args ) {
	double custodefabrica, custofinal; 
	Scanner ler= new Scanner(System.in); 
	System.out.println ("qual o valor do custo de fábrica?");
	custodefabrica = ler.nextDouble();
	custofinal= (custodefabrica + (28*custodefabrica/100) + (45*custodefabrica/100));
	System.out.println(" O custo final é de:" + custofinal);
}
}