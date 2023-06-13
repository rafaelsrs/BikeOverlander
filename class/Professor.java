public class Professor extends Pessoa {
    // Atributos
    private String cd_funcionario;

    public Professor(String nome, String cpf, String endereco, String email, String celular, String codigo) {
        super(nome, cpf, endereco, email, celular);
        setCdFuncionario(codigo);
    }

    // Métodos
    public String getCdFuncionario() {
        return cd_funcionario;
    }

    public void setCdFuncionario(String cd_funcionario) {
        this.cd_funcionario = cd_funcionario;
    }

}
