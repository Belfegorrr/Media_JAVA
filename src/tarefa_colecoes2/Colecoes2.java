package Media_JAVA.src.tarefa_colecoes2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import Media_JAVA.src.tarefa_colecoes1.Colecoes;
import Media_JAVA.src.tarefa_colecoes1.ColecoesFeminino;

public class Colecoes2 {
    public static void main(String args[]){
        ColecoesParte1();
        ColecoesParte2();
    }
    
    public static void ColecoesParte1(){
        Scanner leia = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();        

            System.out.println("Digite os nomes separado por virgulas: ");
            String resposta = leia.next();
            System.out.println(resposta); 
            String[] vetStr = resposta.split(",");       
            

            System.out.println("Vetor desordenado: ");
            Collections.addAll(lista, vetStr);

            for(String i: lista){
                System.out.println(i);
            }

            System.out.println("Vetor em Ordem Alfabética: ");
            Collections.sort(lista);

            for(String i: lista){
                System.out.println(i);
            }
    }
    
    public static void ColecoesParte2(){
        Scanner leia = new Scanner(System.in);
        ArrayList<Colecoes> lista = new ArrayList<Colecoes>();
        ArrayList<ColecoesFeminino> listaFeminino = new ArrayList<ColecoesFeminino>();

        char controle = 's';

        do {
            System.out.println("Digite o nome: ");
            String n = leia.next();
            System.out.println("Digite o teu sexo: ");
            String s = leia.next();
            
            System.out.println("Deseja cadastrar outra pessoa? s ou S para sim! ");
            controle = leia.next().charAt(0);

            if( s.equals("F") || s.equals("f")){
                ColecoesFeminino pf = new ColecoesFeminino(n, s);
                listaFeminino.add(pf);
            }else if(s.equals("M")  || s.equals("m") ){
                Colecoes p = new Colecoes(n, s);
                lista.add(p);
            } else {
                System.out.println("O sexo precisa ser informado corretamente!");
            }

        } while (controle == 's' || controle == 'S');

        System.out.println("*** Coleções Masculino ***");

        for(Colecoes i: lista){
            System.out.println(i);
        }

         System.out.println("*** Coleções Feminino ***");
        for(ColecoesFeminino j: listaFeminino){
            System.out.println(j);
        }
    }
}
