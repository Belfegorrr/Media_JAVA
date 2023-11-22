package Media_JAVA.src.tarefa_colecoes1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Pessoa {
    public static void main(String[] args){
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

            if( s == "Feminino" || s == "feminino"){
                ColecoesFeminino pf = new ColecoesFeminino(n, s);
                listaFeminino.add(pf);
            }else if(s == "Masculino" || s == "masculino"){
                Colecoes p = new Colecoes(n, s);
                lista.add(p);
            } else {
                System.out.println("O sexo precisa ser informado corretamente!");
            }

        } while (controle == 's' || controle == 'S');

        for(Colecoes i: lista){
            System.out.println(i);
        }
        for(ColecoesFeminino i: listaFeminino){
            System.out.println(i);
        }
    }
}
