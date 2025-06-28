package Workshop;

import java.util.*;

class QuizResultProcessor {
    private String[] correctAnswers;
    private List<Integer> scores;

    public QuizResultProcessor(String[] correctAnswers) {
        this.correctAnswers = correctAnswers;
        this.scores = new ArrayList<>();
    }

    public int calculateScore(String[] userAnswers) {
        if (userAnswers.length != correctAnswers.length) {
            System.out.println("Error: Answer length mismatch.");
            return -1;
        }
        int score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equalsIgnoreCase(userAnswers[i])) {
                score++;
            }
        }
        return score;
    }

    public String getGrade(int score) {
        double percentage = (score * 100.0) / correctAnswers.length;
        if (percentage >= 90) return "A";
        else if (percentage >= 75) return "B";
        else if (percentage >= 50) return "C";
        else return "D";
    }

    public void processUser(String[] userAnswers) {
        int score = calculateScore(userAnswers);
        if (score >= 0) {
            scores.add(score);
            System.out.println("User Score: " + score);
            System.out.println("Grade: " + getGrade(score));
        }
    }

    public void showAllScores() {
        System.out.println("All User Scores: " + scores);
    }

    public static void main(String[] args) {
        String[] correct = {"A", "B", "C", "D", "A"};
        QuizResultProcessor quiz = new QuizResultProcessor(correct);

        String[] user1 = {"A", "B", "C", "D", "A"};
        String[] user2 = {"A", "C", "C", "D", "B"};

        quiz.processUser(user1);
        quiz.processUser(user2);

        quiz.showAllScores();
    }
}
