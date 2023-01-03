package ua.edu.ucu.apps.lab73.appUser;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity @Table @Getter @Setter @NoArgsConstructor
public class AppUser {
    @Id @GeneratedValue
    private int id;
    @Column(unique = true)
    private String email;
    private LocalDate dob;
    @Transient
    private int age;
    private Status status = Status.idle;

    public int getAge(){
        return Period.between(dob, LocalDate.now()).getYears();
    }

    public AppUser(String email, LocalDate dob){
        this.email = email;
        this.dob = dob;
    }

    public void changeStatus(Status status){
        this.status = status;
    }
}
