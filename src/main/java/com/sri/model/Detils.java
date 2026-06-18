package com.sri.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "details")
@Entity(name = "Details")
public class Detils {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 @Column(name = "name")
 private String name;	
 @Column(name = "age")
 private Integer age;
 @Column(name = "gender")
 private String gender;
}
