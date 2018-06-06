package com.medipol.sort;

import com.medipol.Student;

public class MyQuickSort {
    
    private Student[] array;
    private int length;
 
    public void sort(Student[] sortedStudents) {
         
        if (sortedStudents == null || sortedStudents.length == 0) {
            return;
        }
        this.array = sortedStudents;
        length = sortedStudents.length;
        quickSort(0, length - 1);
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = (int)array[lowerIndex+(higherIndex-lowerIndex)/2].avarageGrade;
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which 
             * is greater then the pivot value, and also we will identify a number 
             * from right side which is less then the pivot value. Once the search 
             * is done, then we exchange both numbers.
             */
            while (array[i].avarageGrade < pivot) {
                i++;
            }
            while (array[j].avarageGrade > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        Student temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
    
    }

