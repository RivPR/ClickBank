package com.clickbank.controllers;

import com.clickbank.models.WithoutString;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by riveramoreira on 7/16/16.
 */
@Controller
public class WithoutStringController {

        @RequestMapping("/withoutstring/{base}/{remove}")
        @ResponseBody
        public WithoutString withoutString(@PathVariable String base, @PathVariable String remove){
            WithoutString ws = new WithoutString();
            int counter = 0;
            int lengthBase = base.length();
            int lengthRemove = remove.length();

            int cursorLocation;


            StringBuilder answer = new StringBuilder(lengthBase);

            String lowerCaseBase = base.toLowerCase();
            String lowerCaseRemove = remove.toLowerCase();
            cursorLocation = lowerCaseBase.indexOf(lowerCaseRemove);

            while(cursorLocation >= 0){
                for( ; counter < cursorLocation; counter++){
                    answer.append(base.charAt(counter));
                }
                counter = cursorLocation + lengthRemove;
                cursorLocation = lowerCaseBase.indexOf(lowerCaseRemove, counter);
            }

            for( ; counter < lengthBase; counter++){
                answer.append(base.charAt(counter));
            }

            ws.setAnswer("Your result: " + answer.toString() );
            return ws;
        }


}
