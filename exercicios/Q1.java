public class Q1 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("=== Questão 1: Laço FOR ===\n");

        // a) Imprima valores até "valor2" (exemplo: até 10)
        System.out.println("a) Imprime até valor2 (10):");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Valor: " + i);
            Thread.sleep(500); // meio segundo
        }

        // b) Comece a contar a partir de "valor1" (exemplo: começa em 5)
        System.out.println("\n\nb) Começa a partir de valor1 (5):");
        for (int i = 5; i <= 10; i++) {
            System.out.println("Valor: " + i);
            Thread.sleep(500);
        }

        // c) Imprima os valores de dois em dois
        System.out.println("\n\nc) Imprime de dois em dois:");
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Valor: " + i);
            Thread.sleep(500);
        }

        // d) Imprima os valores começando em 10 e terminando em 0
        System.out.println("\n\nd) Imprime de 10 até 0:");
        for (int i = 10; i >= 0; i--) {
            System.out.println("Valor: " + i);
            Thread.sleep(500);
        }
    }
}
