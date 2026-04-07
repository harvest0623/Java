package lab6;

public class ChoiceQuestion {
    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String answer;
    public ChoiceQuestion(String question, String optionA, String optionB, String optionC, String optionD, String answer) {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.answer = answer;
    }
    public String getQuestion() {
        return question;
    }
    public String getOptionA() {
        return optionA;
    }
    public String getOptionB() {
        return optionB;
    }
    public String getOptionC() {
        return optionC;
    }
    public String getOptionD() {
        return optionD;
    }
    public String getAnswer() {
        return answer;
    }
    @Override
    public String toString() {
        return "题干：" + question + "\n" +
                "A. " + optionA + "\n" +
                "B. " + optionB + "\n" +
                "C. " + optionC + "\n" +
                "D. " + optionD + "\n" +
                "正确答案：" + answer + "\n" +
                "------------------------";
    }
}