package Media_JAVA.src.tarefa_interfaces;

public class PessoaJuridica extends Pessoa {
    private String nomeFantasia;    

    private Double totalDeHorasTrabalhadas;

    private Double totalDeBonus;

    private Double cnpj;

    private Integer vencimento;

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public Integer getVencimento() {
        return vencimento;
    }

    public void setVencimento(Integer vencimento) {
        this.vencimento = vencimento;
    }

    public Double getTotalDeHorasTrabalhadas() {
        return totalDeHorasTrabalhadas;
    }

    public void setTotalDeHorasTrabalhadas(Double totalDeHorasTrabalhadas) {
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
    }

    public Double getTotalDeBonus() {
        return totalDeBonus;
    }

    public void setTotalDeBonus(Double totalDeBonus) {
        this.totalDeBonus = totalDeBonus;
    }

    public Double getCnpj() {
        return cnpj;
    }

    public void setCnpj(Double cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public Double vencimento() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vencimento'");
    }
}
