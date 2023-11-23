package Media_JAVA.src.tarefa_colecoes1;

public class ColecoesFeminino {
    private String nome;
    private String sexo;
    
    public ColecoesFeminino(String n, String s) {
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
        return "Mulheres: nome " + nome + ", sexo " + sexo;
    }

    public String getSexo() {
        return sexo;
    }
}
