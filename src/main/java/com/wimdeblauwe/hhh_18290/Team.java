package com.wimdeblauwe.hhh_18290;

import jakarta.persistence.Entity;

@Entity
public class Team extends AbstractEntity<TeamId> {

  private String name;

  protected Team() {
  }

  public Team(TeamId teamId, String name) {
    super(teamId);
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
