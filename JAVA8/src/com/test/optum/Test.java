package com.test.optum;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	static int iScore = 301;
	static ArrayList<Integer> eachRoundScoreList = new ArrayList<>();

	public static void main(String[] args) {

		getResults();
		System.out.println(iScore);

	}

	private static int getResults() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		input = input.substring(1, input.length() - 1);

		String[] inputs = input.split(",");

		for (int i = 0; i < inputs.length; i++) {
			inputs[i] = inputs[i].trim();
			inputs[i] = inputs[i].substring(1, inputs[i].length() - 1);
		}
		int startIndex = 0;
		for (int i = 0; i < inputs.length; i++) {

			if (inputs[i].startsWith("D")) {
				startIndex = i;
				break;
			}
		}
		int turnNum = 1;
		// ["D10", "T2", "18", "17", "D19", "5"]
		for (int i = startIndex; i < inputs.length; i++) {

			if (inputs[i].startsWith("D")) {
				int val = 0;
				if (inputs[i].equals("DB")) {
					val = 50;
				} else {
					String str = inputs[i].substring(1);
					val = Integer.valueOf(str);
					val = val * 2;
				}
				iScore = iScore - val;
			} else if (inputs[i].startsWith("T")) {
				int val = 0;
				String str = inputs[i].substring(1);
				val = Integer.valueOf(str);
				val = val * 3;
				iScore = iScore - val;
			} else if (inputs[i].equals("SB")) {
				iScore = iScore - 25;
			} else {
				iScore = iScore - Integer.valueOf(inputs[i]);
			}
			if (iScore < 0 || iScore == 1) {
				eachRoundScoreList.set(turnNum / 3, iScore);
				// let say turnnum =7 skip to next round
				// 7%3=1
				// 3-1=2
				// i=i+2;
				int x = turnNum % 3;
				x = 3 - x;
				i = i + x;
			} else if (iScore == 0) {
				if (inputs[i].startsWith("D")) {
					return iScore;
				}
				eachRoundScoreList.set(turnNum / 3, iScore);
				int x = turnNum % 3;
				x = 3 - x;
				i = i + x;
			}
			if (turnNum % 3 == 0) {
				eachRoundScoreList.add(iScore);

			}
			turnNum++;
		}

		if (!eachRoundScoreList.isEmpty()) {
			return eachRoundScoreList.get(eachRoundScoreList.size() - 1);
		}

		return 301;
	}

}
