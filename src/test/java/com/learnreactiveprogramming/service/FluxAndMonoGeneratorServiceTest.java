package com.learnreactiveprogramming.service;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class FluxAndMonoGeneratorServiceTest {
    
    FluxAndMonoGeneratorService fluxAndMonoGeneratorService = new FluxAndMonoGeneratorService();

    @Test
    void namesFlux() {
        // given

        // when
        Flux<String> namesFlux = fluxAndMonoGeneratorService.nameFlux();

        // then
        StepVerifier.create(namesFlux)              // Part of the reactor.test Api
//                .expectNext("alex", "ben", "chloe")
//                .expectNextCount(3)
                .expectNext("alex")
                .expectNextCount(2)
                .verifyComplete();
    }

    @Test
    void namesMono() {
        //given

        // when
        Mono<String> name = fluxAndMonoGeneratorService.nameMono();

        // then
        StepVerifier.create(name)
//                .expectNextCount(1);
                .expectNext("alex")
                .verifyComplete();
    }

    @Test
    void namesFlux_map() {
        // given

        // when
        Flux<String> namesFlux = fluxAndMonoGeneratorService.namesFlux_map();

        // then
        StepVerifier.create(namesFlux)
                .expectNext("ALEX", "BEN", "CHLOE")
                .verifyComplete();
    }
}
