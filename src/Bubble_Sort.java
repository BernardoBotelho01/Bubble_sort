import java.util.Scanner;
public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int max;
        int aux = 0;
        System.out.print("Digite o tamanho do vetor para ser ordenado: ");
        max = teclado.nextInt();
        int[] vetor = new int[max];
        System.out.println();
        System.out.println("Digite os numeros para vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = teclado.nextInt();
        }
        System.out.println("Vetor desordenado");
        for (int imprimir : vetor) {
            System.out.print("["+imprimir+"]"+" ");
        }
        System.out.println();
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
            System.out.println();
            System.out.println("Vetor sendo ordenado a cada iteração "+(i+1));
            for (int imprimir : vetor) {
                System.out.print("["+imprimir+"]"+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Vetor Ordenado");
        for (int imprimir : vetor) {
            System.out.print("["+imprimir+"]"+" ");
        }
    }
}