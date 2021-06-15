package framework;

import java.util.Date;

public abstract class Member {
    public final String firstName;
    public final String lastName;
    public final Date dateOfBirth;
    public String nationality;

    public Member(String firstName, String lastName, Date dateOfBirth, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
    }
}
