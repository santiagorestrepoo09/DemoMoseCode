package com.mose.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mose.demo.model.model;

import Response.ResponseMorse;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@GetMapping("/getHola")
	public String getHole() {
		return "Hola principal";
	}
	
	@PostMapping("/postDecodeBits2Morse")
	public ResponseMorse postDecodeBits2Morse(@RequestBody model model) {
		ResponseMorse response = new ResponseMorse();
		response.setCode(HttpStatus.OK.value());
		response.setMessage(model.DecodeBits2Morse());
		return response;
	}
	
	@PostMapping("/postTranslate2Human")
	public ResponseMorse postTranslate2Human(@RequestBody model model) {
		ResponseMorse response = new ResponseMorse();
		response.setCode(HttpStatus.OK.value());
		response.setMessage(model.Translate2Human());
		return response;
	}
	
	@PostMapping("/postTranslate2Morse")
	public ResponseMorse postTranslate2Morse(@RequestBody model model) {
		ResponseMorse response = new ResponseMorse();
		response.setCode(HttpStatus.OK.value());
		response.setMessage(model.translate2Morse());
		return response;
	}
	
}
