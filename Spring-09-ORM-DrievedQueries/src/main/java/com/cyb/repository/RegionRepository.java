package com.cyb.repository;

import com.cyb.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepository extends JpaRepository<Region,Integer> {

    //display all regions in canada
    List<Region> findByCountry(String country);

    List<Region> findDistinctByCountry(String country);

}
