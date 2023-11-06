import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Question {
    private String question;
    private ArrayList<String> choices;
    private String answer;

    public Question(String question, String[] choices, String answer){
        this.question = question;
        this.choices = new ArrayList<String>();

        this.choices.addAll(Arrays.asList(choices));

        // make sure each game shows questions in different order
        Collections.shuffle(this.choices);
        this.answer = answer;
    }

    public String getQuestion(){
        return question;
    }

    public ArrayList<String> getChoices(){
        return choices;
    }

    public String getAnswer(){
        return answer;
    }

}
