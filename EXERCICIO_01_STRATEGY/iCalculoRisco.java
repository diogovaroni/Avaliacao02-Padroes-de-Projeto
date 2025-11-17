package EXERCICIO_01_STRATEGY;

/*
 Interface que define o contrato para todos os algoritmos de cálculo de risco.
 
 - Aplicação do Princípio ISP (Interface Segregation Principle):
   A interface é pequena e contém apenas o método necessário para que cada 
   algoritmo cumpra sua responsabilidade.
   
 - Aplicação do Princípio DIP (Dependency Inversion Principle):
   O contexto irá depender desta abstração e não das implementações concretas.
*/
public interface iCalculoRisco {

    // Assinatura do método que será implementado pelas estratégias concretas
    public String calcularRisco(RiskContext contexto);
}
