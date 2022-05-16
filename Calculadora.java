import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = s.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double valor2 = s.nextDouble();

        System.out.println("1- Adicao");
        System.out.println("2- Subtracao");
        System.out.println("3- Divisao");
        System.out.println("4- Multiplicacao");
        System.out.print("Escolha uma opcao: ");
        int op = s.nextInt();

        switch (op) {
            case 1:
                System.out.println("Resultado: " + new Adicao().calcular(valor1, valor2));
                break;
            case 2:
                System.out.println("Resultado: " + new Subtracao().calcular(valor1, valor2));
                break;
            case 3:
                System.out.println("Resultado: " + new Divisao().calcular(valor1, valor2));
                break;
            case 4:
                System.out.println("Resultado: " + new Multiplicacao().calcular(valor1, valor2));
                break;
            default:
                System.out.println("Opcao invalida!");
                break;
        }
        s.close();
    }
}