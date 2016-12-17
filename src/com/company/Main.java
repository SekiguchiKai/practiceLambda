package com.company;

public class Main {

    public static void main(String[] args) {
        /* オーソドックスなラムダ式 */
        // sumメソッドの処理の実装
        OrthodoxLambda orthodoxLambda = (a, b) -> a + b;
        // インターフェースの呼び出し
        int result = orthodoxLambda.sum(2, 3);
        System.out.println("a + b =" + result);


        /* 三項演算子の場合 */
        TertiaryOperator tertiaryOperator = number -> number >= 5 ? "ご指定の数字は5以上です" : "ご指定の数字は5未満です";
        System.out.println(tertiaryOperator.judgeNumber(7));


    }

    /**
     * 関数型インターフェース
     */
    @FunctionalInterface
    private interface OrthodoxLambda {
        int sum(int a, int b);
    }

    /**
     * 関数型インターフェース
     */
    @FunctionalInterface
    private interface TertiaryOperator {
        String judgeNumber(int number);
    }

}
