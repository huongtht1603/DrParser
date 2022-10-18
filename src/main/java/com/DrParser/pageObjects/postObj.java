

package com.DrParser.pageObjects;

import org.openqa.selenium.WebElement;

public class postObj {
	String postName = "";
	String postTopic;

	public postObj(String pname, String pTopic) {

		this.postName = pname;
		this.postTopic = pTopic;
	}
	
	
	public void setPostName(String pname) {
		postName = pname;
	}

	public void setPostLnk(String pTopic) {
		postTopic = pTopic;
	}
	
	public String getPostName() {
		return postName;
	}
	
	public String getPostTopic() {
		return postTopic;
	}
	

}

