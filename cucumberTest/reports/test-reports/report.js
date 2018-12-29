$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('com/cucumber/test/cucumberTest/googlesearch.feature');
formatter.feature({
  "line": 3,
  "name": "I want to google search something",
  "description": "",
  "id": "i-want-to-google-search-something",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Google search for a string",
  "description": "",
  "id": "i-want-to-google-search-something;google-search-for-a-string",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on google homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I type in a search with the keyword google",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on search",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I get my results",
  "keyword": "Then "
});
formatter.match({
  "location": "googleSearch.givenStatement()"
});
formatter.result({
  "duration": 3181107359,
  "status": "passed"
});
formatter.match({
  "location": "googleSearch.whenStatement()"
});
formatter.result({
  "duration": 129378138,
  "status": "passed"
});
formatter.match({
  "location": "googleSearch.andStatement()"
});
formatter.result({
  "duration": 3134157974,
  "status": "passed"
});
formatter.match({
  "location": "googleSearch.thenStatement()"
});
formatter.result({
  "duration": 739550998,
  "status": "passed"
});
});