/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jtspringproject.JtSpringProject.controller;

import com.jtspringproject.JtSpringProject.services.cartService;
import com.jtspringproject.JtSpringProject.services.categoryService;
import com.jtspringproject.JtSpringProject.services.productService;
import com.jtspringproject.JtSpringProject.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author damilola
 */

@RestController
@RequestMapping("/api/v1")
public class ApiController {
    
    	@Autowired
	private userService userService;
	@Autowired
	private categoryService categoryService;
	@Autowired
	private productService productService;
        @Autowired
        private cartService cartService;
    
    @GetMapping("ping")
    public String ping()
    {
        return "hello world!";
    }
}
