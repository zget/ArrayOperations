package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {


    @RequestMapping("/")
    public String MainMethod() {
        double[] data = {12, 3, 5, 67, 31, 8, 34};

        double sumOfArray = sumArray(data);
        double average = sumArray(data) / data.length;

        double[] sortedArray = bubbleSort(data);

        return "The sum of the elements of the array " + arrayDisplay(data) + " is : " + Double.toString(sumOfArray) + "</br>"
                + "the average is " + average + "</br>"
                + " the buble sorted array is :" + arrayDisplay(sortedArray);

    }


    //Array Elements displaying method

    public String arrayDisplay(double[] data) {

        String message = "[";
        for (int i = 0; i < data.length - 2; i++) {
            message = message + data[i] + ", ";

        }
        return message + data[data.length - 1] + "]";
    }

    //Method to calculate a sum of members of the array
    public double sumArray(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            sum += array[i];

        }
        return sum;
    }

    //Bubble sort Algorithm.

    public double[] bubbleSort(double[] array) {

        double temp = 0;
        for (int i = 0; i < array.length - 2; i++)
            for (int j = i + 1; j < array.length; j++)

                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }


        return array;
    }
}