package br.com.arieltintel.apigames.service;

import br.com.arieltintel.apigames.dto.GameDto;
import br.com.arieltintel.apigames.entity.Game;
import br.com.arieltintel.apigames.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameRepository gameRepository;

    public List<GameDto> findAll(){
        List<Game> gameList = gameRepository.findAll();
        return gameList.stream()
                .map(GameDto::new)
                .collect(Collectors.toList());
    }


}
