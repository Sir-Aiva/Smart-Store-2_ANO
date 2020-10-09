package alojamentolocal;

public enum Tarefas{
    LIMPAR,BUSCAR,CHECKIN,MANUTENCAO,ASSISTIR,CHECKOUT,LEVAR;
    
    @Override
    public String toString(){
        switch(this){
            case LIMPAR: return "Limpar a habitação e verificar que está em condições de ser ocupada";
            case BUSCAR: return "Buscar os hóspedes ao aeroporto e levá-los à habitação que alugaram";
            case CHECKIN: return "Fazer o checkin dos hóspedes explicando-lhes os detalhes funcionais da habitação";
            case MANUTENCAO: return "Resolver problemas de manutenção (conserto e troca de equipamentos)";
            case ASSISTIR: return "Assitir os hóspedes em alguma emergência (perda de chaves, etc...)";
            case CHECKOUT: return "Fazer o checkout verificando que os hóspedes não partiram nem levaram nada da habitação";
            case LEVAR: return "Levar os hóspedes ao aeroporto";
        }
        return "";
    }
}
