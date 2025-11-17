package EXERCICIO_01_STRATEGY;

/*
 Estratégia concreta para simulação de Stress Testing.
*/
public class StressTesting implements iCalculoRisco {

    @Override
    public String calcularRisco(RiskContext contexto) {

        return "Stress Testing executado utilizando cenário = "
                + contexto.getCenarioStress();
    }
}

