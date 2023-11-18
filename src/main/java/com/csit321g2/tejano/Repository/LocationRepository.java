package com.csit321g2.tejano.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csit321g2.tejano.Entity.LocationEntity;

@Repository
public interface LocationRepository extends JpaRepository<LocationEntity, Integer>{
}

