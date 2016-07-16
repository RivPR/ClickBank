package com.clickbank.controllers;

/**
 * Created by riveramoreira on 7/13/16.
 */

import com.clickbank.models.Mbr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MakeBricksController {

    @RequestMapping("/makebricks/{big}/{small}/{goal}")
    @ResponseBody
    public Mbr makeBricks(@PathVariable int big, @PathVariable int small, @PathVariable int goal){
        Mbr makebricks = new Mbr();
            if(goal > ((big * 5)+ small) ){
                makebricks.setAnswer("There is not enough bricks!");
            }else if(small < goal % 5 ){
                makebricks.setAnswer("There are not enough small bricks!");
            }else{
                makebricks.setAnswer("You have enough bricks!");
            }

        return makebricks;

    }


}


