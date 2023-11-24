package Media_JAVA.src.tarefa_interfaces;

public abstract class Pessoa {

    private String nome;

    private String sobrenome;

    private Integer registro;

    public abstract Double vencimento();

    public void imprimirSobrenome() {
        System.out.println("Segundo nome é: " + this.sobrenome);
    }

    public void imprimirValores() {

        Double valor = vencimento();
        System.out.println("Vencimento : " + valor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getRegistro() {
        return registro;
    }

    public void setRegistro(Integer registro) {
        this.registro = registro;
    }
}
