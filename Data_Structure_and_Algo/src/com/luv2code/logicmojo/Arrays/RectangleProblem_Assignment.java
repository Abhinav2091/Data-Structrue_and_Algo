package com.luv2code.logicmojo.Arrays;


class Rectangle {
    public int x;
    public int y;

    Rectangle(int x, int y) {
        x = this.x;
        y = this.y;
    }
}

public class RectangleProblem_Assignment {
    public static void main(String arg[]) {

        Rectangle rectangle1left = new Rectangle(0, 10);
        Rectangle rectangle1right = new Rectangle(10, 0);
        Rectangle rectangle2left = new Rectangle(5, 5);
        Rectangle rectangle2right = new Rectangle(15, 0);


        if (checkOverlapRectangle(rectangle1left, rectangle1right, rectangle2left, rectangle2right)) {
            System.out.println("Rectangles Overlap");
        } else {
            System.out.println("Rectangles Don't Overlap");
        }
    }

    private static boolean checkOverlapRectangle(Rectangle rectangle1left, Rectangle rectangle1right, Rectangle rectangle2left, Rectangle rectangle2right) {
        //so to solve this problem my y left cordinate is alwayes less than y right of secon table
        // and my x left cordinate will alwayes be greater than xright of second table
        if (rectangle1left.y < rectangle2right.y || rectangle2left.y < rectangle1right.y)
            return false;
        else if (rectangle1left.x > rectangle2right.x || rectangle2left.x > rectangle1right.x)
            return false;
        else return true;

    }


}
