package com.example.cicd.CI_CD_sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public String greet(@RequestParam(name = "name", required = false, defaultValue = "World") String aName)
    {
        return "Hello " + aName;
    }
}
