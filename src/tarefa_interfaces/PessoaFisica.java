package Media_JAVA.src.tarefa_interfaces;

public class PessoaFisica extends Pessoa {

    private Double salario;

    private Double totalDeHorasExtra;

    private Integer totalDeDescontos;

    private Integer totalDeDecimoTerceiro;  

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getTotalDeHorasExtra() {
        return totalDeHorasExtra;
    }

    public void setTotalDeHorasExtra(Double totalDeHorasExtra) {
        this.totalDeHorasExtra = totalDeHorasExtra;
    }

    public Integer getTotalDeDescontos() {
        return totalDeDescontos;
    }

    public void setTotalDeDescontos(Integer totalDeDescontos) {
        this.totalDeDescontos = totalDeDescontos;
    }

    public Integer getTotalDeDecimoTerceiro() {
        return totalDeDecimoTerceiro;
    }

    public void setTotalDeDecimoTerceiro(Integer totalDeDecimoTerceiro) {
        this.totalDeDecimoTerceiro = totalDeDecimoTerceiro;
    }

    @Override
    public Double vencimento() {
        return null;
    }    
}
