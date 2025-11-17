package EXERCICIO_01_STRATEGY;

/*
 Classe cliente demonstrando o uso do padrão Strategy.

 - Demonstra troca de estratégias em tempo de execução.
 - O cliente não conhece detalhes internos dos cálculos (encapsulamento + DIP).
*/
public class cliente {
    public static void main(String[] args) {

        // Criando um contexto financeiro com dados simulados
        RiskContext contexto = new RiskContext(
                0.18,       // volatilidade
                500000,     // exposição
                0.99,       // nível de confiança
                "Cenário de Crise Global" // cenário stress
        );

        // Estratégia inicial: VaR
        RiskCalculator calc = new RiskCalculator(new ValueAtRisk());

        System.out.println(calc.executarCalculo(contexto));

        // Trocando estratégia em tempo de execução
        calc.setEstrategia(new ExpectedShortfall());
        System.out.println(calc.executarCalculo(contexto));

        // Trocando novamente para Stress Testing
        calc.setEstrategia(new StressTesting());
        System.out.println(calc.executarCalculo(contexto));
    }
}

