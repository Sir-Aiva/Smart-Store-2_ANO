package alojamentolocal;

public class Habitacao{
    String id;
    Tipos tipo;
    Estados estado;
    float taxaNoite;
    
    public Habitacao(String id, Tipos tipo, float taxaNoite){
        this.id = id;
        this.tipo = tipo;
        this.taxaNoite = taxaNoite;
        estado = Estados.LIVRE;
    }
    
    @Override
    public String toString(){
        return this.id + " - " + this.tipo + " - " + this.taxaNoite + " - " + estado;
    }
}