package Media_JAVA.src.tarefa_interfaces;

public class Programa {
    
    public static void main(String args[]) {

        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setRegistro(654916519);
        pessoa.setNome("Iago");
        pessoa.setSobrenome("Santos");
        pessoa.setSalario(100d);
        pessoa.setTotalDeDecimoTerceiro(2500);
        pessoa.setTotalDeHorasExtra(100d);
        pessoa.setTotalDeDescontos(480);

        System.out.println(pessoa.getNome() + " Teu sálario no total: " + pessoa.vencimento());

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setCnpj(615611118d);
        pessoaJuridica.setNomeFantasia("AgroKi");
        pessoaJuridica.setTotalDeHorasTrabalhadas(40d);
        pessoaJuridica.setTotalDeBonus(5d);
        pessoaJuridica.setVencimento(100);
        
        System.out.println(pessoaJuridica.getNome() + "Teu sálario no total: " + pessoaJuridica.vencimento());
    }    
}
