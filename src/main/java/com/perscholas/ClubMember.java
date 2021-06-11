package com.perscholas;

public class ClubMember {
	
	String name;
	String city;
	String state;
	String favLanguage;
	
	public ClubMember(String name, String city, String state, String favLanguage) {
		this.name = name;
		this.city = city;
		this.state = state;
		this.favLanguage = favLanguage;
	}
	
	public void printByLine() {
		System.out.println("Name: " + this.name + "  City: " + this.city + "  State: " + this.state + "  Favorite Language: " + this.favLanguage);
	}
	
	public void printMember() {
		System.out.println("Member Name: " + this.name);
		System.out.println("Location: " + this.city + ", " + this.state);
		System.out.println("Favorite Language: " + this.favLanguage);
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFavLanguage() {
		return favLanguage;
	}

	public void setFavLanguage(String favLanguage) {
		this.favLanguage = favLanguage;
	}
	
}
