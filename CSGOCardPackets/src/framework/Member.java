package framework;

import java.util.Date;

public abstract class Member {
    public final String name;
    public final Date dateOfBirth;
    public String nationality;

    public Member(String name, Date dateOfBirth, String nationality) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
    }
}
