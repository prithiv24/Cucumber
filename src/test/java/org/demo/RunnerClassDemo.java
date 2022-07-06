package org.demo;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Prithiv\\eclipse-workspace\\Cucumber\\demo.feature",
		glue="org.demo",
		dryRun=false,
		strict=true,
		monochrome=true,
		plugin= {"html:demoqa/reportdemoqa","json:json//report.json"}
		)
public class RunnerClassDemo {

}
