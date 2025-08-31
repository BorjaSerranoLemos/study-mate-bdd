package com.studymate.bdd.steps;

import com.studymate.bdd.Calculadora;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraSteps {
  private Calculadora calc;
  private int resultado;

  @Given("una calculadora encendida")
  public void una_calculadora_encendida() {
    calc = new Calculadora();
  }

  @When("sumo {int} y {int}")
  public void sumo_y(Integer a, Integer b) {
    resultado = calc.suma(a, b);
  }

  @When("resto {int} y {int}")
  public void resto_y(Integer a, Integer b) {
    resultado = calc.resta(a, b);
  }

  @When("multiplico {int} y {int}")
  public void multiplico_y(Integer a, Integer b) {
    resultado = calc.multiplica(a, b);
  }

  @When("divido {int} y {int}")
  public void divido_y(Integer a, Integer b) {
    resultado = calc.divide(a, b);
  }

  @Then("el resultado es {int}")
  public void el_resultado_es(Integer esperado) {
    assertEquals(esperado.intValue(), resultado);
  }
}
