public class Aluno extends Pessoa {
    // Atributos
    private String matricula_aluno;

    public Aluno(String nome, String cpf, String endereco, String email, String celular, String matricula){
        super(nome, cpf, endereco, email, celular);
        setMatriculaAluno(matricula);
    }

    // Métodos
    public String getMatriculaAluno() {
        return matricula_aluno;
    }
    
    public void setMatriculaAluno(String matricula_aluno) {
        this.matricula_aluno = matricula_aluno;
    }

}
