package com.example.githubActionsUnitTest;

import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Controller;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    @Test
    void testmyMethod(){
        //Arrange
        MyController mycontroller = new MyController();

        //Act
        int result = mycontroller.myMethod(3,2);

        //Assert
        assertEquals(5,result);

    }

    @Test

    void  testdivinision() {
        //Arrange
        MyController mycontroller = new MyController();

        //Act
        double result = mycontroller.divinision(5, 2);

        //Assert
        assertEquals(2.5, result);
     }

    }