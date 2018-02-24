package org.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

	@Id
	private String id;
	private int corason;
	
	public Topic() {
		
	}
	
	public Topic(String id, int corason) {
		super();
		this.id = id;
		this.corason=corason;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getCorason() {
		return corason;
	}
	public void setName(int corason) {
		this.corason = corason;
	}
	
}
