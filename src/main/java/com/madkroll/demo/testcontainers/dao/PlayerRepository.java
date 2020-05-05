package com.madkroll.demo.testcontainers.dao;

import com.madkroll.demo.testcontainers.domain.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
}
