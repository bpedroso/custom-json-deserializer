package com.bpedroso.poc.controller;

import static com.bpedroso.poc.controller.constants.ControllerConstants.CONTENT;
import static com.bpedroso.poc.controller.constants.ControllerConstants.PARSER;
import static com.bpedroso.poc.controller.constants.ControllerConstants.V1;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bpedroso.poc.domain.JsonInput;
import com.bpedroso.poc.usecases.MapJson;

@RestController
@RequestMapping(value = CONTENT + V1)
public class JsonParserController {

	private final Logger LOGGER = LoggerFactory.getLogger(JsonParserController.class);

	@Autowired
	private MapJson useCaseMapJson;

	@PostMapping(value = PARSER, produces = APPLICATION_JSON_UTF8_VALUE, consumes = APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<String> list(@RequestBody(required = true) JsonInput jsonValue) {
		ResponseEntity<String> responseEntity;
		try {
			responseEntity = new ResponseEntity<String>(this.useCaseMapJson.find(jsonValue), HttpStatus.OK);
		} catch (Exception e) {
			LOGGER.error("Fail to response " + e.getMessage());
			responseEntity = new ResponseEntity<String>("{\"error\": " + e.getMessage() + "}",
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
}