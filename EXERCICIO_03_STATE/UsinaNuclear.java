package EXERCICIO_03_STATE;

public class UsinaNuclear {

    // Estado atual da usina
    private State estadoAtual;

    // Dados monitorados
    private double temperatura;
    private double pressao;
    private double radiacao;
    private boolean resfriamentoOk = true;
    private boolean manutencaoAtiva = false;

    // Construtor inicia desligada
    public UsinaNuclear() {
        this.estadoAtual = new EstadoDesligado(this);
    }

    // Métodos de controle do contexto
    public void setEstado(State novoEstado) {
        this.estadoAtual = novoEstado;
    }

    public State getEstado() {
        return this.estadoAtual;
    }

    public void ativarManutencao() {
        manutencaoAtiva = true;
        setEstado(new EstadoManutencao(this));
    }

    public void desativarManutencao() {
        manutencaoAtiva = false;
        setEstado(new EstadoDesligado(this));
    }

    public boolean manutencaoAtiva() {
        return manutencaoAtiva;
    }

    // Setters usados para simular o comportamento
    public void setTemperatura(double t) { temperatura = t; }
    public void setPressao(double p) { pressao = p; }
    public void setRadiacao(double r) { radiacao = r; }
    public void falhaResfriamento() { resfriamentoOk = false; }
    public void recuperarResfriamento() { resfriamentoOk = true; }

    public double getTemperatura() { return temperatura; }
    public double getPressao() { return pressao; }
    public double getRadiacao() { return radiacao; }
    public boolean resfriamentoOk() { return resfriamentoOk; }

    public void verificar() {
        estadoAtual.verificarEstado();
    }
}

