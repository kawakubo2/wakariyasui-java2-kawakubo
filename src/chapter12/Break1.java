package chapter12;

public class Break1 {
    public static void main(String[] args) {
        String[] words = { "旅行", "かばん", "ラジオ", "終了", "岸辺", "テレビ"};

        for (String word: words) {
            if ("終了".equals(word)) {
                break;
            }
            System.out.println(word);
        }
    }
}
