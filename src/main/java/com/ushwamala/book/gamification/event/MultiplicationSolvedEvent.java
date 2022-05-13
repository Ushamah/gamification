package com.ushwamala.book.gamification.event;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Event received when a multiplication has been solved in the system.
 * Provides some context information about the multiplication.
 */
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class MultiplicationSolvedEvent implements Serializable {
    private final Long multiplicationResultAttemptId;
    private final Long userId;
    private final boolean correct;
}
