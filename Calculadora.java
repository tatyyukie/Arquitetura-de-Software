import java.util.Scanner;

public class Calculadora {

    double resultado;

    public double soma(double valor1, double valor2) {
        resultado = valor1 + valor2;
        return resultado;
    }

    public double subtracao(double valor1, double valor2) {
        resultado = valor1 - valor2;
        return resultado;
    }

    public double divisao(double valor1, double valor2) {
        resultado = valor1 / valor2;
        return resultado;
    }

    public double multiplicacao(double valor1, double valor2) {
        resultado = valor1 * valor2;
        return resultado;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.print("Digite o primeiro valor: ");
        double valor1 = s.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double valor2 = s.nextDouble();

        System.out.println("1- Soma");
        System.out.println("2- Subtracao");
        System.out.println("3- Divisao");
        System.out.println("4- Multiplicacao");
        System.out.print("Escolha uma opcao: ");
        int op = s.nextInt();

        switch (op) {
            case 1:
                System.out.println("Resultado: " + calculadora.soma(valor1, valor2));
                break;
            case 2:
                System.out.println("Resultado: " + calculadora.subtracao(valor1, valor2));
                break;
            case 3:
                System.out.println("Resultado: " + calculadora.divisao(valor1, valor2));
                break;
            case 4:
                System.out.println("Resultado: " + calculadora.multiplicacao(valor1, valor2));
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
    }
}