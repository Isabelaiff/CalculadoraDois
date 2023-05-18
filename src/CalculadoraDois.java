public class CalculadoraDois {
    public void executarCalculadora(double numero1, double numero2, int operacao) {
        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        System.out.println("O resultado da operação é: " + resultado);
    }
}
