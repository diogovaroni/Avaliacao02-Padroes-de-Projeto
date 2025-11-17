package EXERCICIO_02_ADAPTER;

import java.util.HashMap;

/*
 Classe legada com interface incompatível.
 Usa HashMap com parâmetros genéricos e requer campos obrigatórios,
 incluindo códigos de moeda numéricos.
*/
public class SistemaBancarioLegado {

    public HashMap<String, Object> processarTransacao(HashMap<String, Object> parametros) {

        System.out.println("Processando transação no sistema legado...");
        System.out.println("Parâmetros recebidos: " + parametros);

        // Simula retorno do legado
        HashMap<String, Object> resposta = new HashMap<>();
        resposta.put("status", "OK");
        resposta.put("codigoAprovacao", 12345);
        resposta.put("mensagem", "Transação autorizada no legado");

        return resposta;
    }
}

