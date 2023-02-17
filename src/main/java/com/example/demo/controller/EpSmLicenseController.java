package com.example.demo.controller;

import com.example.demo.entity.EpSmLicense;
import com.example.demo.repository.EpSmLicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;

@RestController
@RequestMapping("/license")
public class EpSmLicenseController {
    
    @Autowired
    private EpSmLicenseRepository epSmLicenseRepository;
    
    @GetMapping("/all")
    public Mono<EpSmLicense> list(){
        return Mono.from(epSmLicenseRepository.findById(82L)).delayElement(Duration.ofMillis(50));
    }

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    
}
