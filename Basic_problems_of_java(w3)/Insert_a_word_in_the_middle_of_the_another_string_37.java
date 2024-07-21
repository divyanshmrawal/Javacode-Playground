//QUESTION-->
//Write a Java program to insert a word in the middle of another string.

//ANSWER-->
public class Insert_a_word_in_the_middle_of_the_another_string_37{
    public static void main(String[] args){
        //creating String 
        String Main_string="Python 3.0";
        String word="Tutorial ";

        //Printing value of String
        String result=Main_string.substring(0,7)+word+Main_string.substring(7,10);
        System.out.println(result);
    }
}