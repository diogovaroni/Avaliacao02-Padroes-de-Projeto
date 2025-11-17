package EXERCICIO_03_STATE;

// Estado inicial da usina
public class EstadoDesligado implements State {

    private UsinaNuclear contexto;

    public EstadoDesligado(UsinaNuclear contexto) {
        this.contexto = contexto;
    }

    @Override
    public void verificarEstado() {
        System.out.println("Usina desligada. Ligando sistema...");
        contexto.setEstado(new EstadoOperacaoNormal(contexto));
    }
}

