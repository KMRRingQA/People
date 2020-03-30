package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class PeopleList {
	public List<Person> peopleList = new ArrayList<>();

	public void findPerson(String name) {
		for (int i = 0; i < peopleList.size(); i++) {
//			System.out.println(peopleList.get(i).toString());
			if (peopleList.get(i).getName().equals(name)) {
				System.out.println(peopleList.get(i).toString());
			}
		}
	}
}
