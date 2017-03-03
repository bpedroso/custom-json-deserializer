package com.bpedroso.poc.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = JsonDeserializerCustom.class)
public class JsonOutputCustomDeserialized extends JsonOutput {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
