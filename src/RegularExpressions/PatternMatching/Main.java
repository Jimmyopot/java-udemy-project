package RegularExpressions.PatternMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String sentence = "I like B.M.W motorcycles.";
        boolean matched = Pattern.matches("[A-Z].*[.]", sentence);
        System.out.println(matched + ": " + sentence);

        Pattern firstPattern = Pattern.compile("[A-Z].*[.]");
        var matcher = firstPattern.matcher(sentence);
        System.out.println(matcher.matches() + ": " + sentence);
        System.out.println("sentence.length: " + sentence.length());
        System.out.println("Matched ending index: " + matcher.end());

        System.out.println(matcher.lookingAt() + ": " + sentence);
        System.out.println("Matched ending index: " + matcher.end());
        System.out.println("Matched on : " +
                sentence.substring(0, matcher.end()));

        String htmlSnippet = """
                <H1>My Heading</H1>
                <h2>Sub-heading</h2>
                <p>This is a paragraph about something.</p>
                <p>This is another paragraph about something else.</p>
                <h3>Summary</h3>
                """;

//        Pattern htmlPattern = Pattern.compile("<[hH]\\d>.*</[hH]\\d>");
//        Matcher htmlMatcher = htmlPattern.matcher(htmlSnippet);
//
//        while (htmlMatcher.find()) {
//            System.out.println(htmlMatcher.group("level") + " " +
//                    htmlMatcher.group(2));
//            System.out.println("index = " + htmlMatcher.start("level"));
//        }

//        htmlMatcher.reset();
//        htmlMatcher.results().forEach(mr -> System.out.println(
//                mr.group(1) + " " + mr.group(2)));

        String tabbedText = """
                group1  group2  group3
                1   2   3
                a   b   d
                """;

        tabbedText.lines()
                .flatMap(s -> Pattern.compile("\\t").splitAsStream(s))
                .forEach(System.out::println);
    }
}
