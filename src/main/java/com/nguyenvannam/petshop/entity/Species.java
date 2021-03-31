package com.nguyenvannam.petshop.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name= "species")
public class Species implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;

    @OneToOne
    private Type type;

    public Species(){

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Species(String id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
}
