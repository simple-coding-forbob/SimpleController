/**
 * 
 */
package com.simplecoding.simplecontroller.controller.qz05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author simple-coding
 *
 */
@Controller
public class Quiz05Controller {
	@GetMapping("/qz05/quiz01")
    public String example01() {
        return "qz05/quiz01";
    }
}
