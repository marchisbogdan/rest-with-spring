package com.packtpub.restwithspring.restwithspring.models.dtos;

import java.io.Serializable;

public class RoomDTO implements Serializable{

	private static final long serialVersionUID = 3409704690298540975L;
	
	private String id;
	private String name;
	private String roomCategoryId;
	private String description;
	
	public RoomDTO() {
	}
	
	public RoomDTO(String id, String name, String roomCategoryId, String description) {
		super();
		this.id = id;
		this.name = name;
		this.roomCategoryId = roomCategoryId;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getRoomCategoryId() {
		return roomCategoryId;
	}

	public String getDescription() {
		return description;
	}
}
