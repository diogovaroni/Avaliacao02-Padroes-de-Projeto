package EXERCICIO_01_STRATEGY;

/*
 Estratégia concreta para cálculo de Expected Shortfall.

 - SRP: Implementa apenas o algoritmo referente a ES.
 - LSP: Substitui qualquer outra estratégia sem alterar o comportamento do sistema.
*/
public class ExpectedShortfall implements iCalculoRisco {

    @Override
    public String calcularRisco(RiskContext contexto) {

        return "Cálculo de Expected Shortfall executado com nível de confiança = "
                + contexto.getNivelConfianca();
    }
}
