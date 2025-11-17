package EXERCICIO_04_CHAIN;

// Valida certificado digital
public class ValidadorCertificadoHandler extends absHandler {

    @Override
    public boolean handleRequest(NFe documento, int falhas) {

        System.out.println("[Certificado] Verificando validade do certificado...");

        boolean valido = documento.certificadoValido;

        if(!valido){
            System.out.println("[Certificado] Certificado expirado ou revogado!");
            falhas++;

            if(falhas >= 3){
                System.out.println("Circuit breaker acionado! Interrompendo cadeia.");
                return false;
            }

            return nextHandler.handleRequest(documento, falhas);
        }

        return nextHandler.handleRequest(documento, falhas);
    }
}

