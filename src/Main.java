public class Main {
    static final String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        WordsChecker wordsChecker = new WordsChecker(text);
        boolean lorem = wordsChecker.hasWord("Lorem");
        boolean n = wordsChecker.hasWord("09876");
        System.out.println(lorem);
        System.out.println(n);
    }
}