$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/SearchUser.feature");
formatter.feature({
  "line": 1,
  "name": "User search",
  "description": "",
  "id": "user-search",
  "keyword": "Feature"
});
formatter.before({
  "duration": 808400,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Search existing user",
  "description": "",
  "id": "user-search;search-existing-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Admin open url \"https://opensource-demo.orangehrmlive.com/\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Admin enters username as \"Admin\" and password as \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Click login",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Admin can view dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Admin click on admintab",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Admin search username \"Bhakua11\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click search",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Admin can view desired username in list",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSearchDef.user_launch_chrome_browser()"
});
formatter.result({
  "duration": 41768644596,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://opensource-demo.orangehrmlive.com/",
      "offset": 16
    }
  ],
  "location": "UserSearchDef.admin_open_url(String)"
});
formatter.result({
  "duration": 16283577575,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 26
    },
    {
      "val": "admin123",
      "offset": 50
    }
  ],
  "location": "UserSearchDef.admin_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 181952441,
  "status": "passed"
});
formatter.match({
  "location": "UserSearchDef.click_login()"
});
formatter.result({
  "duration": 26731280224,
  "status": "passed"
});
formatter.match({
  "location": "UserSearchDef.admin_can_view_dashboard()"
});
formatter.result({
  "duration": 68978917,
  "status": "passed"
});
formatter.match({
  "location": "UserSearchDef.admin_click_on_admintab()"
});
formatter.result({
  "duration": 158344396861,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bhakua11",
      "offset": 23
    }
  ],
  "location": "UserSearchDef.admin_search_username(String)"
});
formatter.result({
  "duration": 89849669,
  "status": "passed"
});
formatter.match({
  "location": "UserSearchDef.click_search()"
});
formatter.result({
  "duration": 1714384896,
  "status": "passed"
});
formatter.match({
  "location": "UserSearchDef.admin_can_view_desired_username_in_list()"
});
formatter.result({
  "duration": 42118,
  "status": "passed"
});
formatter.after({
  "duration": 142658,
  "status": "passed"
});
});