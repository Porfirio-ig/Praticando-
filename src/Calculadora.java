import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor1, valor2, valor3, valor4;
		int soma, subtracao, divisao, multiplicacao;
		int opcao;

		
		
		
		System.out.println("Escolha a op��o do calculo que deseja realizar:\n1-Soma\n2-Subtra��o\n3-divis�o\n4-Multiplica��o");
		Scanner leitor = new Scanner(System.in);
		opcao = leitor.nextInt();

switch(opcao) {
case 1:
	System.out.println("Digite o valor 1:");
	valor1 = leitor.nextInt();
	
	System.out.println("Digite o valor 2:");
	valor2 = leitor.nextInt();
	
	soma = valor1 + valor2;
	System.out.println("A soma dos dois valores � " + soma);
break;

case 2: 
	System.out.println("Digite o valor 1:");
	valor1 = leitor.nextInt();
	
	System.out.println("Digite o valor 2:");
	valor2 = leitor.nextInt();
	
	subtracao = valor1 - valor2;
	System.out.println("A subtra��o dos dois valores � " + subtracao);
	break;
	
case 3:
	System.out.println("Digite o valor 1:");
	valor1 = leitor.nextInt();
	
	System.out.println("Digite o valor 2:");
	valor2 = leitor.nextInt();
	
	divisao = valor1 / valor2;
	System.out.println("A divis�o dos dois valores � " + divisao);
	break;
	
case 4: 
	System.out.println("Digite o valor 1:");
	valor1 = leitor.nextInt();
	
	System.out.println("Digite o valor 2:");
	valor2 = leitor.nextInt();
	
	multiplicacao = valor1 * valor2;
	System.out.println("A multiplica��o dos dois valores � " + multiplicacao);
	break;
	default: 
		System.out.println("Op��o invalida");
		break;
}


		
	
		
		


				
	}

}
