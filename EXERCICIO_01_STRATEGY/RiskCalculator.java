package EXERCICIO_01_STRATEGY;

/*
 Classe responsável por manter a estratégia atual e permitir sua troca em tempo de execução.

 - Aplicação do Princípio SRP:
   A classe possui uma única responsabilidade: delegar a lógica para a estratégia atual.

 - Aplicação do Princípio OCP:
   Podemos adicionar novos algoritmos de cálculo de risco sem alterar esta classe.

 - Aplicação do Princípio DIP:
   O contexto depende da interface iCalculoRisco, não das classes concretas.
*/
public class RiskCalculator {

    // Estratégia injetada no contexto
    private iCalculoRisco estrategia;

    // Construtor baseado em injeção de dependência
    public RiskCalculator(iCalculoRisco estrategia) {
        this.estrategia = estrategia;
    }

    // Permite trocar o algoritmo em tempo de execução
    public void setEstrategia(iCalculoRisco novaEstrategia) {
        this.estrategia = novaEstrategia;
    }

    // Executa o algoritmo definido pela estratégia ativa
    public String executarCalculo(RiskContext contexto) {
        return estrategia.calcularRisco(contexto);
    }
}

