package com.nopcommerce.cucumber.steps;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;


public class RegisterSteps {
    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @And("^I enters following users details$")
    public void iEntersFollowingUsersDetails(DataTable dataTable) throws InterruptedException {
        List<List<String>> data = dataTable.raw();//3
        for (int i = 0; i < data.size(); i++) {// loop will run 3 times

            new LoginPage().register(data.get(i).get(0), data.get(i).get(1), data.get(i).get(2), data.get(i).get(3), data.get(i).get(4));
            new HomePage().clickOnRegisterLink();

        }


    }
}
