public class Pessoa {
    private String nome_pessoa;
    private String cpf_pessoa;
    private String endereco_pessoa;
    private String email_pessoa;
    private String celular_pessoa;

    public Pessoa(String nome, String cpf, String endereco, String email, String celular) {
        setNomePessoa(nome);
        setCpfPessoa(cpf);
        setEnderecoPessoa(endereco);
        setEmailPessoa(email);
        setCelularPessoa(celular);
    }

    // Métodos
    public String getNomePessoa() {
        return nome_pessoa;
    }

    public void setNomePessoa(String nome_pessoa) {
        this.nome_pessoa = nome_pessoa;
    }

    public String getCpfPessoa() {
        return cpf_pessoa;
    }

    public void setCpfPessoa(String cpf_pessoa) {
        this.cpf_pessoa = cpf_pessoa;
    }

    public String getEnderecoPessoa() {
        return endereco_pessoa;
    }

    public void setEnderecoPessoa(String endereco_pessoa) {
        this.endereco_pessoa = endereco_pessoa;
    }

    public String getEmailPessoa() {
        return email_pessoa;
    }

    public void setEmailPessoa(String email_pessoa) {
        this.email_pessoa = email_pessoa;
    }

    public String getCelularPessoa() {
        return celular_pessoa;
    }

    public void setCelularPessoa(String celular_pessoa) {
        this.celular_pessoa = celular_pessoa;
    }

}
