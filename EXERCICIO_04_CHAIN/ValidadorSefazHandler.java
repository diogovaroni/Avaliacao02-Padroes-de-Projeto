package EXERCICIO_04_CHAIN;

// Consulta online na SEFAZ (somente executado se anteriores passaram)
public class ValidadorSefazHandler extends absHandler {

    @Override
    public boolean handleRequest(NFe documento, int falhas) {

        System.out.println("[SEFAZ] Consultando NF-e...");

        boolean sucesso = documento.conexaoSefaz;

        if(!sucesso){
            System.out.println("[SEFAZ] Falha na consulta!");
            falhas++;

            if(falhas >= 3){
                System.out.println("Circuit breaker acionado! Interrompendo cadeia.");
                return false;
            }

            return false;
        }

        System.out.println("[SEFAZ] Documento autorizado!");
        return true;
    }
}

