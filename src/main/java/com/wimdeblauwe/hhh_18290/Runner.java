package com.wimdeblauwe.hhh_18290;

import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class Runner implements ApplicationRunner {

  private final TeamRepository repository;

  public Runner(TeamRepository repository) {
    this.repository = repository;
  }

  @Override
  public void run(ApplicationArguments args) throws Exception {
    List<TeamSummary> allSummary = repository.findAllSummary();
    System.out.println("allSummary = " + allSummary);
  }
}
