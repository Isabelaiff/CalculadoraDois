public class CalculadoraDoisTeste {
    public static void main(String[] args) {
        CalculadoraDois calculadora = new CalculadoraDois();

        double numero1 = 10.5;
        double numero2 = 5.2;
        int operacao = 1; // 1 para soma

        calculadora.executarCalculadora(numero1, numero2, operacao);
    }
}
