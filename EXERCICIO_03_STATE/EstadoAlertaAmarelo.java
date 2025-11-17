package EXERCICIO_03_STATE;

// Primeiro nível de alerta
public class EstadoAlertaAmarelo implements State {

    private UsinaNuclear contexto;

    public EstadoAlertaAmarelo(UsinaNuclear contexto) {
        this.contexto = contexto;
    }

    @Override
    public void verificarEstado() {

        System.out.println("Estado: Alerta Amarelo");

        if (contexto.getTemperatura() > 400) {
            contexto.setEstado(new EstadoAlertaVermelho(contexto));
            return;
        }

        if (contexto.getTemperatura() <= 300) {
            contexto.setEstado(new EstadoOperacaoNormal(contexto));
        }
    }
}
