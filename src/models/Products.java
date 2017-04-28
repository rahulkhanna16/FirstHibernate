package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Products {
	@Id
	private int productId;
	private String name;
	
	private String physical_condition;
	private String type;
	
	@Temporal(TemporalType.DATE)
	private Date expiry;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhysical_condition() {
		return physical_condition;
	}
	public void setPhysical_condition(String physical_condition) {
		this.physical_condition = physical_condition;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getExpiry() {
		return expiry;
	}
	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}
	
	
}
