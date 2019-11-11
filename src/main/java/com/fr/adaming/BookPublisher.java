package com.fr.adaming;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Entity
public class BookPublisher implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @ManyToOne
    @JoinColumn
    private Book book;

    @Id
    @ManyToOne
    @JoinColumn
    private Publisher publisher;

    public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	public Date getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}
	public String getHeure() {
		return heure;
	}
	public void setHeure(String heure) {
		this.heure = heure;
	}
	public String getStastique() {
		return stastique;
	}
	public void setStastique(String stastique) {
		this.stastique = stastique;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private Date publishedDate;
   private String heure;
   private String stastique;
    public BookPublisher(Publisher publisher, Date publishedDate) {
        this.publisher = publisher;
        this.publishedDate = publishedDate;
    }
 

   
}
