$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature1/bigbasket1.feature");
formatter.feature({
  "name": "bigbasket Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Flow for checking bigbasket",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "As a user i want to open browser,",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I want to open url \"https://www.bigbasket.com/\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on signup/signin",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Enter valid mobile number and OTP \"9019277162\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click on verify and continue",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "print sigin/signup is successful message",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});