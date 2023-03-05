package com.crud.sqlserver.models;

import java.sql.Timestamp;

public class Cards {
	int id_card;
	String name;
	String number;
	String type;
	Integer cvv;
	Integer status;
	Integer created_by;
	Timestamp created_at;
	Timestamp updated_at;
	
	public int getId_card() {
		return id_card;
	}
	public void setId_card(int id_card) {
		this.id_card = id_card;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public int getCreated_by() {
		return created_by;
	}
	public void setCreated_by(Integer created_by) {
		this.created_by = created_by;
	}
	public Timestamp getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
	public Timestamp getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}
	@Override
	public String toString() {
		return "Cards [id_card=" + id_card + ", name=" + name + ", number=" + number + ", type=" + type + ", cvv=" + cvv
				+ ", status=" + status + ", created_by=" + created_by + ", created_at=" + created_at + ", updated_at="
				+ updated_at + "]";
	}
	
}