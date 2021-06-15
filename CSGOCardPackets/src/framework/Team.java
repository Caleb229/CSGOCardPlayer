package framework;

import java.util.List;

public class Team {
    public Member CEO;
    public String website;
    public List<Player> players;

    public Team(Member CEO, String website, List<Player> players){
        this.CEO = CEO;
        this.website = website;
        this.players = players;
    }
}
