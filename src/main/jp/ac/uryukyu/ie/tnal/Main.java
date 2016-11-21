package jp.ac.uryukyu.ie.tnal;

import java.io.File; // ファイルやディレクトリの抽象表現
import java.io.FileNotFoundException; // 例外
import java.util.ArrayList; // Listの実装
import java.util.List; // いわゆる「リスト構造」のインターフェース（実装のないクラス。教科書19章）
import java.util.Scanner; // 標準入力読み込みの際に利用したクラス

/**
 * Scannerクラスを用いたファイル読み込みの例。
 * ・1行ずつ読み込み、String型のリストとして保存する。
 * ・ファイルオープン時に例外が発生する可能性があるため、例外に対応するコード例も含む。
 */
public class Main {

    public static void main(String[] args) {
        /* ファイルのパスは、プロジェクトのトップディレクトリを基準とした相対パスで記述。
            .javaファイルを置いてるディレクトリ基準ではないことに注意。 */
        String filename = "./src/main/jp/ac/uryukyu/ie/tnal/map.txt";
        List<String> strings = new ArrayList<>(); // ファイルから読み込んだ文字列を保存するためのリスト。
        Scanner scanner;

        /* 想定している例外が起きる箇所では、予め例外に対応した処理を記述する。
            try{ 例外が起きる箇所 }
            catch(想定してる例外){例外処理}
            finally{例外の有無にかかわらず、最終的に実行させたい処理}
         */
        try {
            scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                strings.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

        // リストをそのまま出力してみる
        System.out.println("リストをそのまま出力してみる");
        System.out.println(strings);

        // 要素毎に出力してみる
        System.out.println("\n\n要素毎に出力してみる");
        for(String str: strings){
            System.out.println(str);
        }

        // 行番号付けてみる
        System.out.println("\n\n行番号付けてみる");
        for(int i=0; i<strings.size(); i++){
            System.out.printf("%d行目: %s\n", i, strings.get(i));
        }
    }
}
