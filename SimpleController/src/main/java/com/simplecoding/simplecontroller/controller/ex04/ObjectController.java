package com.simplecoding.simplecontroller.controller.ex04;

import com.simplecoding.simplecontroller.vo.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ObjectController {
//	따라하기 예제 1
    @GetMapping("/ex04/example01")
    public String example01(
            @ModelAttribute Member member
    ) {
        return "ex04/example01";
    }
}