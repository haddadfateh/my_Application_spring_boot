package com.fstj.crud_mediatech.controllers;

import com.fstj.crud_mediatech.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClientController {


    @Autowired
    @Qualifier("impl2")
    private ClientService clientService;
}