package com.ushwamala.book.gamification.controller;

import com.ushwamala.book.gamification.domain.LeaderBoardRow;
import com.ushwamala.book.gamification.service.LeaderBoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This class implements a REST API for the Gamification LeaderBoard service.
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/leaders")
class LeaderBoardController {

    private final LeaderBoardService leaderBoardService;

    @GetMapping
    public List<LeaderBoardRow> getLeaderBoard() {
        return leaderBoardService.getCurrentLeaderBoard();
    }
}
