package framework;

import java.awt.*;
import java.util.List;

public class Team {
    public String name;
    public Member CEO;
    public Member coach;
    public String website;
    public List<Player> players;
    public Image logo;

    public Team(String name, Member CEO, String website, List<Player> players, Member coach, Image logo){
        this.name = name;
        this.CEO = CEO;
        this.website = website;
        this.players = players;
        this.coach = coach;
        this.logo = logo;
    }
}
