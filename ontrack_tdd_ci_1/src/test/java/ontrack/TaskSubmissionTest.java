package ontrack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TaskSubmissionTest {

    @Test
    public void testSubmissionBeforeDueDateReturnsOnTime() {
        String result = TaskSubmission.checkSubmissionStatus("2026-05-20", "2026-05-18");
        assertEquals("ON_TIME", result);
    }

    @Test
    public void testSubmissionOnDueDateReturnsOnTime() {
        String result = TaskSubmission.checkSubmissionStatus("2026-05-20", "2026-05-20");
        assertEquals("ON_TIME", result);
    }

    @Test
    public void testSubmissionAfterDueDateReturnsLate() {
        String result = TaskSubmission.checkSubmissionStatus("2026-05-20", "2026-05-21");
        assertEquals("LATE", result);
    }

    @Test
    public void testInvalidDueDateReturnsInvalidDate() {
        String result = TaskSubmission.checkSubmissionStatus("wrong-date", "2026-05-18");
        assertEquals("INVALID_DATE", result);
    }

    @Test
    public void testInvalidSubmissionDateReturnsInvalidDate() {
        String result = TaskSubmission.checkSubmissionStatus("2026-05-20", "wrong-date");
        assertEquals("INVALID_DATE", result);
    }

    @Test
    public void testNullDueDateReturnsInvalidDate() {
        String result = TaskSubmission.checkSubmissionStatus(null, "2026-05-18");
        assertEquals("INVALID_DATE", result);
    }

    @Test
    public void testNullSubmissionDateReturnsInvalidDate() {
        String result = TaskSubmission.checkSubmissionStatus("2026-05-20", null);
        assertEquals("INVALID_DATE", result);
    }
}