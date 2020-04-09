$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/HomePageAutom.feature");
formatter.feature({
  "name": "Test Best Seller page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@homePageAutom"
    }
  ]
});
formatter.scenario({
  "name": "Select specific dress",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@homePageAutom"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User opens homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "homePageAutom_STEPS.user_opens_homepage()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:314)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:43)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:300)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:297)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\n\tat util.SeleniumUtils.waitForClickability(SeleniumUtils.java:26)\n\tat util.SeleniumUtils.click(SeleniumUtils.java:45)\n\tat step_definitions.step_impl.HomePageAutom_impl.getInfoHome(HomePageAutom_impl.java:25)\n\tat step_definitions.homePageAutom_STEPS.user_opens_homepage(homePageAutom_STEPS.java:25)\n\tat ✽.User opens homepage(file:src/test/resources/features/HomePageAutom.feature:6)\n",
  "status": "failed"
});
formatter.step({
  "name": "Verifies title is {string}",
  "keyword": "And "
});
formatter.match({
  "location": "homePageAutom_STEPS.verifies_title_is()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});