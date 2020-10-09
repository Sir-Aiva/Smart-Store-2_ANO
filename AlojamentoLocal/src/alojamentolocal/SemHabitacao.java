package alojamentolocal;

public class SemHabitacao extends Exception{
    String acontecimento;
    
    public SemHabitacao(String acontecimento){
        this.acontecimento = acontecimento;
    }
    
    @Override
    public String toString(){
        return this.acontecimento;
    }
}