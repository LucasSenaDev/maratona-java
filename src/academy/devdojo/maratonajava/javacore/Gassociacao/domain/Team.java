package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Team {
    private String name;
    private Player[] players;

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, Player[] players) {
        this(name);
        this.players = players;
    }

    public void print(){
        System.out.println(this.name);
        if(players == null) return;
        for(Player arrayPlayers:  players) {
            System.out.println(arrayPlayers.getName());
        }
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
