package com.optfs.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Books {

	@Id
	@GeneratedValue
	private Integer bookId;

	private String bookName;
	private String authorName;
	private Integer price;
	
	

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Books(Integer bookId, String bookName, String authorName, Integer price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", price=" + price
				+ "]";
	}

}
