import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo à Calculadora!");
        System.out.println("Escolha a operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        
        int escolha = scanner.nextInt();
        
        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();
        
        double resultado;
        String operacao = "";
        
        switch (escolha) {
            case 1:
                resultado = numero1 + numero2;
                operacao = "adição";
                break;
            case 2:
                resultado = numero1 - numero2;
                operacao = "subtração";
                break;
            case 3:
                resultado = numero1 * numero2;
                operacao = "multiplicação";
                break;
            case 4:
                if (numero2 == 0) {
                    System.out.println("Erro: divisão por zero!");
                    return;
                }
                resultado = numero1 / numero2;
                operacao = "divisão";
                break;
            default:
                System.out.println("Escolha inválida!");
                return;
        }
        
        System.out.println("O resultado da " + operacao + " é: " + resultado);
        
        scanner.close();
    }
}
