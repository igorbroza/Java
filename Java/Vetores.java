public class Vetores{
    public static void main(String args[]){
        int[] vetor;

        vetor = new int[10];

        for(int i = 0;i < 10;i++){
            vetor[i] = i+1;
        }

        for(int i = 0;i < 10;i++){
            System.out.println("vetor["+i+"]="+vetor[i]);
        }
    }
}