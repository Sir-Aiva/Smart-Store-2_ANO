package alojamentolocal;

public class ExcedeNoites extends Exception{
    String acontecimento;
    
    public ExcedeNoites(String acontecimento){
        this.acontecimento = acontecimento;
    }
    
    @Override
    public String toString(){
        return this.acontecimento;
    }
}