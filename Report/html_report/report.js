$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefiles/login.feature");
formatter.feature({
  "line": 1,
  "name": "This feature is to place the order in automationteststore webpage",
  "description": "",
  "id": "this-feature-is-to-place-the-order-in-automationteststore-webpage",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2577195000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Register a user for automationteststore",
  "description": "",
  "id": "this-feature-is-to-place-the-order-in-automationteststore-webpage;register-a-user-for-automationteststore",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "i click a login or register",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter my details submit the registation form",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "i see a success message",
  "keyword": "Then "
});
formatter.match({
  "location": "Automationteststore_stepdefinition.user_on_the_login_page()"
});
formatter.result({
  "duration": 7764721500,
  "status": "passed"
});
formatter.match({
  "location": "Automationteststore_stepdefinition.i_click_a_login_or_register_enter_my_details()"
});
formatter.result({
  "duration": 6659656000,
  "status": "passed"
});
formatter.match({
  "location": "Automationteststore_stepdefinition.enter_my_details_submit_the_registation_form()"
});
formatter.result({
  "duration": 7659418000,
  "status": "passed"
});
formatter.match({
  "location": "Automationteststore_stepdefinition.i_see_a_success_message()"
});
formatter.result({
  "duration": 124680100,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "validating names",
  "description": "",
  "id": "this-feature-is-to-place-the-order-in-automationteststore-webpage;validating-names",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user on the account created page click continue",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "valid name and surname",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "click home to add products",
  "keyword": "Then "
});
formatter.match({
  "location": "Automationteststore_stepdefinition.user_on_the_account_created_page_click_continue()"
});
formatter.result({
  "duration": 843788800,
  "status": "passed"
});
formatter.match({
  "location": "Automationteststore_stepdefinition.valid_name_and_surname()"
});
formatter.result({
  "duration": 145419100,
  "status": "passed"
});
formatter.match({
  "location": "Automationteststore_stepdefinition.click_home_to_add_products()"
});
formatter.result({
  "duration": 963476500,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "add products to cart",
  "description": "",
  "id": "this-feature-is-to-place-the-order-in-automationteststore-webpage;add-products-to-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "user search the products",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "products add to cart",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "proceed to check out",
  "keyword": "Then "
});
formatter.match({
  "location": "Automationteststore_stepdefinition.user_search_the_products()"
});
formatter.result({
  "duration": 1484351100,
  "status": "passed"
});
formatter.match({
  "location": "Automationteststore_stepdefinition.products_add_to_cart()"
});
formatter.result({
  "duration": 676547600,
  "status": "passed"
});
formatter.match({
  "location": "Automationteststore_stepdefinition.proceed_to_check_out()"
});
formatter.result({
  "duration": 2294701800,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "verifying the details",
  "description": "",
  "id": "this-feature-is-to-place-the-order-in-automationteststore-webpage;verifying-the-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@logout"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user verify the details",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "details are correct click confirm",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "successfull order message take scrrenshot of the order",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "click continue button see home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Automationteststore_stepdefinition.user_verify_the_details()"
});
formatter.result({
  "duration": 414094600,
  "status": "passed"
});
formatter.match({
  "location": "Automationteststore_stepdefinition.details_are_correct_click_confirm()"
});
formatter.result({
  "duration": 116425100,
  "status": "passed"
});
formatter.match({
  "location": "Automationteststore_stepdefinition.successfull_order_message_take_scrrenshot_of_the_order()"
});
formatter.result({
  "duration": 1602230100,
  "status": "passed"
});
formatter.match({
  "location": "Automationteststore_stepdefinition.click_continue_button_see_home_page()"
});
formatter.result({
  "duration": 1036311200,
  "status": "passed"
});
formatter.after({
  "duration": 6787304900,
  "status": "passed"
});
});