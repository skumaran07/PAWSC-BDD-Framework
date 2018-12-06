$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/WMS/workspace/PawscBddFramework/src/main/java/com/qa/Features/techInfo.feature");
formatter.feature({
  "name": "Verify that technician modules is work",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "homeSteps.user_open_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "username and password for login",
  "keyword": "When "
});
formatter.match({
  "location": "homeSteps.enter_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Technical inforamtion menu from  left navigation",
  "keyword": "Then "
});
formatter.match({
  "location": "techInfostep.select_Technical_inforamtion_menu_from_left_navigation()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that Device Type tab is selected or not",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Check the Device Type tab is selected",
  "keyword": "When "
});
formatter.match({
  "location": "techInfostep.check_the_Device_Type_tab_is_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "homeSteps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});