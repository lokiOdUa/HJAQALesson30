package info.dvad.test;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

import io.qameta.allure.Allure;
import org.testng.Assert;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class CommonSteps {
    @After
    public void after(Scenario s) throws IOException {
        if (s.isFailed()) {
            String filename = s.getName().replace(" ", "_") + "_" +
                    System.currentTimeMillis() + ".png";
            InputStream content = Files.newInputStream(Paths.get("src/test/resources/images/img.png"));
            Allure.addAttachment(filename, content);
        }
    }

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }


    @And("should fail sometimes")
    public void shouldFailSometimes() {
        long now = System.currentTimeMillis();
        System.out.println("Now is: " + now);
        if (now % 3 == 0) {
            Assert.fail("This scenario should fail sometimes ::: " + Arrays.toString(Thread.currentThread().getStackTrace()));
        }
    }

    @And("should fail always")
    public void shouldFailAlways() {
        Assert.fail("This scenario should fail *ALWAYS* ::: " + Arrays.toString(Thread.currentThread().getStackTrace()));
    }

    @Given("an example scenario run {string}")
    public void anExampleScenarioRun(String runId) {
    }
}
