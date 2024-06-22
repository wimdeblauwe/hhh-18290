package com.wimdeblauwe.hhh_18290;

public class TeamSummary {

  private final TeamId id;
  private final String name;

  public TeamSummary(TeamId id, String name) {
    this.id = id;
    this.name = name;
  }

  public TeamId getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
