package com.sodexo.szkolenie.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Michał Kordulewski on 09.11.17.
 */
@Entity
public class Customer {

    @Id
    private int id;

    private String firstName;

    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}

