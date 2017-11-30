# Scannerでファイルを読み込んだ文字列を、リストに追加保存するコード例

## HowTo
```
javac -d . Main.java
java Main
```

## Tips
- [java.util.List](https://docs.oracle.com/javase/9/docs/api/java/util/List.html)はインタフェースになっており、Listクラスをそのまま利用することはできない。
  - 実装例が「All Known Implementing Classes:」に列挙されている。これらを使うか、もしくは、自分自身でListを継承した子クラスとして独自に実装する必要がある。
  - このコード例では、[java.util.ArrayList](https://docs.oracle.com/javase/9/docs/api/java/util/ArrayList.html)を使っている。
