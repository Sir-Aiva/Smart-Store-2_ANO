package alojamentolocal;

public class AlojamentoLocal{
    public static void main(String[] args){
        Empresa emp = new Empresa("Dox Inc.", "Santos", "210999876");
        HabT0 h0 = new HabT0("213");
        HabT4 h1 = new HabT4("312");
        emp.addHabitacao(h0);
        emp.addHabitacao(h1);
        Cliente c1 = new Cliente("Nuno", "250648024", "964967115");
        Cliente c2 = new Cliente("André", "234765887", "934789560");
        c1.reserva(emp, Tipos.T0, 5);
        c2.reserva(emp, Tipos.T4, 3);
        emp.devolucao(c1, 5, "Nenhum", 0);
        emp.devolucao(c2, 3, "Candeeiro partido", 25);
        System.out.println("Relatório de Alugueres:");
        System.out.println(emp.relatórioA());
        System.out.println("Relatório de Habitações:");
        System.out.println(emp.relatórioH());
    }
}