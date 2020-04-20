package com.gome.gateway.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gome.gateway.response.ResponseBase;

@RestController
public class GatewayController {
	@RequestMapping(value="/garbage/failure")
	public ResponseBase failure() {
		return new ResponseBase(-1, "Garbage-service is fail.");
	}
}