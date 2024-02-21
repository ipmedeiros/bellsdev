import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();
        
        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();
        
        int resultado = numero1 + numero2;
        
        System.out.println("A soma dos números é: " + resultado);
        
        scanner.close();
    }
}
