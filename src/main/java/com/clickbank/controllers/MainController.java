package com.clickbank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by riveramoreira on 7/10/16.
 */

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(){

        return "index";
    }

}
