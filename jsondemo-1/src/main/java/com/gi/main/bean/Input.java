package com.gi.main.bean;

import java.io.Serializable;  

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.JsonNode;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;


@JsonInclude(value = Include.NON_NULL)
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
@Entity
@Table(name = "input")
public class Input implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	@Type(type = "jsonb")
	@Column(columnDefinition = "jsonb")
	private JsonNode data;

	public long getId() {
			return id;
	}

	public void setId(long id) {
			this.id = id;
	}

	public JsonNode getData() {
			return data;
	}

	public void setData(JsonNode data) {
			this.data = data;

	}
	
}
