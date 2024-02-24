/**Calculo para exibir o número sucessor do digitado
 * @author vinicius.marques
 */

package aula1;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int valor = sc.nextInt()+1;
		
		System.out.println("O sucessor do número digitado é: " + valor);
	
	sc.close();
	}
}
