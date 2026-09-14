public class ControlStatements {
    public static void main(String[] args) {
        // 1. If-Then-Else (Slide 23)
        int age = 20;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }

        int marks = 75;
        if (marks >= 85) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }

        // 2. Switch Statement (Slide 24)
        int month = 8;
        String name;
        switch (month) {
            case 1: name = "January"; break;
            case 8: name = "August"; break;
            default: name = "Invalid"; break;
        }

        // 3. While & Do-While (Slide 25)
        int idxWhile = 1;
        while (idxWhile <= 10) { System.out.println(idxWhile); idxWhile++; }

        int idxDo = 1;
        do { System.out.println(idxDo); idxDo++; } while (idxDo <= 10);

        // 4. For & Enhanced For (Slide 26)
        for (int k = 1; k <= 10; k++) {
            System.out.println(k);
        }

        int[] nums = {1, 2, 3, 4, 5};
        for (int n : nums) {
            System.out.println(n);
        }

        // 5. Branching Statements - break, continue, return (Slide 27 & 28)
        int[] aArray = {32, 87, 3, 589, 12};
        int target = 12; 
        int idxTarget = -1;
        for (int i = 0; i < aArray.length; i++) {
            if (aArray[i] == target) { idxTarget = i; break; }
        }

        String s = "peter piper picked...";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'p') continue;
            count++;
        }
    }
}