import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in); 

        System.out.print("Por favor, digitea o número da conta: "); 
        int numeroConta = sc.nextInt();

        System.out.print("Por favor, digite o numero da Agência: ");
        String numeroAgencia = sc.next();
        
        System.out.print("Por favor, digite o seu nome: ");
        String nomeCliente = sc.next();
        sc.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        while (!sc.hasNextDouble()) { 
            System.out.println("Entrada inválida! Digite um número decimal válido.");
            sc.next(); 
        }
        Double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta +" e seu saldo " + saldo +" já está disponível para saque.");
        
         sc.close();
    }
}



