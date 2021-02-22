package com.bae.dogscomp;

import java.util.ArrayList;

public class DoggoCompetition {

	public String dogPosition(int n) {
		ArrayList<String> dogList = new ArrayList<String>();
		int listPosition = 0;
		for (int i = 0; i < 100; i++) {
			listPosition++;
			if (listPosition == n) {
				continue;
			} else if (listPosition % 10 == 1) {
				if (listPosition == 11) {
					dogList.add(listPosition + "th,");
				} else {
					dogList.add(listPosition + "st,");
				}
			} else if (listPosition % 10 == 2) {
				if (listPosition == 12) {
					dogList.add(listPosition + "th,");
				} else {
					dogList.add(listPosition + "nd,");
				}
			} else if (listPosition % 10 == 3) {
				if (listPosition == 13) {
					dogList.add(listPosition + "th,");
				} else {
					dogList.add(listPosition + "rd,");
				}
			} else {
				dogList.add(listPosition + "th,");
			}
		}
		StringBuffer sb = new StringBuffer();

		for (String position : dogList) {
			sb.append(position);
			sb.append(" ");
		}
		String winners = sb.toString();
		return winners;
	}

}
