package com.qa.main;

public class Person {

	private String name;
	private Integer age;
	private String jobTitle;

	public Person(String name, Integer age, String job_Title) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = job_Title;
	}

	public Integer getAge() {
		return age;
	}

	public String getJob_Title() {
		return jobTitle;
	}

	public String getName() {
		return name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setJob_Title(String job_Title) {
		this.jobTitle = job_Title;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", job_Title=" + jobTitle + "]";
	}

}
