package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/skeleton/case1.feature","src/test/resources/skeleton/case2.feature","src/test/resources/skeleton/case3.feature","src/test/resources/skeleton/case4.feature"},glue="skeleton", plugin ="json:target/reportjson.json")
public class RunCukesTest {
}
