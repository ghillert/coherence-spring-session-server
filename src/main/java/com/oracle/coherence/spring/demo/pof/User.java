package com.oracle.coherence.spring.demo.pof;

import com.tangosol.io.pof.schema.annotation.PortableType;

import java.io.Serializable;

@PortableType(id = 5000)
public class User implements Serializable {

	private static final long serialVersionUID = 5000L;
	
	private String name;
	private String email;

	public User() {
		this.name = "N/A";
		this.email = "N/A";
	}

	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
