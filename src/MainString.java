import java.util.Locale;

public class MainString {
    public static void main (String[] args){
        String str = "This string created by =";
        String str2 = "Казак съел боб и сказал лол кек";

        System.out.println(str);
        System.out.println("Распечатать последний символ строки " + str.charAt(str.length() - 1));
        System.out.println("Проверить, заканчивается ли ваша строка подстрокой .. " + str.endsWith("by ="));
        System.out.println("Проверить, начинается ли ваша строка подстрокой .. " + str.startsWith(" This"));
        System.out.println("Проверить, содержит ли ваша строка подстроку .. " + str.contains("created"));
        System.out.println("Найти позицию подстроки .. " + str.lastIndexOf("string"));
        System.out.println("Заменить все символы a на o " + str.replace("a", "o"));
        System.out.println("Преобразуйте строку к верхнему регистру " + str.toUpperCase());
        System.out.println("Преобразуйте строку к нижнему регистру " + str.toLowerCase());
        System.out.println("Вырезать строку created " + str.substring(str.indexOf("created"),str.indexOf("created") + 8));

        System.out.println("Поиск палиндромов в строке : " + str2 + ". Палиндромы: " + searchPalindorms(str2));
        System.out.println("Написать метод, который находит и выводит все слова, длина которых от 3 до 5 включительно: " + searchWordsByLength(str2));

    }
    private static String searchWordsByLength(String str){
        String result = "";
        String[] words = str.split(" ");
        for(int i = 0; i < words.length; i++){
            if(words[i].length() >= 3 && words[i].length() <= 5){
                result += words[i] + ", ";
            }
        }
        return result;
    }

    private static boolean isPalindrom(String str){
        String strReverse = "";
        str = str.toLowerCase();
        for(int i = str.length() - 1; i >= 0; i--){
            strReverse += str.charAt(i);
        }
        return str.equals(strReverse) ? true : false;
    }

    private static String searchPalindorms(String str){
        String result = "";
        String[] words = str.split(" ");
        for (int i = 0; i<words.length; i++){
            if(isPalindrom(words[i])){
                result+= words[i] + ", ";
            }
        }
        return result;
    }
}
