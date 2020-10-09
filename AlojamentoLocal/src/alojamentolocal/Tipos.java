package alojamentolocal;

public enum Tipos{
    T0,T1,T2,T3,T4;
    
    @Override
    public String toString(){
        switch(this){
            case T0: return "Habitação T0";
            case T1: return "Habitação T1";
            case T2: return "Habitação T2";
            case T3: return "Habitação T3";
            case T4: return "Habitação T4";
        }
        return "";
    }
}