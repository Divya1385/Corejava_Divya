package com.evergent.corejava.collections.stack;

import java.util.Stack;
//peek():last element value is showing
public class StackDemo2 {

	public static void main(String[] args) {
		Stack mystack=new Stack();
		mystack.push("Red");
		mystack.push("black");
		mystack.push("white");
		System.out.println(mystack);
		System.out.println(mystack.peek());
		System.out.println(mystack);

	}

}
