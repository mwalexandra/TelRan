public class App {
    public static void main(String[] args) {
        ConcatenationTester tester = new ConcatenationTester();
        Concatenator stringConcat = new StringConcatenator();
        Concatenator stringbufferConcat = new StringBufferConcat();
        Concatenator stringbuilderConcat = new StringBuilderConcat();
        Concatenator charArrayConcat = new CharArrayConcat();

        System.out.println(tester.test(stringConcat, "Hello world guys", 100000));
        System.out.println(tester.test(stringbufferConcat, "Hello world guys", 100000));
        System.out.println(tester.test(stringbuilderConcat, "Hello world guys", 100000));
        System.out.println(tester.test(charArrayConcat, "Hello world guys", 100000));
    }
}
