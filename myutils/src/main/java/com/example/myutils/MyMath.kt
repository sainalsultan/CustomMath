package com.example.myutils

/**
 * Created by Sainal Sultan on 5/17/2020.
 * sainalsultan@gmail.com | Hasanah Dev.
 */
class MyMath {

    fun Plus(a : Int, b : Int) : Int{
        return a+b
    }

    fun Minus(a : Int, b : Int) : Int{
        return a-b
    }

    fun Times(a : Int, b : Int) : Int{
        return a*b
    }

    fun Div(a : Int, b : Int) : Int{
        if (b==0 )
            throw IllegalAccessException("Div by Zero Error")
        else
            return a/b
    }

}