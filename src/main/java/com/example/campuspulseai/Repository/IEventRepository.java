package com.example.campuspulseai.Repository;

import com.example.campuspulseai.Entity.Event;
import org.springframework.data.repository.CrudRepository;

public interface IEventRepository extends CrudRepository<Event, Long> {

}
