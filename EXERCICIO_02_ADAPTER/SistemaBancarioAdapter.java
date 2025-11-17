package EXERCICIO_02_ADAPTER;

import java.util.HashMap;

/*
 Classe Adaptadora que converte:
 - a interface moderna para a interface legada
 - e também converte a resposta legada para o formato moderno

 Segue o mesmo padrão de escrita do professor.
*/
public class SistemaBancarioAdapter implements iProcessadorTransacoes {

    //1. Dependência para o sistema legado
    private SistemaBancarioLegado legado;

    //1.1 Construtor que recebe a classe incompatível
    public SistemaBancarioAdapter(SistemaBancarioLegado legado) {
        this.legado = legado;
    }

    @Override
    public String autorizar(String cartao, double valor, String moeda) {

        //2. Converter moeda moderna ("BRL") para legado (1,2,3)
        int codigoMoeda = converterMoeda(moeda);

        //3. Criar HashMap com os parâmetros exigidos pelo legado
        HashMap<String, Object> parametros = new HashMap<>();
        parametros.put("numeroCartao", cartao);
        parametros.put("valor", valor);
        parametros.put("moeda", codigoMoeda);

        //Campo obrigatório no legado que não existe no moderno
        parametros.put("canalOperacao", "APP");  //exemplo de campo exigido

        //4. Chamar o sistema legado
        HashMap<String, Object> respostaLegado = legado.processarTransacao(parametros);

        //5. Converter resposta do legado para o formato moderno
        return montarRespostaModerna(respostaLegado);
    }


    //Método auxiliar para converter código de moeda
    private int converterMoeda(String moeda) {
        switch (moeda) {
            case "USD": return 1;
            case "EUR": return 2;
            case "BRL": return 3;
            default: return 0;
        }
    }

    //Converte HashMap legado para uma String simples moderna
    private String montarRespostaModerna(HashMap<String, Object> resposta) {

        String status = (String) resposta.get("status");
        Object codigo = resposta.get("codigoAprovacao");
        String mensagem = (String) resposta.get("mensagem");

        return "STATUS: " + status +
               " | COD: " + codigo +
               " | MSG: " + mensagem;
    }
}

