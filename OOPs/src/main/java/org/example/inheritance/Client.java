package org.example.inheritance;

import java.util.Stack;

public class Client {

    public static <T> void display(T[] arr) {
        for(T element:arr) {
            System.out.println(element);
        }
    }

    public static <T> void display(Iterable<T> iterable) {
        for(T element:iterable) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
    }
}
