package com.ushwamala.book.gamification.controller;

import com.ushwamala.book.gamification.domain.GameStats;
import com.ushwamala.book.gamification.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class implements a REST API for the Gamification User Statistics service.
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/stats")
class UserStatsController {

    private final GameService gameService;

    @GetMapping
    public GameStats getStatsForUser(@RequestParam("userId") final Long userId) {
        return gameService.retrieveStatsForUser(userId);
    }
}
