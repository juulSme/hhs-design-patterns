package stringOps;

/**
 * Created by Julien Smeets (jsmeets@quintor.nl) on 19-9-16.
 */
public final class LibraryThatYouCannotChangeButCanUse {
    protected String injectSpaces(String input){
        String answer = "";
        String[] temp = input.split("");
        for (int i = 0; i < temp.length; i++){
            answer += temp[i] + (i != temp.length - 1 ? " " : "");
        }
        return answer;
    }

    protected String firstHalf(String input){
        return input.substring(input.length() / 2);
    }

    protected int getLength(String input){
        return input.length();
    }
}
