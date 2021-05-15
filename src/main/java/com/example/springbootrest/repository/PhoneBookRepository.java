package com.example.springbootrest.repository;

import com.example.springbootrest.entity.PhoneBookEntity;
import com.example.springbootrest.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;


public interface PhoneBookRepository extends CrudRepository <PhoneBookEntity, Long> {
}
