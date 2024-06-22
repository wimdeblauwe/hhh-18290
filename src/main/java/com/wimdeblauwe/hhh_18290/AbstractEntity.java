package com.wimdeblauwe.hhh_18290;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity<T extends EntityId> {

  @EmbeddedId
  private T id;

  protected AbstractEntity() {
  }

  protected AbstractEntity(T id) {
    this.id = id;
  }

  public T getId() {
    return id;
  }
}
