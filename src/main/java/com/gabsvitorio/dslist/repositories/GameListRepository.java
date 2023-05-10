package com.gabsvitorio.dslist.repositories;

import com.gabsvitorio.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
