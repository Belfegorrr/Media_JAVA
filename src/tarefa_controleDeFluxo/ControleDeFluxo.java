package Media_JAVA.src.tarefa_controleDeFluxo;
import java.util.Scanner;

public class ControleDeFluxo {
    
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua media final: ");

        int media = s.nextInt();

        System.out.println("Com media " + media + " o senhor(a) está: ");
        
        if (media >= 7 && media <= 10) {
            System.out.println("Aprovado");
        } else if (media >= 5 && media <= 7) {
            System.out.println("Em Recuperação");
        } else if (media <= 5 && media >= 0) {
            System.out.println("REPROVADO!");
        }
    }
}