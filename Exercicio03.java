/**Calculo para Soma de dois valores
 * @author vinicius.marques
 */

package aula1;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um valor : ");
	int valor1 = sc.nextInt();
	
	System.out.println("Digite um segundo valor : ");
	int valor2 = sc.nextInt();
	
	int resultado = valor1+valor2;
			
	System.out.println("A soma dos valores digitados é : "+resultado);
	
	sc.close();
	}
}