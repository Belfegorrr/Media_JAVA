package Media_JAVA.src.tarefa_colecoes1;


import  java.util.ArrayList;
// import  java.util.Collections;
import  java.util.List;


/**
 * 2 ArrayList separando pessoas pelo sexo
 */

public class Colecoes {
    private String nome;
    private String sexo;
    
    public Colecoes(String n, String s) {
        this.setNome(n);
        this.setSexo(s);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return "Colecoes [nome=" + nome + ", sexo=" + sexo + "]";
    }

    public String getSexo() {
        return sexo;
    }
}
