package com.learnreactiveprogramming.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class FluxAndMonoGeneratorService {

    public Flux<String> nameFlux() {
        return Flux.fromIterable(List.of("alex", "ben", "chloe")).log();  // in reality comes from a db or a remote service call
    }

    public Mono<String> nameMono() {
        return Mono.just("alex").log();
    }

    public Flux<String> namesFlux_map() {
        return Flux.fromIterable(List.of("alex", "ben", "chloe"))
                .map(String::toUpperCase)
                .log();
    }

    public static void main(String[] args) {

        FluxAndMonoGeneratorService service = new FluxAndMonoGeneratorService();

        service.nameFlux()
                .subscribe(name -> System.out.println("Name is: " + name));

        service.nameMono()
                .subscribe(name -> System.out.println(("Mono name is: " + name)));
    }
}
