$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/HomePage_Web.feature");
formatter.feature({
  "name": "Home page Apache Testing",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@homePageWebApache"
    }
  ]
});
formatter.scenario({
  "name": "Verify title of Home Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@homePageWebApache"
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
  "name": "User opens Apache Pag",
  "keyword": "And "
});
formatter.match({
  "location": "HomePage_Web_STEPS.user_opens_Apache_Pag()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifies title is \"Apache Tutorials for Beginners\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage_STEPS.verifies_title_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});