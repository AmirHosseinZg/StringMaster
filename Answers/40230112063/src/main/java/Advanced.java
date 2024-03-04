import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public String wordCensor(String sentence, String word, String newWord){
        String[] arrStr = sentence.split(" ");

        for (int i=0 ; i<arrStr.length ; i++) {
            if(Objects.equals(arrStr[i], word))

            /* Why do we use Objects.equals(arrStr[i], word) instead of using strStr[in]==word:
            In Java, the == operator is used for reference comparison when applied to objects.
            It checks if the two operands refer to the exact same object in memory. For primitive data types (such as int, char, etc.), == compares the actual values.
            For example, when comparing objects (including strings), you should use the equals method for content comparison,
            as objects may have the same content but different memory addresses.
             */

                arrStr[i] = newWord;
        }


        sentence=arrStr[0];

        for (int i=1 ; i<arrStr.length ; i++)
        {
            sentence=sentence.concat(" ");
            sentence=sentence.concat(arrStr[i]);
        }

        return sentence;
    }

    /**
     * In this function You have a firstName and a lastName as Entry and you have to normalize them as a fullName
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName){

        int size1 = firstName.length();
        //normalizing firstName
        if('a'<=firstName.charAt(0) && firstName.charAt(0)<='z')
            firstName = (char)(firstName.charAt(0)-32) + firstName.substring(1);


        for(int i=1 ; i<size1-1 ; i++)
        {
            if('A'<=firstName.charAt(i) && firstName.charAt(i)<='Z')
                firstName = firstName.substring(0,i-1+1) + (char)(firstName.charAt(i)+32) + firstName.substring(i+1);
        }

        if('A'<=firstName.charAt(size1-1) && firstName.charAt(size1-1)<='Z')
            firstName = firstName.substring(0,size1-2+1) + (char)(firstName.charAt(size1-1)+32);


        int size2 = lastName.length();
        //normalizing lastName
        if(lastName.equals(" "))
            return (firstName);

        if('a'<=lastName.charAt(0) && lastName.charAt(0)<='z')
            lastName = (char)(lastName.charAt(0)-32) + lastName.substring(1);


        for(int i=1 ; i<size2-1 ; i++)
        {
            if('A'<=lastName.charAt(i) && lastName.charAt(i)<='Z')
                lastName = lastName.substring(0,i-1+1) + (char)(lastName.charAt(i)+32) + lastName.substring(i+1);
        }

        if('A'<=lastName.charAt(size2-1) && lastName.charAt(size2-1)<='Z')
            lastName = lastName.substring(0,size2-2+1) + (char)(lastName.charAt(size2-1)+32);

        if(Objects.equals(firstName, " "))
            return lastName;

        return (firstName+" "+lastName);
    }

    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word) {

        String[] mainWord = word.split(" ");

        for(int iterator=0 ; iterator<mainWord.length ; iterator++)
        {
            String[] arrStr = mainWord[iterator].split("");

            int arrSize = arrStr.length;

            int i=1;
            boolean flag=true;

            while(!Objects.equals(arrStr[i],null))
            {
                for(int j=i-1 ; j>=0 ; j--)
                {
                    if(Objects.equals(arrStr[i],arrStr[j]))
                    {
                        for(int k=i ; k<arrSize-1 ; k++)
                            arrStr[k]=arrStr[k+1];
                        arrStr[arrSize-1]=null;

                        flag=false;
                        break;
                    }
                    else
                        flag=true;
                }
                if(flag)
                    i++;
            }

            mainWord[iterator]="";
            for(i=0 ; !Objects.equals(arrStr[i],null);i++)
                mainWord[iterator]=mainWord[iterator].concat(arrStr[i]);
        }

        word=mainWord[0];

        for(int i=1 ; i<mainWord.length ; i++)
        {
            word=word.concat(" ");
            word=word.concat(mainWord[i]);
        }
        return word;
    }
}

