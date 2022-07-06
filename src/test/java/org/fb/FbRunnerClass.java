package org.fb;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Prithiv\\eclipse-workspace\\Cucumber\\FbRegister.feature",
		glue="org.fb",
		dryRun=false,
		strict=true,
		monochrome=true,
		plugin= {"html:FbReg/Report"}
		//tags= {"@Facebook"}
		)

public class FbRunnerClass {

}
