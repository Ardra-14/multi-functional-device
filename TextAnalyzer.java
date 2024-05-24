
public class TextAnalyzer {
    public void countWords(String str){
        int count =1;
        for (int i = 0 ; i < (str.length()-1) ; i++){
            if(str.charAt(i) == ' ' &&  str.charAt(i + 1) != ' '){
                count++;
            }
        }
        System.out.println("Number of words are: " + count);
    }

    public void countCharacters(String str){
        int count = 1;
        for (int i = 0; i < (str.length() -1); i++){
            if(str.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("Number of characters: "+ count);
    }

    public void countVowels(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length() ; i++){
           char c = str.charAt(i);
           if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
               count++;
           }
        }
        System.out.println("Number of vowels are: "+count);
    }
}
