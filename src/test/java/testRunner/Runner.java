package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(        features= {".//Features//Login.feature"},
		//features= {".//Features/LoginDDT.feature"}, single file run
		//features= {".//Features/LoginDDT.feature"}, single file run
        //features= {".//Features/LoginDDTExcel.feature"}, single file run
        //features= {".//Features/Login.feature",".//Features/AccountRegistration.feature"}, multiple runner classes to run
        //features="@target/rerun.txt",   // Runs only failures
		//features= {".//Features/LoginDDTExcel.feature"},
    glue="stepDefinitions",
    plugin= {
		"pretty", "html:reports/myreport.html", 
		"json:reports/myreport.json"
		},    //Mandatory to capture failures
dryRun=false,
monochrome=true,
tags = "@sanity"	//Scenarios tagged with @sanity,
//tags = "@sanity and @regression"	//Scenarios tagged with both @sanity and @regression
//tags = "@sanity or @regression"	 //Scenarios tagged with either @sanity or @regression
//tags = "@sanity and not @regression", //Scenarios tagged with @sanity but not tagged with @regression
)
public class Runner {

	
}