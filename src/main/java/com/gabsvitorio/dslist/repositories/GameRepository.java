package com.gabsvitorio.dslist.repositories;

import com.gabsvitorio.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
