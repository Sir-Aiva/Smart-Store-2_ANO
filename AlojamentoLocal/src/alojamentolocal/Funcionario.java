package alojamentolocal;

public class Funcionario{
    String nome;
    String matricula;
    Tarefas tarefa;
    
    public Funcionario(String nome, String matricula, Tarefas tarefa){
        this.nome = nome;
        this.matricula = matricula;
        this.tarefa = tarefa;
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.nome + "\nMatrícula: " + this.matricula + "\nTarefa: " + this.tarefa;
    }
}
