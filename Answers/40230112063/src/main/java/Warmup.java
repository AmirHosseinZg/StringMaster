public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        String[] arrStr = sentence.split(" ");

        int arrSize = arrStr.length;

        if(number>arrSize)
            return (" Number = " + number + " is out Of Bound");
        else
            return arrStr[number-1];
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
        public int oddEvenCounter(String number, boolean searchForEven) {

            int result=0;
            int sizeStr = number.length();
            int tmp;

            if(searchForEven) // bool = true = Even numbers
            {
                for(int i=0 ; i<sizeStr ; i++)
                {
                    tmp = (int) number.charAt(i) - 48 ;

                    if(tmp % 2 == 0)
                        result++;
                }
            }

            else // bool = False = Odd numbers
            {
                for(int i=0 ; i<sizeStr ; i++)
                {
                    tmp = (int) number.charAt(i) - 48 ;

                    if(tmp % 2 != 0)
                        result++;
                }
            }

            return result;
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {
        return null;
    }
}
