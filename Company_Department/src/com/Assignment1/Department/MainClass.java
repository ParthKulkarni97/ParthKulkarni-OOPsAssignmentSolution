package com.Assignment1.Department;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		HR_Department HrDepartment = new HR_Department();
		Admin_Department AdminDepartment = new Admin_Department();
		Tech_Department TechDepartment = new Tech_Department();

		System.out.println("Which Department do you work for?");
		System.out.println("1) HR Department");
		System.out.println("2) Admin Department");
		System.out.println("3) Tech Department");

		int opt = sc.nextInt();

		switch (opt) {

		case 1: //HR
			System.out.println("Welcome to " + HrDepartment.departmentName());
			System.out.println(HrDepartment.getTodaysWork());
			System.out.println(HrDepartment.getWorkDeadline());
			System.out.println(HrDepartment.doActivity());
			System.out.println(HrDepartment.isTodayAHoliday());
			break;
		case 2: //Admin
			System.out.println("Welcome to " + AdminDepartment.departmentName());
			System.out.println(AdminDepartment.getTodaysWork());
			System.out.println(AdminDepartment.getWorkDeadline());
			System.out.println(AdminDepartment.isTodayAHoliday());
			break;
		case 3: //Tech
			System.out.println("Welcome to " + TechDepartment.departmentName());
			System.out.println(TechDepartment.getTodaysWork());
			System.out.println(TechDepartment.getWorkDeadline());
			System.out.println(TechDepartment.getTechStackInformation());
			System.out.println(TechDepartment.isTodayAHoliday());
			break;
		default:
			System.out.println("Please enter the valid department");
			sc.close();

		}

	}

}
