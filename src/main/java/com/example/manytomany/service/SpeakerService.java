package com.example.manytomany.service;

import com.example.manytomany.dao.EventDao;
import com.example.manytomany.dao.SpeakerDao;
import com.example.manytomany.entity.Event;
import com.example.manytomany.entity.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SpeakerService {

    @Autowired
    private EventDao eventDao;


    @Transactional
    public void createDb(){
        Event e1 = new Event("Java","Japan");
        Event e2 = new Event("Python","India");
        Event e3 = new Event("Angular","Us");


        Speaker s1= new Speaker("John","Java");
        Speaker s2= new Speaker("Willian","CS");
        Speaker s3= new Speaker("Thomas","Security");

        s1.getEvents().add(e1);
        e1.getSpeakers().add(s1);

        s1.getEvents().add(e2);
        e2.getSpeakers().add(s1);

        s1.getEvents().add(e3);
        e3.getSpeakers().add(s1);

        s2.getEvents().add(e2);
        e2.getSpeakers().add(s2);

        s3.getEvents().add(e3);
        e3.getSpeakers().add(s3);

        eventDao.save(e1);
        eventDao.save(e2);
        eventDao.save(e3);



    }
}
