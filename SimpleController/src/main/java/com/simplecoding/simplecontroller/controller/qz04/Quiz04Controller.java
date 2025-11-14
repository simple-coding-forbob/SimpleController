/**
 * 
 */
package com.simplecoding.simplecontroller.controller.qz04;

import com.simplecoding.simplecontroller.vo.Dept;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * @author simple-coding
 *
 */
@Controller
public class Quiz04Controller {
    
	// 퀴즈 2
    @GetMapping("/qz04/quiz01")
    public String quiz01(
            @ModelAttribute Dept dept
    ) {
        return "qz04/quiz01";
    }
}
