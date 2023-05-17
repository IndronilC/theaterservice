package com.bookmyticket.theaterservice.data.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Getter
@Setter
@Accessors(fluent = true, chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Theater")
public class Theater implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int Id;
   @NotEmpty(message="Theater Name is required")
   private String theaterName;
   @NotEmpty(message="Address of Theater should not be empty")
   private String address;
   @Column(nullable = false, name = "city")
   private String city;
   @Column(nullable = false, name="country")
   private String country;
   @Column(nullable = false, name="state")
   private String state;
   @Column(nullable = false, name="zipCode")
   private String zipCode;
   @Column(nullable = false, name="contactNo")
   private String contactNo;


}

