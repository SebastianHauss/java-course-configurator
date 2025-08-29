public class Test extends Element {
    private int numberOfQuestions;

    public Test(String name, int numberOfQuestions) {
        super(name);
        setNumberOfQuestions(numberOfQuestions);
    }

    public int getNumberOfQuestions() {
        return this.numberOfQuestions;
    }

    public void setNumberOfQuestions(int numberOfQuestions) {
        if (numberOfQuestions < 0) {
            this.numberOfQuestions = 0;
        } else {
            this.numberOfQuestions = numberOfQuestions;
        }
    }

    @Override
    public String toString() {
        return "[" + super.getName() + "] " + this.numberOfQuestions + " Question(s)";
    }
}
