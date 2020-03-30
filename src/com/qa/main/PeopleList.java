package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class PeopleList {
	private List<Person> peopleList = new ArrayList<>();

	public boolean addPerson(String name, int age, String jobTitle) {
		return this.peopleList.add(new Person(name, age, jobTitle));
	}

	public void findPerson(String name) {
		for (int i = 0; i < peopleList.size(); i++) {
			if (peopleList.get(i).getName().equals(name)) {
				System.out.println(peopleList.get(i).toString());
			}
		}
	}

	public void showList() {
		for (int i = 0; i < peopleList.size(); i++) {
			System.out.println(peopleList.get(i).toString());
		}
	}

}
