package com.example.myproject;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Calculador {

    private int x,y;


    // unique methods

    public int sum(){
        return getX()+getY();
    }




}
