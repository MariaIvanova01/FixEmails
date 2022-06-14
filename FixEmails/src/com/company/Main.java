package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, String> personalEmail = new LinkedHashMap<>();

        while (true){
            String name = scan.nextLine();
            if (name.equals("stop")){
                break;
            }
            String email = scan.nextLine();
            if (!email.endsWith(".us") && !email.endsWith(".uk") && !email.endsWith(".com")){
                personalEmail.put(name,email);
            }
        }
        for (Map.Entry<String, String> entry : personalEmail.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(),entry.getValue());
        }
    }
}
