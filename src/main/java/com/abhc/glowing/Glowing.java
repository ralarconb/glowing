package com.abhc.glowing;

public class Glowing {

	public static void main(String[] args) {
		int inn = 5;
		int rem = 0;
		int seq = 0;
		int count = 0;
		while (inn > 0) {
			rem = inn % 2;
			inn = inn / 2;
			if (rem == 1) {
				seq++;
				if (seq >= count) {
					count = seq;
				}
			} else {
				seq = 0;
			}
		}
		System.out.println(count);
	}
}
