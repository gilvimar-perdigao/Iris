package banco;

import java.util.Scanner;

public class Cofre {

	public static void main(String[] args) {
		
		double dolar = 5;
			   dolar=dolar *4.80;
	    String moeda= "Dólar";
			
		double euro = 10;
			   euro = euro *5.40;
	    String moeda1= "Euro";	   
		
		double pesoArgentino = 1000;
			   pesoArgentino=pesoArgentino / 0.02;
	    String moeda2= "Peso Argentino";
	   
			   
			   Scanner soma = new Scanner(System.in);
			   System.out.println("Digite Moeda, e valor");
			   
			   dolar=soma.nextDouble();
			   euro=soma.nextDouble();
			   pesoArgentino=soma.nextDouble();
			   
			   System.out.println("Euro:"+ euro);
			   System.out.println("PesoArgentino:"+pesoArgentino);
			   System.out.println("Dolar:"+dolar); 
			   System.out.printf("Moeda:%d\n", moeda);
		
				
		
	}

}
