package com.xworkz.test;

public class Palindrome {
    public static void main(String[] args) {



            String name = "121";
            int left = 0;
            int right = name.length() - 1;
            boolean isPalindrome = true;

            while (left < right) {
                if (name.charAt(left) != name.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if (isPalindrome) {
                System.out.println(" Palindrome");
            } else {
                System.out.println(" not a palindrome");
            }
        }
    }


