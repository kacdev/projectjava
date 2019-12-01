package pl.example.spring.punkty.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentRow {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
    private String name;
    private String number;
    private String grupa;

    public StudentRow(){}

    public StudentRow(String name, String number, String grupa) {
        this.name = name;
        this.number = number;
        this.grupa = grupa;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getGrupa() {
        return grupa;
    }
}
