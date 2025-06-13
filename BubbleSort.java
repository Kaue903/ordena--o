import java.util.Scanner;

public class BubbleSort{
    public static void main(String[] args) {
        //Declaração de variáeaveis 
        int n1, n2, n3, n4;

        //Construção do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentação
        System.out.println("\n\t\t\t --Ordenação de números com Bubble Sort --\n");

        System.out.print("Digite o primeiro número: ");
        n1 = entrada.nextInt();             
        System.out.print("Digite o segundo número: ");
        n2 = entrada.nextInt();

        //Processamento
        if (n1 > n2) {
            int swap = n2;
            n2 = n1;
            n1 = swap;

        //Saída
        System.out.println("\n" + n1 +" ," + n2 + "\n");


         }
        
 }
    
}

