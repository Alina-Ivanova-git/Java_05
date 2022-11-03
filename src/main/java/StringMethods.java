import java.util.Locale;

import static project_utils.Utils.isStringNotNullAndNotEmpty;

public class StringMethods {
    /* 1. Написать метод removeSpaces(), который принимает на вход строку.
     * Если строка не пустая (проверить методом класса String), то примените метод по удалению пробелов
     *  в начале и в конце строки.
     * Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
     * Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
     * Если пробелов не было, вернуть сообщение “Пробелов не было”.
     * Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”.
     */


    public String removeSpaces(String a) {
        if (isStringNotNullAndNotEmpty(a)) {
            String b = a.trim();
            if (a.length() == b.length()) {
                return "Пробелов не было";
            } else

                return "Лишние пробелы удалены";
        }

        return "Строка пустая";
    }

    /* 2. Написать алгоритм removeAllAs().
     * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная,
     *  то метод удаляет все буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.
     * Test Data:
     * “    Red Rover School   “ →  “Red Rover School“
     * “panda   “ → “pnd”
     * “taramasalata” → “trmslt”
     */

    public String removeAllAs(String a) {
        if (isStringNotNullAndNotEmpty(a)) {
            a = a.trim();

            return a.replace("a", "");
        }

        return "";
    }

    /* 3. Написать алгоритм removeAllZeros().
     * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр.
     * Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
     * Метод возвращает обработанную строку, в которой нет нулей. Если в строке не было нулей,
     *  метод возвращает сообщение “This is a valid string”.
     * Test Data:
     * “3504209706040000 “ →  “35429764“
     *“0000000111“ → “111”
     */

    public String removeAllZeros(String line) {

        if (isStringNotNullAndNotEmpty(line)) {
            line = line.trim();
            if (line.contains("0")) {

                return line.replace("0", "");
            }

            return "This is a valid string";
        }

        return "";
    }

    /* 4. Написать алгоритм removeAllSpaces.
     * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
     *  Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
     * Метод возвращает обработанную строку.
     * Test Data:
     * “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
     * “p a     n   d a   “ → “panda”
     */

    public String removeAllSpaces(String line) {
        if (isStringNotNullAndNotEmpty(line)) {
            line = line.trim();
            line = line.replace(" ", "");

            return line;
        }

        return "";
    }

    /* 5. Напишите метод countAs(), который принимает на вход строку и считает, сколько букв а или А содержится в строке.
     * Метод возвращает количество букв a/A,  и количество букв/знаков в слове без букв a/A. Итоговый результат должен
     *  строится с помощью метода из видео 2.
     * Test Data:
     * “Abracadabra” → “5, 6”
     * “Homenum Revelio” → “0, 15”
     * “3 tarAmasAlatA” → “6, 8”
     */
    public String countAs(String line, String character) {
        if (isStringNotNullAndNotEmpty(line) && isStringNotNullAndNotEmpty(character)) {

            line = line.trim().toLowerCase();
            String line2 = String.valueOf(line.replace(character, "").length());
            int line3 = line.length() - line.replace(character, "").length();
            System.out.println(line3 + ", " + line2);

            return line3 + ", " + line2;
        }

        return "";
    }

//    public String countAs(String line, String character) {
//        if (isStringNotNullAndNotEmpty(line) && isStringNotNullAndNotEmpty(character)) {
//
//            line = line.trim().toLowerCase();
//            int line2 = line.replace(character, "").length();
//            int line3 = line.length() - line.replace(character, "").length();
//            System.out.println(line3 + ", " + line2);
//
//            return String.valueOf(line3) +", " + String.valueOf(line2);
//        }
//
//        return "";
//    }

    /* 6. Напишите метод countJava(), который принимает на вход текст и проверяет, содержится ли в тексте хотя бы одно слово Java.
     */
    public boolean countJava(String line, String java) {
        if (isStringNotNullAndNotEmpty(line)) {
            line = line.trim();
            java = java.trim();

            return line.contains(java);

        }

        return false;
    }

    /* 7. Напишите метод insertQuotes(), который принимает слово и возвращает строку, в которой это слово “обернуто” в кавычки:
     * Test Data:
     * “Abracadabra” →  ““Abracadabra””
     */

    public String insertQuotes(String word) {
        if (isStringNotNullAndNotEmpty(word)) {
            word = word.trim();

            return "\"" + word + "\"";
        }

        return "";
    }

    /* 8. Напишите метод insertQuotes(), который принимает на вход две строки, и добавляет знак :  после слова “писал”,
     * и оборачивает в кавычки вторую строку (результат строится с помощью метода concat())
     * Test Data:
     * “Федор Достоевский писал”, “Надо любить жизнь больше, чем смысл жизни.” →
     * “Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни."”
     * Задание со звездочкой:
     * “Наполеон Бонапарт писал”, “В моем словаре нет слова «невозможно».” →
     * "Наполеон Бонапарт писал: "В моем словаре нет слова "невозможно".""
     */

    public String insertQuotesAuthorAndHisQuote(String text, String textQuote) {
        if (isStringNotNullAndNotEmpty(text) && isStringNotNullAndNotEmpty(textQuote)) {
            text = text.trim();
            textQuote = textQuote.trim();
            char d = (char) 34;
            text = text.replace("писал", "писал: ");
            textQuote = textQuote.replace("писал", "писал:");
            textQuote = textQuote.replace("«", "\"");
            textQuote = textQuote.replace("»", "\"");

            return text.concat(String.valueOf(d)).concat(textQuote).concat(String.valueOf(d));
        }

        return "";
    }

    /* 9. Напишите метод, кторый принимает на вход название города и исправляет написание:
     * Test Data:
     * “ташкент” → “Ташкент”
     * “ЧикаГО” → “Чикаго”
     */

    public String cityName(String city) {
        if (isStringNotNullAndNotEmpty(city)) {
            city = city.trim();

            return city.substring(0, 1).toUpperCase(Locale.ROOT).concat(city.substring(1).toLowerCase());
        }

        return "";
    }

    /* 10. Напишите метод, который принимает на вход строку и букву-параметр, и возвращает все, что находится между
     * первой и последней буквой-параметром:
     * Test Data:
     * “Abracadabra”, “b” → “bracadab”
     * “Whippersnapper”, “p” → “ppersnapp”
     */

    public String indexies(String line, char letter) {
        if (isStringNotNullAndNotEmpty(line)) {
            line = line.trim().toLowerCase();

            return line.substring(line.indexOf(letter), (line.lastIndexOf(letter) + 1));
        }

        return "";
    }

    /* 11. Напишите метод, который принимает на вход слово, и возвращает true, если слово начинается и заканчивается
     * на одинаковую букву, и false иначе
     * Test Data:
     * “Abracadabra” → true
     * “Whippersnapper” → false
     */

    public boolean isEqualCharacters(String word) {

        if (word != null && !word.trim().isEmpty() && !word.trim().contains(" ")) {
            word = word.trim().toLowerCase();

            return word.lastIndexOf(word.charAt(0)) == (word.length() - 1);
        }

        return false;
    }

    /* 12. Напишите метод, который принимает на вход строку из двух слов, разделенных пробелом, и возвращает последнее слово
     * Test Data:
     * “Red Rover” → “Rover”
     */

    public String twoWords(String line) {
        if (isStringNotNullAndNotEmpty(line)) {
            line = line.trim();

            return line.substring(line.indexOf(" ") + 1, line.length());
        }

        return "";
    }


    /* 13. Написать метод, который принимает строку, и 2 индекса. Метод удаляет все, что находится между двумя индексами включительно
     * Test Data:
     * “Red rover”, 1, 4 → “Rover”
     */

    public String lineAndIndex(String line, int indStart, int indEnd) {
        if (isStringNotNullAndNotEmpty(line)) {

            return line.substring(0, indStart).concat(line.substring(indEnd + 1));
        }

        return "";
    }

    /* 14. Напишите метод, который принимает на вход предложение и возвращает слова из этого предложения в виде массива слов
     * Test Data:
     * “QA for Everyone” → {“QA”, “for”, “Everyone”}
     * “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
     */
    public String splitLine(String line) {
        if (isStringNotNullAndNotEmpty(line)) {

            String[] parts = line.split(" ");

            for (int i = 0; i < parts.length; i++) {
                System.out.println(parts[i]);

                return parts[i] + ", ";
            }
        }

        return "";
    }

    /* 15. Написать метод, который принимает на вход предложение, которое состоит из имени, фамилии, отчества и возвращает текст:
    * Test Data:
    * “Александр Сергеевич Пушкин” →
    * “Имя: Александр
    * Отчество: Сергеевич
    * Фамилия: Пушкин”


    /*  16. Написать метод, который принимает на вход слово и число n,  и возвращает строку, где слово повторяется n раз.
     * Test Data:
     * “one”, 5 → “oneoneoneoneone”
     */

    /* 17. Напишите метод, который принимает строку и index, и возвращает численное значение буквы, которая находится
     * на позиции index (использовать только один метод класса String)
     */

    public int lineCharacterAndIndex (String line, int index){
        if (isStringNotNullAndNotEmpty(line)) {
            int numbChar = 0;
            for (int i = 0; i < line.length(); i++) {
                numbChar = line.charAt(index);
            }
            System.out.println(numbChar);
            return numbChar;

        }

        return 0;
    }

    /* 18. Написать метод, который принимает 3 слова, и сравнивает их методом, который считает, что прописные
     * и заглавные буквы - это одни и те же буквы. Метод возвращает true, если все слова одинаковы, и метод возвращает
     * false, если слова не одинаковы:
     * Test Data:
     * “one”, “One”, “ONE”  → true
     * “one”, “Один”, “ONE” → false
     */

    public boolean isWordsEqualCamelCase(String firstWord, String secondWord, String thirdWord){
        if ((isStringNotNullAndNotEmpty(firstWord)) && (isStringNotNullAndNotEmpty(secondWord)) && (isStringNotNullAndNotEmpty(thirdWord))){
            firstWord = firstWord.trim().toLowerCase();
            secondWord = secondWord.trim().toLowerCase();
            thirdWord = thirdWord.trim().toLowerCase();
            if (firstWord.equals(secondWord) && secondWord.equals(thirdWord)){

                return true;
            }
        }

        return false;
    }


}
