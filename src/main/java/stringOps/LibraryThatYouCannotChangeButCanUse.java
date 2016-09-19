package stringOps;

/**
 * Created by Julien Smeets (jsmeets@quintor.nl) on 19-9-16.
 */
class LibraryThatYouCannotChangeButCanUse {
    private LibraryThatYouCannotChangeButCanUse(){};

    protected static String injectSpaces(String input){
        String answer = "";
        String[] temp = input.split("");
        for (int i = 0; i < temp.length; i++){
            answer += temp[i] + (i != temp.length - 1 ? " " : "");
        }
        return answer;
    }

    protected static String firstHalf(String input){
        return input.substring(input.length() / 2);
    }

    protected static int getLength(String input){
        return input.length();
    }
}
