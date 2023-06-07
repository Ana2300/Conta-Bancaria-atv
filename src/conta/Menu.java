package conta;

import java.util.Scanner;
import conta.Model.ContaCorrente;
import conta.Model.ContaPoupan�a;
import conta.util.Cores;

public class Menu {
	
	public static void main(String[] args) {
		
				
				// Teste da Classe Conta Corrente
				ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "Jos� da Silva", 1000);
				
				//public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo) {
					//super(numero, agencia, tipo, titular, saldo);
				
		
				
				cc1.visualizar();
				cc1.sacar(12000.0f);
				cc1.visualizar();
				cc1.depositar(1200.0f);
				cc1.visualizar();
				
				
				 // Teste da Classe Conta Poupan�a
				ContaPoupan�a cp1 = new ContaPoupan�a(2, 123, 2, "Maria dos Santos", 10000);
				cp1.visualizar();
		        cp1.sacar(1000.0f);
				cp1.visualizar();
				cp1.depositar(5000.0f);
				cp1.visualizar();
				
				

		while (true) {

			System.out.println(Cores.TEXT_RED + 
					"*****************************************************");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a op��o desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RED);

			
			Scanner leia = new Scanner(System.in);
			int opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu Futuro come�a aqui!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_BLACK + "Criar Conta\n\n");

					break;
				case 2:
					System.out.println(Cores.TEXT_BLUE + "Listar todas as Contas\n\n");

					break;
				case 3:
					System.out.println(Cores.TEXT_BLUE + "Consultar dados da Conta - por n�mero\n\n");

					break;
				case 4:
					System.out.println(Cores.TEXT_BLUE + "Atualizar dados da Conta\n\n");

					break;
				case 5:
					System.out.println(Cores.TEXT_BLUE + "Apagar a Conta\n\n");

					break;
				case 6:
					System.out.println(Cores.TEXT_BLUE + "Saque\n\n");

					break;
				case 7:
					System.out.println(Cores.TEXT_BLUE + "Dep�sito\n\n");

					break;
				case 8:
					System.out.println(Cores.TEXT_BLUE + "Transfer�ncia entre Contas\n\n");

					break;
				default:
					System.out.println(Cores.TEXT_BLUE + "\nOp��o Inv�lida!\n");
					break;
			}
		}
	}

}