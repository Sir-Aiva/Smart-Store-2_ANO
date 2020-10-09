package alojamentolocal;

import java.util.ArrayList;

public class Empresa{
    String nome, morada, telefone;
    ArrayList<Habitacao> habitacoes;
    ArrayList<Aluguer> alugueres;

    public Empresa(String nome, String morada, String telefone){
        this.nome = nome;
        this.morada = morada;
        this.telefone = telefone;
        habitacoes = new ArrayList<>();
        alugueres = new ArrayList<>();
    }

    public void aluga(Cliente cliente, Tipos tipo, int numNoites){
        Habitacao h = null;
        Aluguer a = null;
        try{
            int i;
            for(i = 0; i < habitacoes.size(); i++){
                h = habitacoes.get(i);
                if(h.tipo == tipo && h.estado == Estados.LIVRE){
                    break;
                }
            }
            if(i == habitacoes.size()){
                throw new SemHabitacao("Erro!");
            }
            if(numNoites<1 || numNoites>7){
                throw new ExcedeNoites("Erro!");
            }
            a = new Aluguer(cliente, h, numNoites);
            addAluguer(a);
        }
        catch(SemHabitacao exp){
            System.out.println("Habitacao indisponível!" + exp.toString());
        }
        catch(ExcedeNoites exp){
            System.out.println("Excedeu o número de noites!" + exp.toString());
        }
    }
    
    Aluguer getAluguerByCliente(Cliente cliente){
        Aluguer aluguer;
        for(int i = 0; i < alugueres.size(); i++){
            aluguer = alugueres.get(i);
            if(aluguer.cliente == cliente){
                return aluguer;
            }
        }
        return null;
    }
    
    public void devolucao(Cliente cliente, int numNoites, String danos, float valorDanos) {
        Aluguer aluguer = getAluguerByCliente(cliente);
        aluguer.calculaAluguer(numNoites, danos, valorDanos);
    }
    
    public String relatórioH(){
        String s = "";
        for(int i = 0; i < habitacoes.size(); i++){
            Habitacao h = habitacoes.get(i);
            s = s + h.id + " - " + h.tipo + " - " + h.taxaNoite + " - " + h.estado + "\n";
        }
        return s;
    }
    
    public String relatórioA(){
        String t = "";
        for(int i = 0; i < alugueres.size(); i++){
            Aluguer a = alugueres.get(i);
            t = t + a.cliente + "\n" + a.habitacao + " - " + a.numNoites
                    + " - " + a.danos + " - " + a.valorDanos + "\n";
        }
        return t;
    }
    
    public void addHabitacao(Habitacao h){
        habitacoes.add(h);
    }
    
    public void addAluguer(Aluguer a){
        alugueres.add(a);
    }
    
    class Aluguer{
        Habitacao habitacao;
        Cliente cliente;
        Estados estado;
        String danos;
        float valorDanos;
        float valorAluguer;
        int numNoites;

        public Aluguer(Cliente cliente, Habitacao habitacao, int numNoites){
            this.cliente = cliente;
            this.habitacao = habitacao;
            this.numNoites = numNoites;
            estado = null;
            danos = "";
            valorDanos = 0;
            valorAluguer = 0;
        }

        public float calculaAluguer(int numNoites, String danos, float valorDanos){
            float valorTotal;
            this.numNoites = numNoites;
            this.danos = danos;
            this.valorDanos = valorDanos;
            this.estado = Estados.FINALIZADO;
            float pagamentoNormal = numNoites*habitacao.taxaNoite;
            valorTotal = pagamentoNormal;
            if(valorDanos>0){
                valorTotal = valorTotal + valorDanos;
                habitacao.estado = Estados.EMMANUTENCAO;
            }else{
                habitacao.estado = Estados.LIVRE;
            }
            return valorTotal;
        }
    }
}