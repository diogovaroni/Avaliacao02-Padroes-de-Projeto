package EXERCICIO_01_STRATEGY;

/*
 Estratégia concreta para o cálculo simulado de Value at Risk (VaR).

 - Aplicação do Princípio SRP:
   Esta classe tem apenas a responsabilidade de implementar o cálculo do VaR.

 - Implementa a interface iCalculoRisco respeitando o Princípio LSP:
   Pode substituir qualquer outra estratégia sem quebrar o contexto.
*/
public class ValueAtRisk implements iCalculoRisco {

    @Override
    public String calcularRisco(RiskContext contexto) {

        // Cálculo dummy apenas para demonstração
        return "Cálculo de Value at Risk executado usando volatilidade = "
                + contexto.getVolatilidade() + ", exposição = " + contexto.getExposicao();
    }
}

