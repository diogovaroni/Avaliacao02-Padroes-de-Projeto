package EXERCICIO_03_STATE;

// Estado que sobrepõe outros temporariamente
public class EstadoManutencao implements State {

    private UsinaNuclear contexto;

    public EstadoManutencao(UsinaNuclear contexto) {
        this.contexto = contexto;
    }

    @Override
    public void verificarEstado() {
        System.out.println("Usina em modo de manutenção.");
    }
}

