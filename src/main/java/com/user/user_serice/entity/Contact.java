package com.user.user_serice.entity;

public class Contact {
	
	private String contactName;
	private Long contactId;
	private String email;
	private Long userId;
	
	public Contact(String contactName, Long contactId, String email, Long userId) {
		super();
		this.contactName = contactName;
		this.contactId = contactId;
		this.email = email;
		this.userId = userId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Long getContactId() {
		return contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
}
