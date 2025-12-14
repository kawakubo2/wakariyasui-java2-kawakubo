package chapter12;

public class Continue1{
    public static void main(String[] args) {
        String[] words = { "旅行", "NG", "かばん", "ラジオ", "NG", "岸辺", "テレビ"};

        for (String word: words) {
            if ("NG".equals(word)) {
                continue;
            }
            System.out.println(word);
        }
    }
}
