package com.yuhang.demo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.yuhang.demo.model.Alien;

/*
 * YH:
 * Spring Data Rest does the same thing as CONTROLLOR.
 * All methods are pre-build in this repository.
 * In order to make POST work, it needs @GeneratedValue(strategy=GenerationType.IDENTITY),
 * and table must have the primary key which is auto increment.
 * @RepositoryRestResource(collectionResourceRel=?,path=?) specifies the base URL to use.
 */
@RepositoryRestResource(collectionResourceRel="aliens", path="aliens")
public interface AlienRepository extends JpaRepository<Alien, Integer>{

}
