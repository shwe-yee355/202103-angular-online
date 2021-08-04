package com.example.manytomany.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String country;

    @ManyToMany(mappedBy = "events",cascade = CascadeType.PERSIST)
    private List<Speaker> speakers
            =new ArrayList<>();


    public Event() {
    }

    public Event(String name, String country) {
        this.name = name;
        this.country = country;
    }


}
