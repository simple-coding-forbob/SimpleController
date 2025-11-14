/**
 * 
 */
package com.simplecoding.simplecontroller.controller.qz05;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author simple-coding
 * 
 */
@RestController
public class Quiz05AjaxController {
	@GetMapping(value="/qz05/ajax01", produces = "application/text; charset=UTF-8;")
	public String quiz01() {
		return "안녕 Ajax";
	}
}
