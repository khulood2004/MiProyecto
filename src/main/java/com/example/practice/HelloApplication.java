package com.example.practice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a numbr: ");
        int numberOne = scanner.nextInt();
        System.out.println("Enter another number: ");
        int numberTwo= scanner.nextInt();
        if (numberOne < numberTwo);
        System.out.println(" the first number is smaller then the second:" +numberOne);


    }
}