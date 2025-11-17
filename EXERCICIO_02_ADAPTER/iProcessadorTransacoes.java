package EXERCICIO_02_ADAPTER;

/*
 Interface moderna do sistema atual.

 Este é o contrato que o restante do sistema usa.
 O Adapter precisará converter para a interface legada.
*/
public interface iProcessadorTransacoes {

    //Método moderno, simples e direto
    public String autorizar(String cartao, double valor, String moeda);
}
