package com.company;

public class Main {

    public static void main(String[] args) {
        // sumメソッドの処理の実装
        PracticeInterface practiceInterface = (a, b) -> a + b;
        // インターフェースの呼び出し
        int result = practiceInterface.sum(2, 3);
        System.out.println("a + b =" + result);

    }

    /**
     * 関数型インターフェース
     */
    @FunctionalInterface
    private interface PracticeInterface {
        int sum(int a, int b);
    }
}
