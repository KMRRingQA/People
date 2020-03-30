package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		PeopleList peopleList = new PeopleList();
		peopleList.addPerson("Bob", 18, "unemployed");
		peopleList.addPerson("Jeff", 24, "busy not giving you up");
		peopleList.addPerson("Gerald", 54, "QA dev");
		peopleList.findPerson("Jeff");
		peopleList.showList();

	}

}
