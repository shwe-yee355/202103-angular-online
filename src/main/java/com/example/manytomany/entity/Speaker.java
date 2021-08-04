package com.example.manytomany.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Speaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;
    private String experties;

    @ManyToMany
    private List<Event> events
            =new ArrayList<>();

    public Speaker() {
    }

    public Speaker(String name, String experties) {
        this.name = name;
        this.experties = experties;
    }


}
