package com.company;
import java.util.Scanner;
import java.util.HashMap;

public class DictionariesAndMaps {

    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    HashMap<String, Integer> phoneBook = new HashMap<>();

        for (int i = 0; i < n; i++) {
        String name = in.next();
        int phone = in.nextInt();
        // Write code here
        phoneBook.put(name, phone);
    }

        while(in.hasNext()) {
        String query = in.next();
        // Write code here
        if (phoneBook.containsKey(query)) {
            System.out.println(query + "=" + phoneBook.get(query));
        } else {
            System.out.println("Not found");
        }
    }
        in.close();
}
