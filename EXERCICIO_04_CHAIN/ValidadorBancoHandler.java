package EXERCICIO_04_CHAIN;

// Valida duplicidade no banco de dados
public class ValidadorBancoHandler extends absHandler {

    private boolean foiRegistrado = false; // Para rollback

    @Override
    public boolean handleRequest(NFe documento, int falhas) {

        System.out.println("[Banco] Verificando duplicidade...");

        boolean duplicado = documento.numero == 123; // Dummy

        if(duplicado){
            System.out.println("[Banco] Documento já existe no banco!");
            falhas++;

            if(falhas >= 3){
                System.out.println("Circuit breaker acionado! Interrompendo cadeia.");
                return false;
            }

            return nextHandler.handleRequest(documento, falhas);
        }

        System.out.println("[Banco] Inserindo documento no banco...");
        foiRegistrado = true;

        boolean resultado = nextHandler.handleRequest(documento, falhas);

        if(!resultado && foiRegistrado){
            System.out.println("[Banco] Rollback da inserção!");
        }

        return resultado;
    }
}

