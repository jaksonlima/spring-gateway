package com.app.gateway.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/uuid")
public class UUIDController {

    record Type(UUID uuid) {
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> findAllUUID() {
        List<Type> types = List.of(
                new Type(UUID.randomUUID()),
                new Type(UUID.randomUUID()),
                new Type(UUID.randomUUID())
        );
        return ResponseEntity.ok(types);
    }

}
