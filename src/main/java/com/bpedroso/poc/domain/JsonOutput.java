package com.bpedroso.poc.domain;

import java.io.Serializable;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JsonOutput implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;
	private String name;
	private Map<String, String> attributesFirst;
	private Map<String, String> attributesSecond;

	public JsonOutput() {
		super();
	}

	public JsonOutput(String code, String name, Map<String, String> attributesFirst, Map<String, String> attributesSecond) {
		super();
		this.code = code;
		this.name = name;
		this.attributesFirst = attributesFirst;
		this.attributesSecond = attributesSecond;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getAttributesFirst() {
		return attributesFirst;
	}

	public void setAttributesFirst(Map<String, String> attributesFirst) {
		this.attributesFirst = attributesFirst;
	}

	public Map<String, String> getAttributesSecond() {
		return attributesSecond;
	}

	public void setAttributesSecond(Map<String, String> attributesSecond) {
		this.attributesSecond = attributesSecond;
	}
	
	@Override
	public String toString() {
		return "JsonOutputDirectly [code=" + code + ", name=" + name + ", attributes=" + attributesFirst + "]";
	}
}
