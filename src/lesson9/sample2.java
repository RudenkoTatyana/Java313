package lesson9;

public class sample2 {
    public static void main(String[] args){
        try {
            String text = "PHP";
            System.out.println("Исходная строка: " + text);
            checkVowels(text);
            System.out.println("Строка содержит гласные буквы");
        } catch (NoVowelsExcaption e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static void checkVowels(String text) throws NoVowelsExcaption{
        boolean containsVoweis = false;
        String vowels = "aeiouyAEIOUY";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (vowels.contains(String.valueOf(ch))){
                containsVoweis = true;
                break;
            }
        }
        if (!containsVoweis){
            throw new NoVowelsExcaption("Строка не содержит гласные буквы.");

        }
    }
}

class NoVowelsExcaption extends Exception{
    public NoVowelsExcaption(String message) {
        super(message);
    }
}
