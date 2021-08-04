package com.example.manytomany.dao;

import com.example.manytomany.entity.Speaker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeakerDao extends CrudRepository<Speaker,Integer> {

}
