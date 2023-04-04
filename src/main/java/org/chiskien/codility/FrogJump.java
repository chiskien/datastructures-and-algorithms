package org.chiskien.codility;

public class FrogJump {
    public static void main(String[] args) {
        System.out.println(75 / 30);
    }

    //calculate the total step with length D from position X to position Y
    public static int solution(int X, int Y, int D) {
        int step;
        if (X >= Y || D >= Y) {
            return 0;
        } else {
            int distance = Y - X;
            step = distance / D;
            if (distance % D == 0) {
                return step;
            } else {
                return step + 1;
            }
        }
    }

}
