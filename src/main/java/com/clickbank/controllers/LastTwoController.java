package com.clickbank.controllers;

import com.clickbank.models.LastTwo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by riveramoreira on 7/16/16.
 */
@Controller
public class LastTwoController {

    @RequestMapping("/lasttwo/{str}")
    @ResponseBody
    public LastTwo lastTwo(@PathVariable String str) {
        LastTwo lt = new LastTwo();

        if (str.length() < 2){
            lt.setAnswer("Answer didnt change: " + str);
            return lt;
        }

        lt.setAnswer("New answer: " + (str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) +
                        str.charAt(str.length() - 2)) );


        return lt;
    }
}
