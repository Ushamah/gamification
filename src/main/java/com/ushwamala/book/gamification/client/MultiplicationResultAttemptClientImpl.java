package com.ushwamala.book.gamification.client;

import com.ushwamala.book.gamification.client.dto.MultiplicationResultAttempt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * This implementation of MultiplicationResultAttemptClient interface connects to
 * the Multiplication microservice via REST.
 */
@Component
class MultiplicationResultAttemptClientImpl implements MultiplicationResultAttemptClient {

    private final RestTemplate restTemplate;
    private final String multiplicationHost;

    @Autowired
    public MultiplicationResultAttemptClientImpl(final RestTemplate restTemplate,
                                                 @Value("${multiplicationHost}") final String multiplicationHost) {
        this.restTemplate = restTemplate;
        this.multiplicationHost = multiplicationHost;
    }

    @Override
    public MultiplicationResultAttempt retrieveMultiplicationResultAttemptById(final Long multiplicationResultAttemptId) {
        String url = multiplicationHost + "/results/" + multiplicationResultAttemptId;
        return restTemplate.getForObject(url, MultiplicationResultAttempt.class);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
