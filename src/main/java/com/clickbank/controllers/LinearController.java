package com.clickbank.controllers;

import com.clickbank.models.Linear;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by riveramoreira on 7/13/16.
 */
@Controller
public class LinearController {
    @RequestMapping("/linearin/{outerStr}/{innerStr}")
    @ResponseBody
    public Linear linearIn(@PathVariable String outerStr, @PathVariable String innerStr) {
        System.out.println("inside linearIn controller!");



        Linear linear = new Linear();
            linear.setAnswer("this is only a test outer: " + outerStr + " inner: " + innerStr);


        String[] outerArr = outerStr.split("@");

        int[] outer = new int[outerArr.length];

        for (int i = 0; i < outerArr.length; i++) {
            try {
                outer[i] = Integer.parseInt(outerArr[i]);
            } catch (NumberFormatException nfe) {
                System.out.println("Error from outer string to array " + nfe.toString());
            }
        }

        String[] innerArr = innerStr.split("@");

        int[] inner = new int[innerArr.length];

        for (int i = 0; i < innerArr.length; i++) {
            try {
                inner[i] = Integer.parseInt(innerArr[i]);
            } catch (NumberFormatException nfe) {
                System.out.println("Error from inner string to array " + nfe.toString());
            }
        }



        int count = 0;

        for (int i = 0; i < outer.length && count < inner.length; i++){
            if (outer[i] == inner[count]) {
                count++;
            }else{
                System.out.println("Error in the forloop");
            }
        }
        if(count == inner.length) {
            linear.setAnswer("All the numbers in 'inner' are present in outer!");
        }else{
            linear.setAnswer("*Not* all of the numbers were present in outer");
        }


        return linear;

    }
}
