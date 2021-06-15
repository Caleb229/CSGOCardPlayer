package framework;

import java.util.Date;

public class Player extends Member{

    public Team team;
    public String rank;
    public Role role;
    public Abilities abilities;


    public Player(String firstName, String lastName, Date dateOfBirth, String nationality, Team team, Role role, String rank,
                  Abilities abilities) {
        super(firstName, lastName, dateOfBirth, nationality);
        this.team = team;
        this.role = role;
        this.rank = rank;
        this.abilities = abilities;
    }
}
