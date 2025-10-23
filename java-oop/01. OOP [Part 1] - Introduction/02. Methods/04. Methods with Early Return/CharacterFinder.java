public class CharacterFinder {

    public int findIndexOf(String str, char characterToFind) {
        if (str == null) {
            return -1; // return a negative value to communicate that "str" is null
        }

        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == characterToFind) {
                index = i;
                break;
            }
        }

        return index;
    }

    public int findLastIndexOf(String str, char characterToFind) {
        if (str == null) {
            return -1; // return a negative value to communicate that "str" is null
        }

        int lastIndex = -1;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == characterToFind) {
                lastIndex = i;
                break;
            }
        }

        return lastIndex;
    }

    public static void main(String[] args) {
        CharacterFinder characterFinder = new CharacterFinder();

        int index = characterFinder.findIndexOf("Hello World", 'l');
        System.out.println("First Index: " + index);

        int lastIndex = characterFinder.findLastIndexOf("Hello World", 'l');
        System.out.println("Last Index: " + lastIndex);
    }
}
