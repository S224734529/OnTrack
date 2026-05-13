package ontrack;

public class Main {

    public static void main(String[] args) {
        String dueDate = "2026-05-20";
        String submissionDate = "2026-05-18";

        String status = TaskSubmission.checkSubmissionStatus(dueDate, submissionDate);

        System.out.println("Submission status: " + status);
    }
}