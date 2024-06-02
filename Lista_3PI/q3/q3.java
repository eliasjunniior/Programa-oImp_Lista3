import java.util.Scanner;

public class Question03{
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); 
        int[] ava = new int[n]; 
        int maior = 0;
        int menor = 1000;
        int aux = 0;
        
        for(int i=0; i < n;i++){
            ava[i] = s.nextInt();
        }
        
        System.out.print("Avaliacoes ordenadas: ");
        for(int i = 0;i < n;i++){
            for(int j = i + 1 ;j < n;j++){
                if(ava[i] < ava[j]){
                    aux = ava[i];
                    ava[i] = ava[j];
                    ava[j] = aux;
                }
                
            }
            System.out.print(ava[i] + " ");
        }
        
        for(int i =0; i < n;i++){
            if(ava[i] > maior){
                maior = ava[i];
            }else if(ava[i] < menor){
                menor = ava[i];
            }
        }
         System.out.println();
         System.out.println( "Melhor avaliacao: " + maior);
         System.out.println("Pior avaliacao: " + menor);
    
    }
}