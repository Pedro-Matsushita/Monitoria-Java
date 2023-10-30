import java.util.*;
public class q2l1
{
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args){
        int vetA[] = new int[5];
        int vetB[] = new int[5];
        int vetC[] = new int[5];

        System.out.println("Preenchimento dos vetores:\n");
        entradaVet(vetA, vetB);
        System.out.println();

        int calcularVetorC[] = calculaVetC(vetA, vetB, vetC);

        System.out.println("Exibição do vetor C:\n");
        exibeVetor(vetA, vetB, vetC);
    }
    public static void entradaVet(int vetA[], int vetB[]){
        Random r = new Random();
        for(int i = 0; i < vetA.length; i++){
            System.out.print("\nO valor do "+ (i+1) +"° vetor A foi preenchido! ");
            vetA[i] = r.nextInt(100);
        }
        System.out.println();
        for(int i = 0; i < vetB.length; i++){
            System.out.print("\nO valor do "+ (i+1) +"° vetor B foi preenchido! ");
            vetB[i] = r.nextInt(100);
        }
        System.out.println();
    }
    public static int[] calculaVetC(int vetA[], int vetB[], int vetC[]){
        for(int i = 0; i < vetA.length; i++){
            vetC[i] = vetA[i] - vetB[i];
        }
        return vetC;
    }
    public static void exibeVetor(int vetA[], int vetB[], int vetC[]){
        for(int i = 0; i < vetC.length; i++){
            System.out.println("O valor do "+ (i+1) +"° vetor é "+ vetA[i] +" - "+ vetB[i] +" = "+ vetC[i]);
        }
        System.out.println();
    }
}