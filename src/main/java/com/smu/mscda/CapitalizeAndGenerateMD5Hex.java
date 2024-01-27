package com.smu.mscda;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class CapitalizeAndGenerateMD5Hex {
    public static void main(String[] args){
        System.out.println("This program will capitalize the input string and Generate MD5 hex\n");
        System.out.println("Enter the input string :");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("\nCapitalized string is: "+Capitalize(input));
        System.out.println("\nMD5 hex is: "+GenerateMD5hex(input));
    }

    public static String Capitalize(String input){
      return StringUtils.capitalize(input);
    }

    public static String GenerateMD5hex(String input){
      return DigestUtils.md5Hex(input);
    }
}
