package com.example.entities;
//Borrow Entity
@Entity
public class Borrow {

	@Id
	private Long id;
	private Long userId;
	private Long bookId;
	private Date dueDate;
	
	public Borrow() {
		
	}

	public Borrow(Long id, Long userId, Long bookId, Date dueDate) {
		this.id = id;
		this.userId = userId;
		this.bookId = bookId;
		this.dueDate = dueDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "Borrow [id=" + id + ", userId=" + userId + ", bookId=" + bookId + ", dueDate=" + dueDate + "]";
	}
	
	
}

