$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login\\login.feature");
formatter.feature({
  "line": 1,
  "name": "Test login functionality",
  "description": "I want to use test the login functionality using valid and in valid credentials",
  "id": "test-login-functionality",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I open chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I visit my application",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.I_open_chrome_browser()"
});
formatter.result({
  "duration": 1655148300,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_visit_my_application()"
});
formatter.result({
  "duration": 278598400,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Using valid credentials I should be able to login to my application",
  "description": "",
  "id": "test-login-functionality;using-valid-credentials-i-should-be-able-to-login-to-my-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@background"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I enter \"test.user@gmail.com.test\" as username",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter \"Welcome2\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click the login button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should see the dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "test.user@gmail.com.test",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_as_username(String)"
});
formatter.result({
  "duration": 80872600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome2",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_as_password(String)"
});
formatter.result({
  "duration": 58312000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_click_the_login_button()"
});
formatter.result({
  "duration": 725418800,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_should_see_the_dashboard_page()"
});
formatter.result({
  "duration": 1096004400,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_close_the_browser()"
});
formatter.result({
  "duration": 650339700,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I open chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I visit my application",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.I_open_chrome_browser()"
});
formatter.result({
  "duration": 1018819300,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_visit_my_application()"
});
formatter.result({
  "duration": 263560500,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Using in-valid credentials, I should not be able to login to my application",
  "description": "",
  "id": "test-login-functionality;using-in-valid-credentials,-i-should-not-be-able-to-login-to-my-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@background"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I enter \"test.fake@gmail.com.test\" as username",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter \"WrondPassword\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click the login button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I should see an error message",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "test.fake@gmail.com.test",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_as_username(String)"
});
formatter.result({
  "duration": 73144200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "WrondPassword",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_as_password(String)"
});
formatter.result({
  "duration": 66399500,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_click_the_login_button()"
});
formatter.result({
  "duration": 7830504000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_should_see_an_error_message()"
});
formatter.result({
  "duration": 121253900,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_close_the_browser()"
});
formatter.result({
  "duration": 648885700,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I open chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I visit my application",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.I_open_chrome_browser()"
});
formatter.result({
  "duration": 1003929000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_visit_my_application()"
});
formatter.result({
  "duration": 275966000,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Using anounymous user I should be able to visit the application",
  "description": "",
  "id": "test-login-functionality;using-anounymous-user-i-should-be-able-to-visit-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@background"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.I_close_the_browser()"
});
formatter.result({
  "duration": 632165800,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I open chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I visit my application",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.I_open_chrome_browser()"
});
formatter.result({
  "duration": 1003645300,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_visit_my_application()"
});
formatter.result({
  "duration": 273549700,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Using in-valid credentials, I should not be able to login to my application",
  "description": "",
  "id": "test-login-functionality;using-in-valid-credentials,-i-should-not-be-able-to-login-to-my-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@background"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "I enter \"test.fake@gmail.com.test\" as username",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I enter \"WrondPassword\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click the login button",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "I should see an error message",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "test.fake@gmail.com.test",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_as_username(String)"
});
formatter.result({
  "duration": 87394400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "WrondPassword",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_as_password(String)"
});
formatter.result({
  "duration": 58417000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_click_the_login_button()"
});
formatter.result({
  "duration": 7454438900,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_should_see_an_error_message()"
});
formatter.result({
  "duration": 110687900,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_close_the_browser()"
});
formatter.result({
  "duration": 616282300,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I open chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I visit my application",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.I_open_chrome_browser()"
});
formatter.result({
  "duration": 1004785200,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_visit_my_application()"
});
formatter.result({
  "duration": 258136500,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Create Account using Data Table",
  "description": "",
  "id": "test-login-functionality;create-account-using-data-table",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@background"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "I enter \"test.user@gmail.com.test\" as username",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I enter \"Welcome2\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I click the login button",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "I should see the dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "I create and save the Account",
  "rows": [
    {
      "cells": [
        "Account Name",
        "Account Number",
        "Account Site",
        "Active",
        "Annual Revenue",
        "Account Source"
      ],
      "line": 43
    },
    {
      "cells": [
        "Waqas 123",
        "12345",
        "www.codegator.us",
        "Yes",
        "100000",
        "Web"
      ],
      "line": 44
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I click the \"Edit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I should see the following values for the \"00N2E00000D7LOy\" field",
  "rows": [
    {
      "cells": [
        "--None--"
      ],
      "line": 47
    },
    {
      "cells": [
        "No"
      ],
      "line": 48
    },
    {
      "cells": [
        "Yes"
      ],
      "line": 49
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I should see the following values for the \"AccountSource\" field",
  "rows": [
    {
      "cells": [
        "--None--"
      ],
      "line": 51
    },
    {
      "cells": [
        "Web"
      ],
      "line": 52
    },
    {
      "cells": [
        "Phone Inquiry"
      ],
      "line": 53
    },
    {
      "cells": [
        "Partner Referral"
      ],
      "line": 54
    },
    {
      "cells": [
        "Purchased List"
      ],
      "line": 55
    },
    {
      "cells": [
        "Other"
      ],
      "line": 56
    }
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "test.user@gmail.com.test",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_as_username(String)"
});
formatter.result({
  "duration": 67559800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome2",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_as_password(String)"
});
formatter.result({
  "duration": 62607900,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_click_the_login_button()"
});
formatter.result({
  "duration": 629070600,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_should_see_the_dashboard_page()"
});
formatter.result({
  "duration": 729978300,
  "status": "passed"
});
formatter.match({
  "location": "AccountTest.I_create_and_save_the_Account(DataTable)"
});
formatter.result({
  "duration": 4280305200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Edit",
      "offset": 13
    }
  ],
  "location": "AccountTest.I_click_the_button(String)"
});
formatter.result({
  "duration": 275689700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "00N2E00000D7LOy",
      "offset": 43
    }
  ],
  "location": "AccountTest.I_should_see_the_following_values_for_the_field(String,DataTable)"
});
formatter.result({
  "duration": 68339400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AccountSource",
      "offset": 43
    }
  ],
  "location": "AccountTest.I_should_see_the_following_values_for_the_field(String,DataTable)"
});
formatter.result({
  "duration": 84787000,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I open chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I visit my application",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.I_open_chrome_browser()"
});
formatter.result({
  "duration": 1061424100,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_visit_my_application()"
});
formatter.result({
  "duration": 249317400,
  "status": "passed"
});
formatter.scenario({
  "line": 72,
  "name": "Create and Save Account records",
  "description": "",
  "id": "test-login-functionality;create-and-save-account-records;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 58,
      "name": "@background"
    }
  ]
});
formatter.step({
  "line": 60,
  "name": "I enter \"test.user@gmail.com.test\" as username",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "I enter \"Welcome2\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "I click the login button",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "I should see the dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "I click the \"Accounts\" tab",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "I click the \"New\" button",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "I enter \"Waqas\" in the account name field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "I click the \"Save\" button",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "test.user@gmail.com.test",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_as_username(String)"
});
formatter.result({
  "duration": 65466600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome2",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_as_password(String)"
});
formatter.result({
  "duration": 68017500,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_click_the_login_button()"
});
formatter.result({
  "duration": 54179100,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_should_see_the_dashboard_page()"
});
formatter.result({
  "duration": 1377319000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Accounts",
      "offset": 13
    }
  ],
  "location": "AccountTest.I_click_the_tab(String)"
});
formatter.result({
  "duration": 148622900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New",
      "offset": 13
    }
  ],
  "location": "AccountTest.I_click_the_button(String)"
});
formatter.result({
  "duration": 147314300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Waqas",
      "offset": 9
    }
  ],
  "location": "AccountTest.I_enter_in_the_account_name_field(String)"
});
formatter.result({
  "duration": 5076830400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#acc2\"}\n  (Session info: chrome\u003d91.0.4472.124)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027DESKTOP-UO95ULH\u0027, ip: \u0027192.168.86.246\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.10\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.124, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\WAQASK~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:50563}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: e4b462066a45209343cc85b297731fbc\n*** Element info: {Using\u003did, value\u003dacc2}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepDefinition.AccountTest.I_enter_in_the_account_name_field(AccountTest.java:30)\r\n\tat ✽.And I enter \"Waqas\" in the account name field(login\\login.feature:66)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Save",
      "offset": 13
    }
  ],
  "location": "AccountTest.I_click_the_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginTest.I_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I open chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I visit my application",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.I_open_chrome_browser()"
});
formatter.result({
  "duration": 1018484200,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_visit_my_application()"
});
formatter.result({
  "duration": 273742000,
  "status": "passed"
});
formatter.scenario({
  "line": 75,
  "name": "Verify active drop down field is present",
  "description": "",
  "id": "test-login-functionality;verify-active-drop-down-field-is-present",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 74,
      "name": "@background"
    }
  ]
});
formatter.step({
  "line": 76,
  "name": "I enter \"test.user@gmail.com.test\" as username",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "I enter \"Welcome2\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "I click the login button",
  "keyword": "When "
});
formatter.step({
  "line": 79,
  "name": "I should see the dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 80,
  "name": "I click the \"Accounts\" tab",
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "I click the \"New\" button",
  "keyword": "And "
});
formatter.step({
  "line": 82,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "test.user@gmail.com.test",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_as_username(String)"
});
formatter.result({
  "duration": 70995100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome2",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_as_password(String)"
});
formatter.result({
  "duration": 67495900,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_click_the_login_button()"
});
formatter.result({
  "duration": 95027400,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_should_see_the_dashboard_page()"
});
formatter.result({
  "duration": 1524081300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Accounts",
      "offset": 13
    }
  ],
  "location": "AccountTest.I_click_the_tab(String)"
});
formatter.result({
  "duration": 152045100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New",
      "offset": 13
    }
  ],
  "location": "AccountTest.I_click_the_button(String)"
});
formatter.result({
  "duration": 403420700,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_close_the_browser()"
});
formatter.result({
  "duration": 639890200,
  "status": "passed"
});
});