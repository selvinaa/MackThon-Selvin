$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/homePage.feature");
formatter.feature({
  "name": "Home page Testing",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@homePage"
    }
  ]
});
formatter.scenario({
  "name": "Verify title of Home Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@homePage"
    },
    {
      "name": "@verifytitle"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User opens home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePage_STEPS.user_opens_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifies title is \"Meet Guru99 - Free Training Tutorials \u0026 Videos for IT Courses\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage_STEPS.verifies_title_is(String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...ng Tutorials \u0026 Video[s] for IT Courses\u003e but was:\u003c...ng Tutorials \u0026 Video[] for IT Courses\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:117)\n\tat org.junit.Assert.assertEquals(Assert.java:146)\n\tat step_definitions.HomePage_STEPS.verifies_title_is(HomePage_STEPS.java:26)\n\tat ✽.Verifies title is \"Meet Guru99 - Free Training Tutorials \u0026 Videos for IT Courses\"(file:src/test/resources/features/homePage.feature:6)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});