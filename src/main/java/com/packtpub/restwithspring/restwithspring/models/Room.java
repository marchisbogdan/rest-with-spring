package com.packtpub.restwithspring.restwithspring.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="rooms")
public class Room {
	private long id;
	private RoomCategory roomCategory;
	private String name;
	private String description;
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	
	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REFRESH}, fetch=FetchType.EAGER)
	public RoomCategory getRoomCategory() {
		return roomCategory;
	}
	
	@Column(name="name",unique=true, nullable=false, length=128)
	public String getName() {
		return name;
	}
	
	@Column(name="description")
	public String getDescription() {
		return description;
	}
	
	
}
