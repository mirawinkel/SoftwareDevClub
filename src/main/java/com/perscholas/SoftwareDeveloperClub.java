package com.perscholas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SoftwareDeveloperClub {
	
	
	
	ArrayList<ClubMember> members;
	static Scanner sc = new Scanner(System.in);
	
	public SoftwareDeveloperClub() {
		this.members = new ArrayList<ClubMember>();
	}
	
	public void importUsers() {
		try {
			String location = "C:\\files\\members.txt";
			File file = new File(location);
			Scanner s = new Scanner(file);
			while(s.hasNextLine()) {
				String line = s.nextLine();
				String[] data = line.split("\\*\\*");
				ClubMember member = new ClubMember(data[0], data[1], data[2], data[3]);
				members.add(member);
			}
			s.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found!");
			e.printStackTrace();
		}
		String nameCheck = "NAME";
		if(this.members.get(0).name.equals(nameCheck)) {
			this.members.remove(0);
		}
	}

	public ArrayList<ClubMember> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<ClubMember> members) {
		this.members = members;
	}
	
	public void menu() {
		System.out.println("Select from the following menu:");
		System.out.println("1: Display Members");
		System.out.println("2: Remove Member");
		System.out.println("3: Add Member");
		System.out.println("4: Quit");
	}
	
	public int choice() {
		int result = sc.nextInt();
		return result;
	}
	
	public void addMember() {
		System.out.println("Adding member details:");
		System.out.println("What is their name?");
		String name = sc.next();
		System.out.println("What City do they live in?");
		String city = sc.next();
		System.out.println("What State do they live in?");
		String state = sc.next();
		System.out.println("What's their favorite language?");
		String favLang = sc.next();
		ClubMember newbie = new ClubMember(name, city, state, favLang);
		this.members.add(newbie);
	}
	
	public void deleteMember() {
		System.out.println("Pick a member to delete from the list of members:");
		System.out.println();
		for (int i=0; i<this.members.size(); i++) {
			System.out.print((i+1) + ": ");
			this.members.get(i).printByLine();
		}
		int delete = sc.nextInt();
		System.out.println(this.members.get(delete - 1).name + " has been removed");
		this.members.remove(delete-1);
		System.out.println();
	}
	
	public void displayAllMembers() {
		System.out.println("Software Developers Club Members:");
		System.out.println();
		this.members.forEach(member -> member.printMember());
	}
}
