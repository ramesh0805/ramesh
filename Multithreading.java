package com.OS;
import java.util.*;
class Table {
	void printTable(int n) {
			for(int i=1;i<11;i++) {
				System.out.println(+n+"*"+i+"="+(n*i));
				try {
					Thread.sleep(400);
				} catch(Exception e) {
					System.out.println(e);
				}
			}
		}
	}
class Mythread1 extends Thread {
	Table t;
	Mythread1(Table t) {
		this.t = t;
	}
	public void run()
	{
		t.printTable(10);
	}
}
class Mythread2 extends Thread {
	Table t;
	Mythread2(Table t) {
		this.t = t;
	}
	public void run() {
		t.printTable(20);
	}
}
public class Multithreading {
	public static void main(String[] args) {
		Table o = new Table();
		Mythread1 th1 = new Mythread1(o);
		Mythread2 th2 = new Mythread2(o);
		th1.start();
		th2.start();
	}
}
