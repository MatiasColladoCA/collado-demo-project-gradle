package com.example.colladodemoprojectgradle.repositories;

import com.example.colladodemoprojectgradle.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.yaml.snakeyaml.events.Event;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {

}
