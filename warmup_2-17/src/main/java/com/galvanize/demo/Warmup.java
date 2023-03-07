package com.galvanize.demo;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
class Warmup{

	@GetMapping("/")
	public String getDirectory(){
		return "you got /";
	}
	@GetMapping("/{id}")
	public String getId(@PathVariable String id){
		return "You got " + id;
	}
}