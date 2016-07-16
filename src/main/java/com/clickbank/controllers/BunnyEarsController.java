package com.clickbank.controllers;

import com.clickbank.models.BunnyEars;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by riveramoreira on 7/16/16.
 */
@Controller
public class BunnyEarsController {
    @RequestMapping("/bunnyears/{bunnies}")
    @ResponseBody
    public BunnyEars bunnyEarsPath(@PathVariable int bunnies){
        int oldBunnies = bunnies;
        BunnyEars be = new BunnyEars();
        int answer = bunnyEars(bunnies);
        be.setAnswer("The total ears for bunnies: " + oldBunnies + " is: " + answer);
        return be;
    }

    private int bunnyEars(int bunnies){
        if(bunnies == 0){
            return 0;
        }else{
            bunnies--;
            return bunnyEars(bunnies) + 2;
        }
    }


}
