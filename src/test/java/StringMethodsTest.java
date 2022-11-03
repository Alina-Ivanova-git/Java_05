import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {
    /* Test Data:
     * “    Red Rover School   “ → “Лишние пробелы удалены”
     * “Red Rover School“ → “Пробелов не было”
     * “” → “Строка пустая”/
     */
    @Test
    public void testRemoveSpaces_WithSpaces() {
        String a = "      Red Rover School   ";
        String expectedResult = "Лишние пробелы удалены";
        String actualResult = new StringMethods().removeSpaces(a);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveSpaces_NoSpaces() {
        String a = "Red Rover School";
        String expectedResult = "Пробелов не было";
        String actualResult = new StringMethods().removeSpaces(a);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveSpaces_EmptyLine() {
        String a = "";
        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().removeSpaces(a);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*  * Test Data:
     * “    Red Rover School   “ →  “Red Rover School“
     * “panda   “ → “pnd”
     * “taramasalata” → “trmslt”
     */

    @Test
    public void testRemoveAllAs_WithSpaces() {
        String a = "      Red Rover School   ";
        String expectedResult = "Red Rover School";
        String actualResult = new StringMethods().removeAllAs(a);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllAs_ARemove() {
        String a = "panda";
        String expectedResult = "pnd";
        String actualResult = new StringMethods().removeAllAs(a);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllAs_taramasalata() {
        String a = "taramasalata";
        String expectedResult = "trmslt";
        String actualResult = new StringMethods().removeAllAs(a);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllAs_EmptyLine() {
        String a = "";
        String expectedResult = "";
        String actualResult = new StringMethods().removeAllAs(a);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /* * Test Data:
     * “3504209706040000 “ →  “35429764“
     *“0000000111“ → “111”
     */
    @Test

    public void testRemoveAllZeros_ZeroesAndSpace() {
        String line = "3504209706040000 ";
        String expectedResult = "35429764";
        String actualResult = new StringMethods().removeAllZeros(line);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllZeros_Zeroes() {
        String line = "0000000111";
        String expectedResult = "111";
        String actualResult = new StringMethods().removeAllZeros(line);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllZeros_NoZeroes_ValidString() {
        String line = "123 ";
        String expectedResult = "This is a valid string";
        String actualResult = new StringMethods().removeAllZeros(line);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllZeros_EmptyLine() {
        String line = "";
        String expectedResult = "";
        String actualResult = new StringMethods().removeAllZeros(line);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /* Test Data:
     * “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
     * “p a     n   d a   “ → “panda”
     */

    @Test
    public void testRemoveAllSpaces_1() {
        String line = "    R e d     Ro ve    r Sc   h ool   ";
        String expectedResult = "RedRoverSchool";
        String actualResult = new StringMethods().removeAllSpaces(line);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllSpaces_2() {
        String line = "p a     n   d a   ";
        String expectedResult = "panda";
        String actualResult = new StringMethods().removeAllSpaces(line);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllSpaces_EmptyLine() {
        String line = "";
        String expectedResult = "";
        String actualResult = new StringMethods().removeAllSpaces(line);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /* Test Data:
     * “Abracadabra” → “5, 6”
     * “Homenum Revelio” → “0, 15”
     * “3 tarAmasAlatA” → “6, 8”
     */
    @Test

    public void testCountAs_WithA (){
        String line = "Abracadabra";
        String character = "a";
       String expectedResult = "5, 6";
        String actualResult = new StringMethods().countAs(line, character);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test

    public void testCountAs_NoA (){
        String line = "Homenum Revelio";
        String character = "a";
        String expectedResult = "0, 15";
        String actualResult = new StringMethods().countAs(line, character);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test

    public void testCountAs_AandSymbols (){
        String line = "3 tarAmasAlatA";
        String character = "a";
        String expectedResult = "6, 8";
        String actualResult = new StringMethods().countAs(line, character);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountAs_EmptyLine(){
        String line = "";
        String character = "a";
        String expectedResult = "";
        String actualResult = new StringMethods().countAs(line, character);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /* Test Data:
     * “As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current"
     * " long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy"
     * " version Java 8 LTS in January 2019 for commercial use, although it will otherwise still support"
     * " Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer"
     * " zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.” →  true
     *
     * "99 little bugs in a code.\n"
     * "99 little bugs in a code.\n"
     * "Take one down, and patch it around.\n"
     *"235 critical bugs in the code" → false
     */


    @Test
    public void testCountJava (){
        String line = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current"
                + " long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy"
                + " version Java 8 LTS in January 2019 for commercial use, although it will otherwise still support"
                + " Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer"
                + " zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        String java = "Java";
        boolean expectedResult = true;
        boolean actualResult = new StringMethods().countJava(line, java);
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testCountJava_1 (){
        String line = "99 little bugs in a code.\n"
                + "99 little bugs in a code.\n"
                + "Take one down, and patch it around.\n"
                + "235 critical bugs in the code";
        String java = "Java";
        boolean expectedResult = false;
        boolean actualResult = new StringMethods().countJava(line, java);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountJava_EmptyLine(){
        String line = "";
        String java = "Java";
        boolean expectedResult = false;
        boolean actualResult = new StringMethods().countJava(line, java);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /* Test Data:
     * “Abracadabra” →  ““Abracadabra””
     */
    @Test
    public void testInsertQuotes (){
        String word = "Abracadabra";
        String expectedResult = "\"Abracadabra\"";
        String actualResult = new StringMethods().insertQuotes(word);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /* Test Data:
     * “Федор Достоевский писал”, “Надо любить жизнь больше, чем смысл жизни.” →
     * “Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни."”
     * Задание со звездочкой:
     * “Наполеон Бонапарт писал”, “В моем словаре нет слова «невозможно».” →
     * "Наполеон Бонапарт писал: "В моем словаре нет слова "невозможно"."
     */

    @Test
    public void testInsertQuotesDostoevski (){
        String text = "Федор Достоевский писал";
        String textQuotes = "Надо любить жизнь больше, чем смысл жизни.";
        String expectesResult = "Федор Достоевский писал: \"Надо любить жизнь больше, чем смысл жизни.\"";
        String actualResult = new StringMethods().insertQuotesAuthorAndHisQuote(text, textQuotes);
        Assert.assertEquals(actualResult, expectesResult);
    }

    @Test
    public void testInsertQuotesBonapart(){
        String text = "Наполеон Бонапарт писал";
        String textQuotes = "В моем словаре нет слова «невозможно».";
        String expectesResult = "Наполеон Бонапарт писал: \"В моем словаре нет слова \"невозможно\".\"";
        String actualResult = new StringMethods().insertQuotesAuthorAndHisQuote(text, textQuotes);
        Assert.assertEquals(actualResult, expectesResult);
    }

    /* * Test Data:
    * “ташкент” → “Ташкент”
    * “ЧикаГО” → “Чикаго”
     */
    @Test
    public void testCityName(){
        String city = "ташкент";
        String expectedResult = "Ташкент";
        String actualResult = new StringMethods().cityName(city);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCityName_2(){
        String city = "ЧикаГО";
        String expectedResult = "Чикаго";
        String actualResult = new StringMethods().cityName(city);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /* * Test Data:
     * “Abracadabra”, “b” → “bracadab”
     * “Whippersnapper”, “p” → “ppersnapp”
     */

    @Test
    public void testIndexies (){
        String line = "Abracadabra";
        char letter = 'b';
        String expectedResult = "bracadab";
        String actualResult = new StringMethods().indexies(line, letter);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIndexies_2 (){
        String line = "Whippersnapper";
        char letter = 'p';
        String expectedResult = "ppersnapp";
        String actualResult = new StringMethods().indexies(line, letter);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /* Test Data:
     * “Abracadabra” → true
     * “Whippersnapper” → false
     * Написаны 4 негативных сценария
     */

    @Test
    public void testEqualCharacters (){
        String word = "Abracadabra";
        boolean expectedResult = true;
        boolean actualResult = new StringMethods().isEqualCharacters(word);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEqualCharacters_NotEqualCharacters (){
        String word = "Whippersnapper";
        boolean expectedResult = false;
        boolean actualResult = new StringMethods().isEqualCharacters(word);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNegative_Null_EqualCharacters (){
        String word = null;
        boolean expectedResult = false;
        boolean actualResult = new StringMethods().isEqualCharacters(word);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNegativeEqualCharacters_EmptyLine (){
        String word = "";
        boolean expectedResult = false;
        boolean actualResult = new StringMethods().isEqualCharacters(word);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNegative_EqualCharacters_trimAndEmpty (){
        String word = "                 ";
        boolean expectedResult = false;
        boolean actualResult = new StringMethods().isEqualCharacters(word);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNegative_EqualCharacters_twoWords (){
        String word = "           Wow QA";
        boolean expectedResult = false;
        boolean actualResult = new StringMethods().isEqualCharacters(word);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /* Test Data:
	 * “Red Rover” → “Rover”
     */

    @Test
    public void testTwoWords (){
        String line = "Red Rover";
        String expectedResult = "Rover";
        String actualResult = new StringMethods().twoWords(line);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNegative_TwoWords_trimAndEmpty (){
        String line = "                 ";
        String expectedResult = "";
        String actualResult = new StringMethods().twoWords(line);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /* Test Data:
	 * “Red rover”, 1, 4 → “Rover”
     */

    @Test
    public void testLineAndIndex (){
        String line = "Red rover";
        int indStart = 1;
        int indEnd = 4;
        String expectedResult = "Rover";
        String actualResult = new StringMethods().lineAndIndex(line, indStart, indEnd);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testLineAndIndex_EmptyLine (){
        String line = "";
        int indStart = 1;
        int indEnd = 4;
        String expectedResult = "";
        String actualResult = new StringMethods().lineAndIndex(line, indStart, indEnd);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*  * Test Data:
     * “QA for Everyone” → {“QA”, “for”, “Everyone”}
     * “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
     */

//    @Test
//    public void testSplitLine (){
//        String line = "QA for Everyone";
//        String expectedResult = "QA, for, Everyone";
//        String actualResult = new StringMethods().splitLine(line);
//        Assert.assertEquals(actualResult, expectedResult);
//    }

    /* Test Data:
     * “one”, “One”, “ONE”  → true
     * “one”, “Один”, “ONE” → false
     */

    @Test

    public void testIgnoreCamelCase(){
        String firstWord = "one";
        String secondWord = "        One";
        String thirdWord = "ONE";
        boolean expectedResult = true;
        boolean actualResult = new StringMethods().isWordsEqualCamelCase(firstWord, secondWord, thirdWord);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test

    public void testIgnoreCamelCase_notEqualWords(){
        String firstWord = "one";
        String secondWord = "один";
        String thirdWord = "ONE";
        boolean expectedResult = false;
        boolean actualResult = new StringMethods().isWordsEqualCamelCase(firstWord, secondWord, thirdWord);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNegativeIgnoreCamelCase_Null(){
        String firstWord = "one";
        String secondWord = null;
        String thirdWord = "ONE";
        boolean expectedResult = false;
        boolean actualResult = new StringMethods().isWordsEqualCamelCase(firstWord, secondWord, thirdWord);
        Assert.assertEquals(actualResult, expectedResult);
    }















}
