package com.company;

import java.io.IOException;
import java.util.stream.IntStream;

/**
 * FizzBuzz練習クラス
 * Created by sekiguchikai on 2017/01/06.
 */
public class FizzBuzz {

    /**
     * メインメソッド
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {

        // ラムダ1
        System.out.println("---------FizzBuzz1---------");
        IntStream.range(1, 101).
                mapToObj(num -> num % 15 == 0 ? "FizzBuzz!"
                        : num % 3 == 0 ? "Fizz!"
                        : num % 5 == 0 ? "Buzz!"
                        : String.valueOf(num))
                .forEach(numString -> System.out.println(numString));


        // ラムダ2
        System.out.println("---------FizzBuzz2---------");
        IntStream.range(1, 101).forEach(i -> System.out.println(fizzBuzz(i)));

    }


    /**
     * FizzBuzzを実行するメソッド
     *
     * @param num 数字
     * @return FizzBuzzの審査結果
     */
    public static String fizzBuzz(int num) {
        return num % 15 == 0 ? "FizzBuzz!" :
                num % 3 == 0 ? "Fizz!" :
                        num % 5 == 0 ? "Buzz!"
                                : String.valueOf(num);
    }


}

