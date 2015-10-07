package com.fission.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="Movie")
public class Movie {
	
	@Id
	@Column(name="id")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Name")
	private String Name;
	
	@Column(name="Director")
	private String Director;
	
	@Column(name="Language")
	private String Language;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDirector() {
		return Director;
	}
	public void setDirector(String director) {
		Director = director;
	}
	/*public Date getRelease() {
		return Release;
	}
	public void setRelease(java.util.Date date) {
		Release = date;
	}*/
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	
	

}
