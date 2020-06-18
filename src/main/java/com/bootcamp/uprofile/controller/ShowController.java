package com.bootcamp.uprofile.controller;

import com.bootcamp.uprofile.domain.Show;
import com.bootcamp.uprofile.service.ShowService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ShowController {

    @Resource
    ShowService showService;

    @RequestMapping("/shows")
    public List<Show> shows() {
        return showService.findAll();
    }
}
