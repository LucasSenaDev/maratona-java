package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Player;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player1 = new Player("Cafu");
        Player player2 = new Player("Pelé");
        Team team = new Team("Mirasol");
        Player[] playersArr = {player1, player2};

        player1.setTeam(team);
        player2.setTeam(team);
        team.setPlayers(playersArr);

        System.out.println("--- Player --- ");
        player1.print();

        System.out.println("--- Team --- ");
        team.print();

    }
}
