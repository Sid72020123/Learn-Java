package com.vit.exams;

class ControlStructures {
    public static void main(String[] args) {
        int mark = 78;
        if (mark >= 50) System.out.println("Pass"); else System.out.println("Fail");
        switch (mark / 10) { case 10: case 9: System.out.println("Excellent"); break; case 8: case 7: System.out.println("Good"); break; default: System.out.println("Keep practising"); }
        for (int i = 1; i <= 3; i++) System.out.print(i + " ");
        int number = 3; while (number > 0) number--;
        do { System.out.println("do-while executes at least once"); } while (false);
    }
}
