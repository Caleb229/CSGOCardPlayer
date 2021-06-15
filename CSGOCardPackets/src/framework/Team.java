package framework;

import java.util.List;

public class Team {
    public final String name;
    public String CEO;
    public String website;
    public List<Player> players;

    public Team(String name, String CEO, String website, List<Player> players){
        this.name = name;
        this.CEO = CEO;
        this.website = website;
        this.players = players;
    }
}
