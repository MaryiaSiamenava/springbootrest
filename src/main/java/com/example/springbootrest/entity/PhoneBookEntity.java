package com.example.springbootrest.entity;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name = "phonebook")
public class PhoneBookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Map<Long, UserEntity> entries;

    @OneToOne
    //@MapsId
    private UserEntity userEntity;

    public PhoneBookEntity() {
    }

    public PhoneBookEntity(Map<Long, UserEntity> entries) {
        this.entries = entries;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Map<Long, UserEntity> getEntries() {
        return entries;
    }

    public void setEntries(Map<Long, UserEntity> entries) {
        this.entries = entries;
    }
}
