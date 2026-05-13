package ontrack;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class TaskSubmission {

    public static String checkSubmissionStatus(String dueDate, String submissionDate) {
        try {
            LocalDate due = LocalDate.parse(dueDate);
            LocalDate submitted = LocalDate.parse(submissionDate);

            if (submitted.isAfter(due)) {
                return "LATE";
            }

            return "ON_TIME";

        } catch (DateTimeParseException | NullPointerException e) {
            return "INVALID_DATE";
        }
    }
}
