package EXERCICIO_03_STATE;

// Segundo nível de alerta
public class EstadoAlertaVermelho implements State {

    private UsinaNuclear contexto;

    public EstadoAlertaVermelho(UsinaNuclear contexto) {
        this.contexto = contexto;
    }

    @Override
    public void verificarEstado() {

        System.out.println("Estado: Alerta Vermelho");

        if (!contexto.resfriamentoOk()) {
            contexto.setEstado(new EstadoEmergencia(contexto));
            return;
        }

        if (contexto.getTemperatura() < 350) {
            contexto.setEstado(new EstadoAlertaAmarelo(contexto));
        }
    }
}

