$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('cricbuzz\test\cricbuzz.feature');
formatter.feature({
  "id": "cricket-update",
  "description": "",
  "name": "Cricket update",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "cricket-update;cricket-world-updates",
  "description": "",
  "name": "Cricket world updates",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "I visit cricbuzz website",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "I check schedules for different tournaments",
  "keyword": "Then ",
  "line": 5
});
formatter.step({
  "name": "I check rankings for \"batsmens\"",
  "keyword": "Then ",
  "line": 6
});
formatter.step({
  "name": "I check rankings for \"bowlers\"",
  "keyword": "Then ",
  "line": 7
});
formatter.step({
  "name": "I check live score of matches",
  "keyword": "Then ",
  "line": 8
});
formatter.step({
  "name": "I check different news of cricket",
  "keyword": "Then ",
  "line": 9
});
formatter.step({
  "name": "I check updates for few popular teams",
  "keyword": "Then ",
  "line": 10
});
formatter.match({
  "location": "cricbuzz_steps.visit_cricbuzz()"
});
formatter.result({
  "duration": 14768245044,
  "status": "passed"
});
formatter.match({
  "location": "cricbuzz_steps.schedule_of_tournament()"
});
formatter.result({
  "duration": 922586360,
  "status": "failed",
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to find element with xpath \u003d\u003d //*[@id\u003d\u0027International-tab\u0027]/a (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 323 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.25.0\u0027, revision: \u002717482\u0027, time: \u00272012-07-18 22:18:01\u0027\nSystem info: os.name: \u0027Windows 8\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.2\u0027, java.version: \u00271.7.0_80-ea\u0027\nDriver info: driver.version: RemoteWebDriver\nSession ID: 5be2c393-5d03-4ead-a133-b139da914cb9\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:57)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:526)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:188)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:145)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:498)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:268)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:353)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:343)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:260)\r\n\tat cricbuzz.test.Schedule_Page.schedule(Schedule_Page.java:15)\r\n\tat cricbuzz.test.cricbuzz_steps.schedule_of_tournament(cricbuzz_steps.java:28)\r\n\tat ✽.Then I check schedules for different tournaments(cricbuzz\\test\\cricbuzz.feature:5)\r\n"
});
formatter.match({
  "arguments": [
    {
      "val": "batsmens",
      "offset": 22
    }
  ],
  "location": "cricbuzz_steps.rankings(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "bowlers",
      "offset": 22
    }
  ],
  "location": "cricbuzz_steps.rankings(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "cricbuzz_steps.live_score_of_matches()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "cricbuzz_steps.news_of_cricket()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "cricbuzz_steps.updates_of_popular_teams()"
});
formatter.result({
  "status": "skipped"
});
});