package desafios;

/*
 DESAFIO 4
	 A sua impressora foi infectada por um vírus e está imprimindo de forma incorreta. 
	 Depois de olhar para várias páginas impressas por um tempo, você percebe que ele 
	 está imprimindo cada linha de dentro para fora. Em outras palavras, a metade 
	 esquerda de cada linha está sendo impressa a partir do meio da página até a 
	 margem esquerda. Do mesmo modo, a metade direita de cada linha está sendo impressa 
	 à partir da margem direita e prosseguindo em direção ao centro da página.
	 Por exemplo a linha:
	 THIS LINE IS GIBBERISH
	 está sendo impressa como:
	 I ENIL SIHTHSIREBBIG S
	 Da mesma foma, a linha " MANGOS " está sendo impressa incorretamente como "NAM  SOG". 
	 Sua tarefa é desembaralhar (decifrar) a string a partir da forma como ela foi impressa 
	 para a sua forma original. Você pode assumir que cada linha conterá um número par de caracteres.
 Entrada
	A entrada contém vários casos de teste. A primeira linha de entrada contém um
	inteiro N que indica a quantidade de casos de teste. Seguem N linhas, cada uma com uma
	frase com no mínimo 2 e no máximo 100 caracteres de letras maiúsculas e espaços que
	deverá ser desembaralhada (decifrada) à partir da forma impressa para a sua forma
	original, conforme especificação acima.
Saída
	Para cada linha de entrada deverá ser impressa uma linha de saída com a frase decifrada,
	conforme a especificação acima.
*/

import java.util.Scanner;

public class desafio4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);			//Inicializando scanner
		int N = leitor.nextInt();							//Obtendo quantidade de casos de teste
		for (int i = 0; i < N; i++) {
			String frase = readLine(leitor);				//Lendo a string
			StringBuilder parte1 = new StringBuilder(frase.substring(0, frase.length() / 2)); //Separando primeira parte
			StringBuilder parte2 = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));	//Separando segunda parte
			parte1.reverse();								//Invertendo primeira parte
			parte2.reverse();								//Invertendo segunda parte
			System.out.println(parte1.toString() + parte2.toString());	//retorna string do objeto concatenado
		}
	}
	
	public static String readLine(Scanner leitor) { 		//Função para ler quebra de linhas 
		String line = leitor.nextLine();
		while (line.isEmpty())
			line = leitor.nextLine();
		return line;
	}
	
}