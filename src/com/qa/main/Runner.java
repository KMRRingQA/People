package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		PeopleList peopleList = new PeopleList();
		peopleList.peopleList.add(new Person("Bob", 18, "unemployed"));
		peopleList.peopleList.add(new Person("Jeff", 24, "QA Software dev consultant"));
		peopleList.peopleList.add(new Person("Rick", 56, "not going to give you up"));
		peopleList.findPerson("Jeff");

	}

}
