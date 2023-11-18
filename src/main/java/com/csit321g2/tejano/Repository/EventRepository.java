package com.csit321g2.tejano.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csit321g2.tejano.Entity.EventEntity;

public interface EventRepository extends JpaRepository<EventEntity, Integer>{

}
