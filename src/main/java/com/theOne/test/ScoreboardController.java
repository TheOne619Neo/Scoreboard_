package com.theOne.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The ScoreboardController class exposes REST endpoints to interact with the scoreboard.
 */
@RestController
public class ScoreboardController {

    @Autowired
    private Scoreboard scoreboard;

    /**
     * Endpoint to add a player to the scoreboard.
     * @param player The player to add.
     */
    @PostMapping("/addPlayer")
    public void addPlayer(@RequestBody Player player) {
        scoreboard.addPlayer(player);
    }

    /**
     * Endpoint to get the list of top players.
     * @return A list of the top players.
     */
    @GetMapping("/topPlayers")
    public List<Player> getTopPlayers() {
        return scoreboard.getTopPlayers();
    }
}