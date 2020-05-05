package com.madkroll.demo.testcontainers.web;

import com.madkroll.demo.testcontainers.dao.PlayerRepository;
import com.madkroll.demo.testcontainers.domain.Player;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PlayerController {

    private final PlayerRepository playerRepository;

    @GetMapping(path = "/players", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Iterable<Player>> summary() {
        return ResponseEntity
                .ok()
                .body(playerRepository.findAll());
    }
}
