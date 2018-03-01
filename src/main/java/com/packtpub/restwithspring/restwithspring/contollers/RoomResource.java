package com.packtpub.restwithspring.restwithspring.contollers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.packtpub.restwithspring.restwithspring.models.dtos.RoomDTO;
import com.packtpub.restwithspring.restwithspring.services.interfaces.InventoryService;

@RestController
@RequestMapping("/rooms")
public class RoomResource {

	private final InventoryService inventoryService;

	public RoomResource(InventoryService inventoryService) {
		this.inventoryService = inventoryService;
	}
	
	@RequestMapping(value="/{roomId}",method=RequestMethod.GET)
	public RoomDTO getRoom(@PathVariable("roomId") String roomId){
		RoomDTO room = new RoomDTO();
		return room;
	}
	
	
}
