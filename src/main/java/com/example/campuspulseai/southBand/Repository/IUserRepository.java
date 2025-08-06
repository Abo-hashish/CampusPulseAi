package com.example.campuspulseai.southBand.Repository;

import com.example.campuspulseai.southBand.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUserRepository extends CrudRepository<User, Long> {

}
