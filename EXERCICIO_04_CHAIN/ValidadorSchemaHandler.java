package EXERCICIO_04_CHAIN;

// Valida o XML da NF-e contra o XSD
public class ValidadorSchemaHandler extends absHandler {

    @Override
    public boolean handleRequest(NFe documento, int falhas) {

        System.out.println("[Schema] Validando estrutura XML...");

        // Validação dummy
        boolean valido = documento.xml != null && documento.xml.contains("<NFe>");

        if(!valido){
            System.out.println("[Schema] Falha na validação de esquema!");
            falhas++;

            if(falhas >= 3){
                System.out.println("Circuit breaker acionado! Interrompendo cadeia.");
                return false;
            }

            // Validador 3 e 5 não devem executar se os anteriores falharem
            return nextHandler.handleRequest(documento, falhas);
        }

        return nextHandler.handleRequest(documento, falhas);
    }
}

