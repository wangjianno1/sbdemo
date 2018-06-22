package com.bat.sbdemo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("/world")
    public String sayHello() {
		String result = "Hello Guys~~~~";
		String resJson = "{\"Hello\": \"World\"}";
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("beijing");
		list.add("tianjin");
		list.add("chongqing");
		list.add("shanghai");
        return list.toString();
    }
}
