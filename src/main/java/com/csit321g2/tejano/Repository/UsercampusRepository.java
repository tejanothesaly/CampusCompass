package com.csit321g2.tejano.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csit321g2.tejano.Entity.UsercampusEntity;

@Repository
public interface UsercampusRepository extends JpaRepository<UsercampusEntity, Integer>{

}
