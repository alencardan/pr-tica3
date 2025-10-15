public class Q2{
    public static void main(String[] args) throws InterruptedException {

        System.out.println("=== Questão 2: Laço WHILE ===\n");

        // a) Imprima até "valor2" (exemplo: 10)
        System.out.println("a) Imprime até valor2 (10):");
        int i = 0;
        while (i <= 10) {
            System.out.println("Valor: " + i);
            Thread.sleep(500);
            i++;
        }

        // b) Comece a partir de "valor1" (exemplo: começa em 5)
        System.out.println("\n\nb) Começa a partir de valor1 (5):");
        i = 5;
        while (i <= 10) {
            System.out.println("Valor: " + i);
            Thread.sleep(500);
            i++;
        }

        // c) Imprima os valores de dois em dois
        System.out.println("\n\nc) Imprime de dois em dois:");
        i = 0;
        while (i <= 10) {
            System.out.println("Valor: " + i);
            Thread.sleep(500);
            i += 2;
        }

        // d) Imprima começando em 10 e terminando em 0
        System.out.println("\n\nd) Imprime de 10 até 0:");
        i = 10;
        while (i >= 0) {
            System.out.println("Valor: " + i);
            Thread.sleep(500);
            i--;
        }
    }
}
