package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Storage {
	@Id
	private int storageNo;
	private int capacity;
	private String type;		//dry, cold, long term
	
	public int getStorageNo() {
		return storageNo;
	}
	public void setStorageNo(int storageNo) {
		this.storageNo = storageNo;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
