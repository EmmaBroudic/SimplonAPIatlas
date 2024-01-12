package co.simplon.atlas.api.entities;

import java.util.UUID;

public class River {
	private UUID id;
	private String name;
	private int length;
	private String source;
	private String mouth;
	
	public River() {
	}
	
	public UUID getId() {
		return this.id;
	}
	
	public void setId(UUID id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public String getSource() {
		return this.source;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	
	public String getMouth() {
		return this.mouth;
	}
	
	public void setMouth(String mouth) {
		this.mouth = mouth;
	}
}
