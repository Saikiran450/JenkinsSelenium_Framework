package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Products {
	
	 @FindBy(linkText = "Products")
	  private  WebElement product;

	 public WebElement getProduct() {
		 return product;
	 }

	 

}
