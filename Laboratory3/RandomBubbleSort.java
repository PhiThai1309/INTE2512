package Laboratory3;/*
Design a class named Laboratory3.StopWatch. The class contains:
• Private attributes startTime and endTime with get methods.
• A no-arg constructor that initializes startTime with the current time.
• A method start() that resets the startTime to the current time.
• A method stop() that resets the endTime to the current time.
• A method getElapsedTime() that returns the elapsed time for the stopwatch in
milliseconds.
Draw a class diagram for this class and then implement the class. Write a test program
that measures the execution time of sorting 100,000 numbers using selection sort.
 */

import java.util.*;

public class RandomBubbleSort {

    public RandomBubbleSort() {
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[] numbers = new int[100000];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(10000);
        }

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort(numbers);
        stopWatch.stop();

        System.out.println("Sorting 100,000 numbers took " + stopWatch.getElapsedTime() + " milliseconds");
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
    public static class StopWatch {
        private long startTime = System.currentTimeMillis();
        private long endTime = startTime;

        public StopWatch() {
        }

        public double getStartTime() {
            return startTime;
        }

        public double getEndTime() {
            return endTime;
        }

        public void start() {
            startTime = System.currentTimeMillis();
        }

        public void stop() {
            endTime = System.currentTimeMillis();
        }

        public long getElapsedTime() {
            return endTime - startTime;
        }
    }
}