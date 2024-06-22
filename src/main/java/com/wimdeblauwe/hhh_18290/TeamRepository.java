package com.wimdeblauwe.hhh_18290;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, TeamId> {

  @Query("SELECT new com.wimdeblauwe.hhh_18290.TeamSummary(t.id, t.name) FROM Team t")
  List<TeamSummary> findAllSummary();
}
