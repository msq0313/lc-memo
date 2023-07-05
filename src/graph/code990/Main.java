package graph.code990;

public class Main {
    public static void main(String[] args) {
        String[] questions = new String[]{
                "a==b",
                "b!=a"
        };
        // false
        System.out.println(new Solution().equationsPossible(questions));

    }
}
