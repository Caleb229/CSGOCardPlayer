package framework;

import java.util.Date;

public class Player extends Member{

    public Team team;
    public String rank;
    public Role role;
    public Abilities abilities;


    public Player(String name, Date dateOfBirth, String nationality, Team team, Role role, String rank,
                  Abilities abilites) {
        super(name, dateOfBirth, nationality);
        this.team = team;
        this.role = role;
        this.rank = rank;
        this.abilities = abilites;
    }
}
