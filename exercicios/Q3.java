public class Q3 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("=== Questão 3: Operador % (Resto da Divisão) ===\n");

        // a) Modifique o programa para que os valores fiquem entre 0 e 2
        for (int i = 0; i < 10; i++) {
            int resto = i % 3; // muda para 3 → valores entre 0, 1 e 2
            System.out.println("Resto da divisão: " + resto);

            // b) Simula "LEDs" acendendo de acordo com o resto
            if (resto == 0) {
                System.out.println("💡 LED 1 aceso (Resto = 0)");
            } else if (resto == 1) {
                System.out.println("💡 LED 2 aceso (Resto = 1)");
            } else if (resto == 2) {
                System.out.println("💡 LED 3 aceso (Resto = 2)");
            }

            System.out.println("-----------------------");
            Thread.sleep(700);
        }

        // c) Programa termina com o último "LED" aceso (simulado)
        System.out.println("\nFim do programa — Último LED permanece aceso 🔴");
    }
}
