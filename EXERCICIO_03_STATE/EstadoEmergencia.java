package EXERCICIO_03_STATE;

// Estado crítico final
public class EstadoEmergencia implements State {

    private UsinaNuclear contexto;

    public EstadoEmergencia(UsinaNuclear contexto) {
        this.contexto = contexto;
    }

    @Override
    public void verificarEstado() {
        System.out.println("!!! EMERGÊNCIA ATIVADA !!!");
        System.out.println("Executando desligamento total...");
    }
}

