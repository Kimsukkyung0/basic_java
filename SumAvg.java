package com.green.java.ch06_review;

public class SumAvg {
    static int gradeSum(int[][] grades) {

        int sum = 0;
        for (int i = 0; i <= grades.length; i++) {
            int[] n = grades[i];
            for (int j = 0; j < grades.length; i++) {
                sum += n[j];
            }

        }
        return sum;
    }


    static double avg(int[][] grades) {
        int sum = gradeSum(grades);
        //gradeSum에 저장되어있는 return 값을 sum 에 다시 저장
        //메서드 호출 하기
        double avg;
        for (int i = 0; i <= grades.length; i++) {
            int[] n = grades[i];
            for (int j = 0; j < grades.length; i++) {
                sum += n[j];
            }

        }
        avg = (double) sum / grades.length;
        return avg;
    }
}