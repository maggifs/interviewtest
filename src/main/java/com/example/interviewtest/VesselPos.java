package com.example.interviewtest;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class VesselPos {

  private @Id @GeneratedValue Long id;
  
  @Embedded
  private Vessel vessel;

  @Embedded
  private Position position;
  
  public VesselPos() {}

  public VesselPos(Vessel vessel, Position position) {
    this.vessel = vessel;
    this.position = position;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Vessel getVessel() {
    return vessel;
  }

  public void setVessel(Vessel vessel) {
    this.vessel = vessel;
  }

  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }
}