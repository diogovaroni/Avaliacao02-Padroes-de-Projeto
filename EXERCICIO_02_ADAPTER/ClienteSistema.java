package EXERCICIO_02_ADAPTER;

public class ClienteSistema {

    public static void main(String[] args) {

        //Cria o sistema legado
        SistemaBancarioLegado legado = new SistemaBancarioLegado();

        //Cria o adaptador
        iProcessadorTransacoes processador = new SistemaBancarioAdapter(legado);

        //Executa o método moderno
        String resposta = processador.autorizar("1234567812345678", 250.0, "BRL");

        //Exibe o retorno já convertido
        System.out.println(resposta);
    }
}

