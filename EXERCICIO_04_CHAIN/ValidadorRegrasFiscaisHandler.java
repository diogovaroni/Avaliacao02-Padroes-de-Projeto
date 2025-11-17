package EXERCICIO_04_CHAIN;

// Executado somente se os anteriores tiverem passado
public class ValidadorRegrasFiscaisHandler extends absHandler {

    @Override
    public boolean handleRequest(NFe documento, int falhas) {

        System.out.println("[Regras Fiscais] Validando impostos...");

        boolean valido = documento.valorImpostos >= 0;

        if(!valido){
            System.out.println("[Regras Fiscais] Falha no cálculo de impostos!");
            falhas++;

            if(falhas >= 3){
                System.out.println("Circuit breaker acionado! Interrompendo cadeia.");
                return false;
            }
        }

        return nextHandler.handleRequest(documento, falhas);
    }
}

