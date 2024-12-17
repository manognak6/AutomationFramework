package com.ui.tests;

import com.ui.pages.HomePage;

public class LoginTest {

	public static void main(String[] args) {
		
		HomePage homePage= new HomePage("chrome");
		String userName=homePage.GoToLoginPage().doLoginWith("bakomam596@skrak.com", "password").getUserName();//we use only page functions(which show the interaction of page class) here in Test scripts
			System.out.println(userName);

	}

}
