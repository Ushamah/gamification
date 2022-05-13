package com.ushwamala.book.gamification.service;

import com.ushwamala.book.gamification.domain.LeaderBoardRow;
import com.ushwamala.book.gamification.repository.ScoreCardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
class LeaderBoardServiceImpl implements LeaderBoardService {

    private final ScoreCardRepository scoreCardRepository;

    @Override
    public List<LeaderBoardRow> getCurrentLeaderBoard() {
        return scoreCardRepository.findFirst10();
    }
}