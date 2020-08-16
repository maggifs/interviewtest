package com.example.interviewtest;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.PrePersist;

@Embeddable
public class Position {
  private Date date;

  // Creates a column for repository to add receivedDate when POST object
  @Column(name = "received_date")
  private Date receivedDate;

  private Number latitude; 
  private Number longitude;
  private Number speed;

  // Adds date value to receivedDate
  @PrePersist
  void receivedDate() {
    this.receivedDate = new Date();
  }

  Position() {
  }

  Position(Date date, Number latitude, Number longitude, Number speed) {
    this.date = date;
    this.latitude = latitude;
    this.longitude = longitude;
    this.speed = speed;
  }
  
  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Date getReceivedDate() {
    return receivedDate;
  }

  public void setReceivedDate(Date receivedDate) {
    this.receivedDate = receivedDate;
  }
  
  public Number getSpeed() {
    return speed;
  }

  public void setSpeed(Number speed) {
    this.speed = speed;
  }

  public Number getLongitude() {
    return longitude;
  }

  public void setLongitude(Number longitude) {
    this.longitude = longitude;
  }

  public Number getLatitude() {
    return latitude;
  }

  public void setLatitude(Number latitude) {
    this.latitude = latitude;
  }
}