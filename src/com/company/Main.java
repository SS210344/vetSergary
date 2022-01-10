package com.company;
import com.company.libarary.libaryFunctions;
import com.company.objects.cat;
import java.util.ArrayList;

public class Main {
    static ArrayList<cat> catList = new ArrayList<>();

    public static void main(String[] args) {
	// write your code here
        int myNumber = libaryFunctions.getInt();
        String myText = libaryFunctions.getString();
        double myDouble= libaryFunctions.getDouble();

        cat myCat = new cat(1, "poppy", "cat", 9, 4.5, 35, "cat food", "06/11/2020");
        cat myOtherCat = new cat(3, "fudge", "cat", 9, 11, 40, "cat food", "12/11/2020");

        System.out.println(myCat.getName());
        System.out.println(myOtherCat.getName());
        catList.add(myCat);
        catList.add(myOtherCat);
        System.out.println(catList.get(1).getName());
    }




}
