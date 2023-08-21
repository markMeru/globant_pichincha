package org.example.runner;

import org.junit.runner.RunWith; 
import io.cucumber.junit.CucumberOptions; 
import net.serenitybdd.cucumber.CucumberWithSerenity; 
 
@RunWith(CucumberWithSerenity.class) 
@CucumberOptions(plugin = {}, features = "src/test/resources/features/ShopPage.feature", 
  glue="org.example.definitions")
public class SerenityRunnerTest {

}
