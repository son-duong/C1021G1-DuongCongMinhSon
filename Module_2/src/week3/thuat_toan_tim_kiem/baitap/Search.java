package week3.thuat_toan_tim_kiem.baitap;

import java.util.LinkedList;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String input = sc.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for ( int i = 0 ; i < input.length();i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(input.charAt(i));
        for(int j = i +1; j < input.length() ; j++ ){
            if(input.charAt(i) > list.getLast()){
                list.add(input.charAt(j));
            }
        }
        if(list.size() > max.size()){
            max.clear();
            max.addAll(list);
        }
        list.clear();
        }
        for (Character ch: max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
