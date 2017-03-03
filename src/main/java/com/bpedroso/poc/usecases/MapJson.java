package com.bpedroso.poc.usecases;

import java.io.IOException;

import org.springframework.stereotype.Component;

import com.bpedroso.poc.domain.JsonInput;
import com.bpedroso.poc.domain.JsonOutputCustomDeserialized;
import com.bpedroso.poc.domain.JsonOutput;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class MapJson {

	public String find(final JsonInput jsonInput) throws JsonParseException, JsonMappingException, IOException {
		final ObjectMapper mapper = new ObjectMapper();
		final String input = mapper.writeValueAsString(jsonInput);
		final JsonOutput output = mapper.readValue(input, JsonOutputCustomDeserialized.class);
		return mapper.writeValueAsString(output);
	}
}
