package com.wimdeblauwe.hhh_18290;

import java.util.UUID;

public class TeamId implements EntityId {

  private UUID value;

  protected TeamId() {

  }

  public TeamId(UUID value) {
    this.value = value;
  }

  public UUID getValue() {
    return value;
  }
}
