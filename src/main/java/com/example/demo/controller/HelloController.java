/**
 *
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pgy
 *
 */
@RestController
public class HelloController {

	@RequestMapping("/")
	public String hello() {
		return "Hello World";
	}
}
