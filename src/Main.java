import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        // Linha 15, onde o método é chamado:
        String name = input("Qual é o seu nome?");

        if (name.equals("Paulo")) {
            System.out.println(name);
        } else {
            System.out.println("Teste");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        somar();
        executarLoop();
    }

    // ESTA PARTE ABAIXO É O QUE O COMPILADOR PROCURA:
    public static String input(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void somar() {
        double numero = 452.3;
        double numero2 = 87.3;
        double resultado = numero + numero2;
        System.out.println(resultado);
    }

    public static void executarLoop() {
        System.out.println("\n--- Executando Loop WHILE ---");
        int num = 10;

        while (num <= 56 || num > 2 ) {
                System.out.println("Contando (WHILE): " + num);
                num++;
        }
        System.out.println("Loop finalizado! O valor final de num é: " + num);
    }
}