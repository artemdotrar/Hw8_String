import java.util.Locale;

public class MainString {
    public static void main(String[] args) {
        String str = "This string created by =";
        String str2 = "Казак съел боб и сказал лол кек";

        System.out.println(str);
        System.out.println("Распечатать последний символ строки " + str.charAt(str.length() - 1));
        System.out.println("Проверить, заканчивается ли ваша строка подстрокой by = " + str.endsWith("by ="));
        System.out.println("Проверить, начинается ли ваша строка подстрокой This " + str.startsWith("This"));
        System.out.println("Проверить, содержит ли ваша строка подстроку created " + str.contains("created"));
        System.out.println("Найти позицию подстроки string " + str.lastIndexOf("string"));
        System.out.println("Заменить все символы a на o " + str.replace("a", "o"));
        System.out.println("Преобразуйте строку к верхнему регистру " + str.toUpperCase());
        System.out.println("Преобразуйте строку к нижнему регистру " + str.toLowerCase());
        System.out.println("Вырезать строку created " + str.substring(str.indexOf("created"), str.indexOf("created") + 8));

        System.out.println("\n" + str2);
        System.out.println("Поиск палиндромов в строке : " + str2 + ". Палиндромы: " + searchPalindorms(str2));
        System.out.println("Написать метод, который находит и выводит все слова, длина которых от 3 до 5 включительно: " + searchWordsByLength(str2, 3, 5));
        System.out.println("Написать метод, который возвращает самое маленькое слово в тексте: " + searchMinLengthWord(str2));
        System.out.println("Написать метод, который возвращает самое большое слово в тексте: " + searchMaxLengthWord(str2));

        StringBuilder stringBuilder = new StringBuilder("3 + 56 = 59");
        stringBuilder.replace(2,3, "-");
        stringBuilder.replace(8,4, "-168");
        System.out.println(stringBuilder);
    }

    private static String searchMinLengthWord(String str) {
        String[] words = str.split(" ");
        String min = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < min.length()) {
                min = words[i];
            }
        }
        return min;
    }

    private static String searchMaxLengthWord(String str) {
        String[] words = str.split(" ");
        String max = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > max.length()) {
                max = words[i];
            }
        }
        return max;
    }

    private static String searchWordsByLength(String str, int min, int max) {
        String result = "";
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= min && words[i].length() <= max) {
                result += words[i] + ", ";
            }
        }
        return result;
    }

    private static boolean isPalindrom(String str) {
        String strReverse = "";
        str = str.toLowerCase();
        for (int i = str.length() - 1; i >= 0; i--) {
            strReverse += str.charAt(i);
        }
        return str.equals(strReverse) ? true : false;
    }

    private static String searchPalindorms(String str) {
        String result = "";
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (isPalindrom(words[i])) {
                result += words[i] + ", ";
            }
        }
        return result;
    }
}
