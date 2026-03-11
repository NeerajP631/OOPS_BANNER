import java.util.HashMap;
import java.util.Map;
public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        renderBanner("OOPS", patternMap);
    }
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        return map;
    }
    public static void renderBanner(String word, Map<Character, String[]> map) {

        int height = map.get('O').length;

        for (int i = 0; i < height; i++) {

            for (char c : word.toCharArray()) {

                String[] pattern = map.get(c);

                if (pattern != null) {
                    System.out.print(pattern[i] + "  ");
                }

            }

            System.out.println();
        }
    }
}