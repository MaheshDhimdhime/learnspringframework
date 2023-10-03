package codingpractice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Computer1 {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_BLUE = "\u001B[34m";

	public void playMusic() {
		System.out.println("playing music..!");
	}

	public List<Cost> getMePen(List<Cost> costList) {
		List<Cost> filteredList = new ArrayList<>();
		for (Cost cost : costList) {
			if (cost.getPrice() >= 10) {
				filteredList.add(cost);
			} else {
				System.out.println("pen price is not valid :" + cost.getPrice());
			}
		}
		return filteredList;
	}

	public List<Budget> eligibleForGetPen(List<Budget> budgetList) {

		List<Budget> filteredBudgetList = new ArrayList<Budget>();

		for (Budget budget : budgetList) {
			if (budget.isReccesion()) {
				filteredBudgetList.add(budget);
		//	} else if (budget.getBudgetYear().getYear() >= LocalDate.now().getYear()) {
				filteredBudgetList.add(budget);
			} else {
				System.out.println("Please enter a valid budget: " + budget.getBudgetName());
			}
		}
		return filteredBudgetList;
	}

	public static void main(String[] args) {
		Computer1 obj = new Computer1();
		obj.playMusic();
		List<Cost> objList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Price Details");
		Cost objCost = new Cost();
		int price = sc.nextInt();
		System.out.println("Enter Price brand");
		String brand = sc.next();
		System.out.println("Enter color Details");

		
		String color = sc.next();
		String word = "Hello";
		switch (color) {
		case "red":
			System.out.println(ANSI_RED + word + ANSI_RESET);
			break;
		case "green":
			System.out.println(ANSI_GREEN + word + ANSI_RESET);
			break;
		case "blue":
			System.out.println(ANSI_BLUE + word + ANSI_RESET);
			break;
		default:
			System.out.println("Invalid color.");
			break;
		}
		objCost.setPrice(price);
		objCost.setBrand(brand);
		objCost.setColor(color);

		objList.add(objCost);
		List<Cost> finalList = obj.getMePen(objList);
		if (finalList.isEmpty()) {
			System.out.println("No valid pen found");
		} else {
			System.out.println("finalList: " + finalList);
		}
		System.out.println("Enter Budget Details !!!");
		List<Budget> listOfBudget=new ArrayList<Budget>();
		Budget budgetObj = new Budget();
		System.out.println("Enter budget Name");
		String budgetName = sc.next();
		System.out.println("Enter budget Date ");
		String budgetDate = sc.next();
		System.out.println("Enter budget recession ");
		Boolean isReccesion = sc.equals(budgetObj);
		System.out.println("Enter budget Year ");
		String budgetYear = sc.next();
		budgetObj.setBudgetName(budgetName);
		budgetObj.setBudgetDate(budgetDate);
		budgetObj.setReccesion(false);
		budgetObj.setBudgetYear(budgetYear);
		obj.eligibleForGetPen(listOfBudget);
	}
	
	
}
