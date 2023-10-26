import java.util.*;
public class q1l1
{
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args){
        int vetA[] = new int[8];
        int vetB[] = new int[8];

        System.out.println("Preenchimento do vetor A:\n");
        entradaVet(vetA);

        int calculaVetB[] = calculaVetorB(vetA, vetB);

        System.out.println("Exibição do vetor B:\n");
        exibeVetor(vetA, calculaVetB);

    }
    public static void entradaVet(int vetA[]){
        for(int i = 0; i < vetA.length; i++){
            System.out.print("Digite o valor da matriz "+(i+1)+": ");
            vetA[i] = ler.nextInt();
        }
        System.out.println();
    }
    public static int[] calculaVetorB(int vetA[], int vetB[]){
        for(int i = 0; i < vetA.length; i++){
            vetB[i] = vetA[i] * 3;
        }
        return vetB;
    }
    public static void exibeVetor(int vetA[],int vetB[]){
        for(int i = 0; i < vetA.length; i++){
            System.out.println("O vetor B é "+ vetA[i] +" * 3 = "+ vetB[i]);
        }
    }
}