package alojamentolocal;

public enum Estados{
    LIVRE,OCUPADA,EMMANUTENCAO,FINALIZADO;
    
    @Override
    public String toString(){
        switch(this){
            case LIVRE: return "A habitação está livre";
            case OCUPADA: return "A habitação está ocupada";
            case EMMANUTENCAO: return "A habitação está em manutenção";
            case FINALIZADO: return "O aluguer foi finalizado";
        }
        return "";
    }
}
