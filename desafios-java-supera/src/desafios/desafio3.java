package desafios;

/*
DESAFIO 3
Dado um array de inteiros e um valor alvo, determine o número de pares entre os elementos
do array em que a sua diferença seja igual ao valor alvo.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class desafio3 {
	
	public static void main(String[] args) throws Exception {

		  Scanner receber = new Scanner(System.in);        					//Iniciando o scanner

		  int n;
		  
		  System.out.printf("Digite o tamanho do lista:");
		  n = receber.nextInt();
		             
		  ArrayList<Integer> entrada = new ArrayList<Integer>();		//Array da entrada
		  ArrayList<Integer> nPares = new ArrayList<Integer>();	//Array dos pares
		  ArrayList<Integer> nImpares = new ArrayList<Integer>();	//Array dos impares

		  System.out.println("Informe os numeros da lista:");
		  for (int i = 0; i < n; i++) {
			  receber = new Scanner(System.in);
		      entrada.add(receber.nextInt());								//Criando loop para receber os dados
		      
		      if (entrada.get(i) % 2 == 0) { 
		    	  nPares.add(entrada.get(i));						
		      } else {
		    	  nImpares.add(entrada.get(i));						
		      }       
		  }
		  
		  Collections.sort(nPares);    							//Ordenando pares
		  Collections.sort(nImpares);        						//Ordenando impares
		  Collections.reverse(nImpares);							//invertendo ordem impares

		  System.out.println("Numeros pares:");
		  for (int par : nPares) {
		      System.out.println(par);									//Imprimindo os pares
		  }

		  System.out.println("Numeros impares:");
		  for (int impar : nImpares) {
		      System.out.println(impar);								//Imprimindo os impares
		  }
		  receber.close();												//Fechando scanner
		}

}
