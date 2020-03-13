package com.test.spring_test.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Table
@Entity
public class Money {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private Double money;

	@Column
	private Double percent;

}

