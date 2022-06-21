package com.redhat.quarkus.fedex.domain;

import java.time.LocalDate;

public class Label {
  
  private String id;

  private LocalDate creationDateTime;

  public Label() {
  }

  public Label(String id, LocalDate creationDateTime) {
    this.id = id;
    this.creationDateTime = creationDateTime;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LocalDate getCreationDateTime() {
    return this.creationDateTime;
  }

  public void setCreationDateTime(LocalDate creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", creationDateTime='" + getCreationDateTime() + "'" +
      "}";
  }

}
