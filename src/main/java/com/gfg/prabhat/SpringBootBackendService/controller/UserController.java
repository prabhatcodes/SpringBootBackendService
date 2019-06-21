package com.gfg.prabhat.SpringBootBackendService.controller;

import com.gfg.prabhat.SpringBootBackendService.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    UserDaoService userDaoService;


}
