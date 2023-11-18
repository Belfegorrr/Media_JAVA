package Media_JAVA.src.tarefa_media;

public class Operadores {
    public static void main(String arg[]){
        operacaoSomaNota();        
    }

        public static void operacaoSomaNota() {
            System.out.println("*** operaçõesSomarNotas ***");
            int nota1 = 9;
            int nota2 = 7;
            int nota3 = 5;
            int nota4 = 6;

            int soma = nota1 + nota2 + nota3 + nota4;

            System.out.println(soma);   
            
            System.out.println("*** operaçõesAcharMedia ***");
            
            int media = soma/4;

            System.out.println(media);
        }
}
