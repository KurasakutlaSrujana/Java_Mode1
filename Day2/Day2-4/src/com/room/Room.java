package com.room;

public class Room {
	private int roomNo;
	private String roomType;
	private String roomArea;
	private String acMachine;
	
	public void setData(int roomNo,String roomType,String roomArea,String acMachine) {
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.roomArea = roomArea;
		this.acMachine = acMachine;		
	}
	public String displayData() {
		return "RoomNumber " +roomNo +" RoomType " +roomType +" RoomArea "+roomArea+" AcMachine "+acMachine;
	}
	
}
