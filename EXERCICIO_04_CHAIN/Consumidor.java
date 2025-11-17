package EXERCICIO_04_CHAIN;

/*
 * JUSTIFICATIVA DO DESIGN (exigência do exercício):
 * 
 * O padrão Chain of Responsibility foi escolhido porque o problema exige
 * que múltiplas validações sejam executadas em sequência, permitindo que
 * cada validador seja independente e responsável por uma única tarefa —
 * atendendo ao princípio SOLID (Single Responsibility).
 *
 * Além disso, a possibilidade de encadear validadores dinamicamente,
 * interromper a cadeia (circuit breaker) e realizar rollback em caso de falhas
 * só é possível de forma limpa com este padrão.
 *
 * O cliente (classe Consumidor) não precisa conhecer os detalhes internos
 * de cada validador, apenas monta a cadeia, garantindo baixo acoplamento
 * e fácil extensão futura.
 */

public class Consumidor {
    public static void main(String[] args) {

        // Construção da NF-e dummy
        NFe documento = new NFe(
            "<NFe>DocumentoTeste</NFe>",
            true,
            100.0,
            999,
            true
        );

        // Instancia cada validador da cadeia
        absHandler schema   = new ValidadorSchemaHandler();
        absHandler cert     = new ValidadorCertificadoHandler();
        absHandler regras   = new ValidadorRegrasFiscaisHandler();
        absHandler banco    = new ValidadorBancoHandler();
        absHandler sefaz    = new ValidadorSefazHandler();

        // Monta a cadeia de responsabilidade
        schema.setNextHandle(cert);
        cert.setNextHandle(regras);
        regras.setNextHandle(banco);
        banco.setNextHandle(sefaz);

        System.out.println("\n--- Iniciando validação da NF-e ---\n");
        schema.handleRequest(documento, 0);
    }
}
