public class Divisao implements Operacao {

    @Override
    public double calcular(double valor1, double valor2) {
        if(valor2 != 0){
            return valor1 / valor2;
        }else{
            throw new IllegalArgumentException("Não é possível dividir por zero");
        }
    }
}
