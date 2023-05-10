package com.gabsvitorio.dslist.services;

import com.gabsvitorio.dslist.dto.GameDTO;
import com.gabsvitorio.dslist.dto.GameListDTO;
import com.gabsvitorio.dslist.dto.GameMinDTO;
import com.gabsvitorio.dslist.entities.Game;
import com.gabsvitorio.dslist.entities.GameList;
import com.gabsvitorio.dslist.repositories.GameListRepository;
import com.gabsvitorio.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }
}
