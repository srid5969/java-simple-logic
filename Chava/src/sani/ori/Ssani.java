package sani.ori;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ssani {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
			if (arr.get(i) % 2 == 0) {
				even.add(arr.get(i));
			} else {
				odd.add(arr.get(i));
			}
		}
		Collections.sort(odd);
		Collections.sort(even);
		for (int i = odd.size() - 1, j = 0; i > 0 || j < even.size(); i--, j++) {
			try {

				System.out.print(" even ");
				System.out.print("\t" + even.get(i)+"\n");
				System.out.println(" odd ");
				System.out.print("\t" + odd.get(j)+"\n");
			} catch (Exception e) {
				System.out.println("not a even or odd");
			}
		}
	}
}
