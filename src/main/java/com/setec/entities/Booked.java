package com.setec.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "tbl_booked")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booked {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String phoneNumber;
  private String email;
  private String date;
  private String time;
  private int person;
  
  
  @Override
  public String toString() {
      return String.format(
          "📋 Booking Details:\n" +
          "🆔 Booking ID: %d\n" +
          "👤 Name: %s\n" +
          "📧 Email: %s\n" +
          "📱 Phone: %s\n" +
          "📅 Date: %s\n" +
          "⏰ Time: %s\n" +
          "🧑‍🤝‍🧑 Person: %d",
          id, name, email, phoneNumber, date, time, person 
      );
  }
}