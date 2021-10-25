public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] words = {"What","must","be","acknowledgment","shall","be"};
        int maxwidth = 16;
        for (String str :
                s.fullJustify(words,maxwidth)) {
            System.out.println(str);
        }

    }
}
