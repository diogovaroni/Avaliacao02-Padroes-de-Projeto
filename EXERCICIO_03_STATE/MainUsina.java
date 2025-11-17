package EXERCICIO_03_STATE;

/*
 Justificativa do Design:
 ------------------------
 O padrão STATE foi escolhido porque o sistema exige múltiplos estados de operação,
 cada um com regras e transições específicas. Tentar resolver isso com IF/ELSE
 tornaria o código rígido e difícil de manter.

 O padrão também respeita SOLID:
 - SRP: Cada estado tem uma única responsabilidade.
 - OCP: Novos estados podem ser adicionados sem alterar os atuais.
 - DIP: A usina depende da abstração "State", não de implementações concretas.

 Em uma usina nuclear, controlar transições perigosas e impedir ciclos é essencial.
 O STATE permite tornar essas regras explícitas e isoladas.
*/
public class MainUsina {

    public static void main(String[] args) {

        UsinaNuclear usina = new UsinaNuclear();

        usina.verificar(); // liga

        usina.setTemperatura(320);
        usina.verificar(); // amarelo

        usina.setTemperatura(450);
        usina.verificar(); // vermelho

        usina.falhaResfriamento();
        usina.verificar(); // emergência
    }
}

