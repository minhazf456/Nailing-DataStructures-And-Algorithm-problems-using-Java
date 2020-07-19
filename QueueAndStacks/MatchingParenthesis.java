package QueueAndStacks;

public class MatchingParenthesis {
    public static int getClosingParenthesis(String sentence, int OpeningParenIndex){
        int openNestedParens = 0;

        for (int position = openNestedParens +1 ; position < sentence.length(); position ++){
            char c = sentence.charAt(position);

            if ( c == '('){
                openNestedParens++;
            }
            else if (c == ')'){
                if ( openNestedParens == 0){
                    return position;
                }
                else {
                    openNestedParens--;
                }
            }
        }
        throw new IllegalArgumentException("No closing parenthesis :(");
    }
    public static void main (String[] args){
        System.out.println(getClosingParenthesis("((((()))))", 2));

    }
}
