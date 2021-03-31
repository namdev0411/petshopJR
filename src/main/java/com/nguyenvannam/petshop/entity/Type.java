package com.nguyenvannam.petshop.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="type")
public class Type implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;

    public Type(){

    }

    public Type(String id, String name) {
        this.id = id;
        this.name = name;
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
}
