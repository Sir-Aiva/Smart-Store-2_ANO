package alojamentolocal;

public class Cliente{
    String nome, numFiscal, telefone;
    
    public Cliente(String nome, String numFiscal, String telefone){
        this.nome = nome;
        this.numFiscal = numFiscal;
        this.telefone = telefone;
    }
    
    public void reserva(Empresa emp, Tipos tipo, int numNoites){
        emp.aluga(this, tipo, numNoites);
    } 
    
    @Override
    public String toString(){
        return "Nome: " + this.nome + "\nNIF: " + this.numFiscal + "\nTelefone: " + this.telefone;
    }
}