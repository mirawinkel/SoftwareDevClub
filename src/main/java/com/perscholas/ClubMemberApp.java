package com.perscholas;

public class ClubMemberApp {
		
	public static void main(String[] args) {
		
		SoftwareDeveloperClub club = new SoftwareDeveloperClub();
		club.importUsers();
		boolean active = true;
		
		while(active) {
			club.menu();
			int selection = club.choice();
			if (selection==4) {
				active = false;
				break;
			}
			if (selection==1) {
				club.displayAllMembers();
			} else if (selection==2) {
				club.deleteMember();
			} else if (selection==3) {
				club.addMember();
			} else {
				System.out.println("Invalid Selection Please Try Again");
			}
		}
		System.out.println("Have a nice Day!");
	}
}
