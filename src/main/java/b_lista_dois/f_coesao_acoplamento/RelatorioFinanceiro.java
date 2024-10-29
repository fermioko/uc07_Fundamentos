package b_lista_dois.f_coesao_acoplamento;

public class RelatorioFinanceiro {
    private Calculadora calculadora;

    //construtor
    public RelatorioFinanceiro(Calculadora calc){
        this.calculadora = calc; // metodo de variavel local
    }

    private double calcularLucro(double receita, double despesas){
        return calculadora.subtrair(receita, despesas);
    }
    private double calcularMediaMensal(double receitaTotal, int meses){
        return calculadora.dividir(receitaTotal, meses);
    }

    public void imprimirRelatorio(double receita, double despesa, int meses){
        double lucro = this.calcularLucro(receita, despesa);
        double mediaMensal = this.calcularMediaMensal(lucro,meses);
        System.out.println("======== RESULTADO RELATORIO ==========");
        System.out.println("======== RECEITA R$ " + receita);
        System.out.println("======== DESPESA R$ " + despesa);
        System.out.println("======== LUCRO R$ " + lucro);
        System.out.println("======== MEDIA MENSAL R$ " + mediaMensal);
    }
}
