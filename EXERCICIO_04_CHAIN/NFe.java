package EXERCICIO_04_CHAIN;

public class NFe {
    public String xml;
    public boolean certificadoValido;
    public double valorImpostos;
    public int numero;
    public boolean conexaoSefaz;

    public NFe(String xml, boolean certificadoValido, double valorImpostos, int numero, boolean conexaoSefaz){
        this.xml = xml;
        this.certificadoValido = certificadoValido;
        this.valorImpostos = valorImpostos;
        this.numero = numero;
        this.conexaoSefaz = conexaoSefaz;
    }
}
