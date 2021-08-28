import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DiamondPrinter {

    final List<Character> alphabet = List.of('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');

    List<String> printToList(char a) {

        int diamondLenght = alphabet.indexOf(a);
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilderAux = new StringBuilder();
        String[] diamond = new String[diamondLenght * 2 + 1];

        for(int i = 0; i <= diamondLenght; i++) {

            for(int j = diamondLenght; j > 0; j--) {
                if (i == j) {
                    stringBuilder.append(alphabet.get(j));
                } else {
                    stringBuilder.append(" ");
                }
            }

            stringBuilderAux.append(stringBuilder);
            stringBuilder
                    .append(i == 0 ? "A" : " ")
                    .append(stringBuilderAux.reverse());

            diamond[i] = stringBuilder.toString();
            diamond[diamondLenght * 2 - i] = diamond[i];

            stringBuilder.setLength(0);
            stringBuilderAux.setLength(0);

        }

        return List.of(diamond);
    }

}
