package br.com.arieltintel.apigames.controller;

import br.com.arieltintel.apigames.dto.GameDto;
import br.com.arieltintel.apigames.entity.Game;
import br.com.arieltintel.apigames.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GameDto> findAll(){
        return gameService.findAll();
    }

}
