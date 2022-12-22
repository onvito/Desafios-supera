package desafios;

/*
DESAFIO 1
Considerando a entrada de valores inteiros não negativos, ordene estes valores segundo
o seguinte critério:
• Primeiro os Pares
• Depois os Ímpares
Sendo que deverão ser apresentados os pares em ordem crescente e depois os ímpares
em ordem decrescente.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class desafio1 {
	
	public static void main(String[] args) throws IOException { 					//Utilizando IOException caso estoure erro no fluxograma
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  	//BufferedReader recebe o texto de um fluxo de entrada de caracteres e armazenas os mesmos pra ler depois
        StringTokenizer st = new StringTokenizer(br.readLine()); 					//Utilizando StringTokenizer para retornar todo o texto separado por linhas
        int eachLine = Integer.parseInt(st.nextToken());							//Convertendo as linhas em um int
        
        List<Integer> listagemNumeros = new ArrayList<>();							//Criando um array pra receber a listagem de numeros
        
        for (int i = 0; i < eachLine; i++) {										//Criando um laço de repetição pra trabalhar com o fluxo recebido
            st = new StringTokenizer(br.readLine());
            listagemNumeros.add(Integer.parseInt(st.nextToken()));					//Pra cada linha, adicionar um int no array criado
        }
        var pares = listagemNumeros.stream().filter(l -> l % 2 == 0).sorted()
        		.collect(Collectors.toList()); 		//Processando os dados de forma declarativa (.stream) e filtrando os mesmos(.filter) para trazer os pares e depois ordenando-os de forma crescente
        var impares = listagemNumeros.stream().filter(l -> l % 2 != 0).sorted(Comparator.reverseOrder())
        		.collect(Collectors.toList());		//Mesmo processo mas agora filtrando os impares e ordenando-os de forma decrescente
        	
        				
        List<Integer> total = new ArrayList<>();	//Criando um array pra receber o total dos items adicionados acima				
        total.addAll(pares);						//Adicionando os pares
        total.addAll(impares);						//Adicionando os impares
        total.forEach(System.out::println);			//Printando no console o resultado das adições feita no ultimo array criado
    }

}