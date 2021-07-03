package introducao;

public class Temperatura {
public static void main (String[] args ) {
String nome; 
double far, cel, kev;
nome = "Ana";
far= 15;
cel= Math.round (((far-32)/1.8)*100)/100.0;
kev= Math.round ((cel+273.15)*100)/100.0;  
System.out.println (" Olá " + nome + " a temperatura de hoje em c é :" + cel + " e a temperatura em K é: " + kev );

	
}
}
