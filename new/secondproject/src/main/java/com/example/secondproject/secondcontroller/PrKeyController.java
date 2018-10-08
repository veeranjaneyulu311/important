package com.example.secondproject.secondcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.secondproject.secondservice.PrKeyService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


@Api(description =  "REST APIs related to Student Entity!!!!")
@RestController
public class PrKeyController {
	
	@Autowired
    PrKeyService prKeyService;
	
	@ApiOperation("Creates a new register.")
	@PostMapping("/insertdetails")
	public String enterDetails(@ApiParam("Person information for a new person to be created.") @RequestBody Register register) {
		return prKeyService.enterService(register);
	}
	
	
								
}
																						