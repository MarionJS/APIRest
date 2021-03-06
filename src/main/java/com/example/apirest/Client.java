package com.example.apirest;
import javax.persistence.*;

@Entity
@Table(name= "clients")
public class Client {
    @Id
    private String guid;
    @Column(name="first")
    private String firstName;
    @Column(name="last")
    private String lastName;
    private String street;
    private String city;
    private int zip;

    protected Client() {}

    public Client(String guid, String firstName, String lastName, String street, String city, int zip) {
        this.guid = guid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    @Override
    public String toString(){
        return String.format(
                "Client [guid='%s', fistName='%s', lastName='%s', street='%s', city='%s', zip=%d]",
                guid, firstName, lastName, street,city,zip);
    }

    public String getGuid() {
        return guid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getZip() {
        return zip;
    }
}

