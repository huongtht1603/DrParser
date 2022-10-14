package com.DrParser.pageObjects;

import org.openqa.selenium.WebElement;

public class positionObj {
		
		String positionName = "";
		WebElement PositionName;
		int positionNo;
		WebElement readMoreBtn;

		public positionObj(String pname, WebElement pPositionName, int pNo, WebElement preadMoreBtn ) {

			this.positionName = pname;
			this.PositionName = pPositionName;
			this.positionNo = pNo;
			this.readMoreBtn = preadMoreBtn;
			
		}
		
		
		public void setPositionName(String pname) {
			positionName = pname;
		}

		public void setPositionNameLnk(WebElement pPositionName) {
			PositionName = pPositionName;
		}
		
		public void setPositionNo(int pNo) {
			positionNo = pNo;
		}

		public void setReadMoreBtn(WebElement preadMoreBtn) {
			readMoreBtn = preadMoreBtn;
		}
		
		
		
		public String getPositionName() {
			return positionName;
		}
		
		public WebElement getWebElement1() {
			return PositionName;
		}
		
		public int getPositionNo() {
			return positionNo;
		}
		
		public WebElement getWebElement2() {
			return readMoreBtn;
		}
	}
	