public class Aluno extends Pessoa{

    private String RA;
    private String Curso;
    private int Periodo;
    public Aluno(String nome, String cpf, float saldo, Ticket tickets, String RA, String Curso, int Periodo) {
        super(nome, cpf, saldo, tickets);
        this.RA = RA;
        this.Curso = Curso;
        this.Periodo = Periodo;
    }
    
    //implentar todas as caracteristicas que os alunos da universidade tem: RA, Periodo e etc
    //a classe herda tudo de pessoa, ou seja, atributos basicos que todas as pessoas tem não devaram ser criadas aqui
}
