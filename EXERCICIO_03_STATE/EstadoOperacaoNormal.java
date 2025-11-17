package EXERCICIO_03_STATE;

// Estado normal de funcionamento
public class EstadoOperacaoNormal implements State {

    private UsinaNuclear contexto;

    public EstadoOperacaoNormal(UsinaNuclear contexto) {
        this.contexto = contexto;
    }

    @Override
    public void verificarEstado() {

        System.out.println("Estado: Operação Normal");

        if (contexto.manutencaoAtiva()) {
            contexto.setEstado(new EstadoManutencao(contexto));
            return;
        }

        if (contexto.getTemperatura() > 300) {
            contexto.setEstado(new EstadoAlertaAmarelo(contexto));
            return;
        }
    }
}

