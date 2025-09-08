package view;

import Pilha.Pilha;

public class main {
	public static void main(String[] args) {
		Pilha p = new Pilha();
		
		int total = (int)((Math.random() * 10) + 1);
		for(int i = 0; i < total; i++) {
			p.push((int) ((Math.random() * 100) + 1));
		}
		
		try {
			System.out.println(p.max());
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
}
