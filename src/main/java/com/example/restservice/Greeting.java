package com.example.restservice;

// Java class with private final long id and  private final String content
public class Greeting {
    private final long id;
    private final String content;
	
	public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
	}
	
	public long getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}
}

// Greting es una clase que representa el objeto que le devuelvo a que llama la api rest
// lo que le llega no es objeto java sino un json