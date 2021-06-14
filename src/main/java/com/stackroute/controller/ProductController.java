package com.stackroute.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api
@RequestMapping("/product")
public class ProductController {
	
	@GetMapping("/")
	@ApiOperation(value="SHOW PRODUCT DETAILS")
	public String getProduct() {
		return "Show product details";
	}
}
