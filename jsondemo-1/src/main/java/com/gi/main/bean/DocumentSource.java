package com.gi.main.bean;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class DocumentSource {

	private boolean associated;
    private String section;
    private String type;
    
}
