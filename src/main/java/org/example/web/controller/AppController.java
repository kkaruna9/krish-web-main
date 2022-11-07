package org.example.web.controller;

import org.example.web.model.AppResData;
import org.example.web.services.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/process")
public class AppController {

    @Autowired
    AppService appService;

    @GetMapping("/{input}")
    public ResponseEntity<AppResData> getResponseData(@PathVariable final Integer input) {
        return ResponseEntity.ok(appService.processRequest(input));
    }

}
