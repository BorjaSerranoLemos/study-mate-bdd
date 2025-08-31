package com.studymate.bdd.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class IsItFridaySteps {
  private String today;
  private String answer;

  @Given("today is {string}")
  public void today_is(String day) {
    this.today = day;
  }

  @When("I ask whether it's Friday yet")
  public void i_ask_whether_its_friday_yet() {
    this.answer = "Friday".equalsIgnoreCase(this.today) ? "TGIF" : "Nope";
  }

  @Then("I should be told {string}")
  public void i_should_be_told(String expected) {
    assertEquals(expected, this.answer);
  }
}
