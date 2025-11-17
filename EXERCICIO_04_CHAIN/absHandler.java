package EXERCICIO_04_CHAIN;

// Classe base para todos os validadores da cadeia
// Segue o padrão Chain of Responsibility
public abstract class absHandler {

    protected absHandler nextHandler;

    // Para conectar o próximo validador na cadeia
    public void setNextHandle(absHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // Método genérico de validação
    public abstract boolean handleRequest(NFe documento, int falhas);

}

