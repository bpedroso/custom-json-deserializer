package com.bpedroso.poc.domain;

import java.io.Serializable;

public class JsonInput implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String code;
	private String name;
	private String first_common_Tipo;
	private String first_common_Valor;
	private String first_common_Uso;
	private String first_common_Promocao;
	private String second_common_Size;
	private String second_common_Gender;
	private String second_common_Flavor;
	private String second_common_Color;

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

	public String getFirst_common_Tipo() {
		return first_common_Tipo;
	}

	public void setFirst_common_Tipo(String first_common_Tipo) {
		this.first_common_Tipo = first_common_Tipo;
	}

	public String getFirst_common_Valor() {
		return first_common_Valor;
	}

	public void setFirst_common_Valor(String first_common_Valor) {
		this.first_common_Valor = first_common_Valor;
	}

	public String getFirst_common_Uso() {
		return first_common_Uso;
	}

	public void setFirst_common_Uso(String first_common_Uso) {
		this.first_common_Uso = first_common_Uso;
	}

	public String getFirst_common_Promocao() {
		return first_common_Promocao;
	}

	public void setFirst_common_Promocao(String first_common_Promocao) {
		this.first_common_Promocao = first_common_Promocao;
	}

	public String getSecond_common_Size() {
		return second_common_Size;
	}

	public void setSecond_common_Size(String second_common_Size) {
		this.second_common_Size = second_common_Size;
	}

	public String getSecond_common_Gender() {
		return second_common_Gender;
	}

	public void setSecond_common_Gender(String second_common_Gender) {
		this.second_common_Gender = second_common_Gender;
	}

	public String getSecond_common_Flavor() {
		return second_common_Flavor;
	}

	public void setSecond_common_Flavor(String second_common_Flavor) {
		this.second_common_Flavor = second_common_Flavor;
	}

	public String getSecond_common_Color() {
		return second_common_Color;
	}

	public void setSecond_common_Color(String second_common_Color) {
		this.second_common_Color = second_common_Color;
	}

	@Override
	public String toString() {
		return "JsonInput [code=" + code + ", name=" + name + ", first_common_Tipo=" + first_common_Tipo
				+ ", first_common_Valor=" + first_common_Valor + ", first_common_Uso=" + first_common_Uso
				+ ", first_common_Promocao=" + first_common_Promocao + ", second_common_Size=" + second_common_Size
				+ ", second_common_Gender=" + second_common_Gender + ", second_common_Flavor=" + second_common_Flavor
				+ ", second_common_Color=" + second_common_Color + "]";
	}

}
