package com.ratemy.rma.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
public class ATL {
@Entity
@Table(name = "ATL")
public class Atlanta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "Rating")
	private int rating;

	@Column(name = "City")
	private String city;

	@Column(name = "Date")
	private String date;
}
}
