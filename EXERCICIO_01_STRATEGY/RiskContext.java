package EXERCICIO_01_STRATEGY;

/*
 Classe que agrupa os parâmetros financeiros necessários para os algoritmos.

 Esta classe permite que todas as estratégias compartilhem um mesmo conjunto
 de informações, atendendo ao requisito do enunciado.
*/
public class RiskContext {

    private double volatilidade;
    private double exposicao;
    private double nivelConfianca;
    private String cenarioStress;

    public RiskContext(double volatilidade, double exposicao, double nivelConfianca, String cenarioStress) {
        this.volatilidade = volatilidade;
        this.exposicao = exposicao;
        this.nivelConfianca = nivelConfianca;
        this.cenarioStress = cenarioStress;
    }

    public double getVolatilidade() { return volatilidade; }
    public double getExposicao() { return exposicao; }
    public double getNivelConfianca() { return nivelConfianca; }
    public String getCenarioStress() { return cenarioStress; }
}

