import java.util.Scanner;

public class BubbleSort{
    public static void main(String[] args) {
        //Declaração de variáeaveis 
        //int n1, n2, n3, n4;
        int[] num; //= new int[4];

        //Construção do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentação
        System.out.println("\n\t\t\t --Ordenação de números com Bubble Sort --\n");

        //Quantos números?
        System.out.print("Quantos números deseja ordenar:");
        int qtd = entrada.nextInt();

        //Definindo o comprimento do vetor 
        num = new int[qtd];

        //Entrada de dados
        for(int i = 0; i < num.length; i++){
            System.out.print("Informe o n" + (i+1) +":");
            num[i] = entrada.nextInt();

            }


        /* Obsoleto
        System.out.print("Digite o primeiro número: ");
        n1 = entrada.nextInt();      

        System.out.print("Digite o segundo número: ");
        n2 = entrada.nextInt();
        */


        //Processamento
        for(int i = 0; i < (num.length - 1); i++){
            for (int j = (i+1); j < num.length; j++){
                if (num[i] > num[j]) {
                    int swap = num[j];
                    num[j] = num[i];
                    num[i] = swap;

                }
            }


        }


        /* Obsoleto
        if (n1 > n2) {
            int swap = n2;
            n2 = n1;
            n1 = swap;
            */


        //Saída
        System.out.println("\n");
        for (int i = 0; i < num.length; i++) {
            if(i == (num.length - 1)) {
                System.out.print(num[i]);
            } else {
            System.out.print(num[i] + " , ");
            }
        }

        /* Obsoleto
        System.out.println("\n" + n1 +" ," + n2 + "\n");
        */


         }
    }   


    

