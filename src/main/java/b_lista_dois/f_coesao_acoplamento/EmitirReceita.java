package b_lista_dois.f_coesao_acoplamento;

//(Coesão x Acomplamento) -
// Crie duas classes que exemplifiquem
// alta coesão e baixo acoplamento:
// Calculadora e RelatorioFinanceiro.
// A classe RelatorioFinanceiro deve usar a
// classe Calculadora para realizar
// operações de cálculo,mantendo baixo acoplamento.

public class EmitirReceita {
    public static void main(String[] args) {

        RelatorioFinanceiro relatorio = new RelatorioFinanceiro(new Calculadora());

        relatorio.imprimirRelatorio(5000, 3000,2);

    }

}



























