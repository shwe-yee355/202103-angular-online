package com.example.manytomany.dao;

import com.example.manytomany.entity.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventDao extends CrudRepository<Event,Integer> {
}
