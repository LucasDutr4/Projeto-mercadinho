package application;
import java.util.Scanner;
import java.text.Format;
import java.util.Locale;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CadastroDeProdutos cadastro = new CadastroDeProdutos(10); // Capacidade de 10 produtos

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Exibir produtos cadastrados");
            System.out.println("3. Calcular valor total em estoque");
            System.out.println("4. Sair");
            int opcao = sc.nextInt();
            sc.nextLine();  

            if (opcao == 1) {
                System.out.print("Digite o nome do produto: ");
                String nome = sc.nextLine();

                System.out.print("Digite o preço do produto: ");
                double preco = sc.nextDouble();

                System.out.print("Digite a quantidade em estoque: ");
                int quantidade = sc.nextInt();
                sc.nextLine(); 

                cadastro.cadastrarProduto(nome, preco, quantidade);
            } else if (opcao == 2) {
                cadastro.exibirProdutos();
            } else if (opcao == 3) {
                double total = cadastro.calcularValorTotalEstoque();
                System.out.println("Valor total em estoque: R$ " + total);
            } else if (opcao == 4) {
                System.out.println("Saindo do sistema...");
                break;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

		
		sc.close();
		
	}

}
