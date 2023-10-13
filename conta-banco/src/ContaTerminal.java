import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:
        //Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário
        //Obter pela classe Scanner os valores digitados no terminal
        System.out.println("Digite o número da sua conta: ");
        int conta = sc.nextInt();

        System.out.println("Digite a sua agência: ");
        String agencia = sc.next();

        sc.nextLine();
        System.out.println("Digite o seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite o saldo da sua conta: ");
        double saldo = sc.nextDouble();

        //Exibir a mensagem da conta criada
        System.out.println("Olá "+ nomeCliente +", obrigado(a) por criar uma conta em nosso banco,"+ 
        " sua agência é "+ agencia +", conta "+ conta +" e seu saldo de R$ "+ saldo +" já está disponível"+
        " para saque. Grato(a) pela preferência!");

        sc.close();
    }
}
