package edu.gyansetu.tcs.collections;

import java.util.ArrayList;

import edu.gyansetu.tcs.oops.revision.baisc.Acc;

public class TestArrayList3 {

	public static void main(String[] args) {

		// db fetch

		ArrayList<Acc> accs = new ArrayList<Acc>(10);

		Acc acc1 = new Acc(122, "SB", 9090);
		Acc acc2 = new Acc(124, "SB", 8989);
		Acc acc3 = new Acc(22, "SB", 1000);
		Acc acc4 = new Acc(124, "SB", 6788);

		accs.add(acc1);
		accs.add(acc2);
		accs.add(acc3);
		accs.add(acc4);

		// for (int i = 0; i < accs.size(); i++) {
		// if(accs.get(i).getAccNum()==22) {
		// accs.remove(i);
		// }
		// }

		displayListData(accs);
		//
		Acc accFromFE = new Acc(22, "SB", 1000);

		accs.remove(accFromFE);

		System.out.println("after removal");

		displayListData(accs);

	}

	private static void displayListData(ArrayList<Acc> accs) {
		for (int i = 0; i < accs.size(); i++) {
			System.out.println(accs.get(i));
		}
	}

}