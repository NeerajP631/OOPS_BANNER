public class OOPSBannerApp {

    public static void main(String[] args) {

        CharacterPattern oPattern = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern pPattern = new CharacterPattern('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPattern sPattern = new CharacterPattern('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        CharacterPattern[] word = {
                oPattern,
                oPattern,
                pPattern,
                sPattern
        };

        int height = oPattern.getPattern().length;

        for (int i = 0; i < height; i++) {
            for (CharacterPattern cp : word) {
                System.out.print(cp.getPattern()[i] + "  ");
            }
            System.out.println();
        }
    }
}