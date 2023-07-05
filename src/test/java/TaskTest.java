import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void matchesForEpicTrue() {

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Хле");
        Assertions.assertEquals(expected, actual);
        Assertions.assertTrue(actual);
    }

    @Test
    public void matchesForEpicFalse() {

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = false;
        boolean actual = epic.matches("Хлю");
        Assertions.assertEquals(expected, actual);
        Assertions.assertFalse(actual);
    }

    @Test
    public void matchesForMeetingTopicTrue() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");

        boolean expected = true;
        boolean actual = meeting.matches("3й");
        Assertions.assertEquals(expected, actual);
        Assertions.assertTrue(actual);
    }

    @Test
    public void matchesForMeetingProjectTrue() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");

        boolean expected = true;
        boolean actual = meeting.matches("Нето");
        Assertions.assertEquals(expected, actual);
        Assertions.assertTrue(actual);
    }

    @Test
    public void matchesForMeetingTopicFalse() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");

        boolean expected = false;
        boolean actual = meeting.matches("3ий");
        Assertions.assertEquals(expected, actual);
        Assertions.assertFalse(actual);
    }

    @Test
    public void matchesForMeetingProjectFalse() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");

        boolean expected = false;
        boolean actual = meeting.matches("нето");
        Assertions.assertEquals(expected, actual);
        Assertions.assertFalse(actual);
    }

    @Test
    public void matchesForMeetingStartFalse() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");

        boolean expected = false;
        boolean actual = meeting.matches("обед");
        Assertions.assertEquals(expected, actual);
        Assertions.assertFalse(actual);
    }

    @Test
    public void matchesForSimpleTaskTrue() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = true;
        boolean actual = simpleTask.matches("Позвонить");
        Assertions.assertEquals(expected, actual);
        Assertions.assertTrue(actual);
    }

    @Test
    public void matchesForSimpleTaskFalse() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = false;
        boolean actual = simpleTask.matches("Покричать");
        Assertions.assertEquals(expected, actual);
        Assertions.assertFalse(actual);
    }

    @Test
    public void getSubtasks() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        epic.getSubtasks();

        String[] expected = {"Молоко", "Яйца", "Хлеб"};
        String[] actual = epic.getSubtasks();
    }

    @Test
    public void getTopic() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");

        meeting.getTopic();

        String[] expected = {"Выкатка 3й версии приложения"};
        String[] actual = {meeting.getTopic()};
    }

    @Test
    public void getProject() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");

        meeting.getProject();

        String[] expected = {"Приложение НетоБанка"};
        String[] actual = {meeting.getProject()};
    }

    @Test
    public void getStart() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");

        meeting.getStart();

        String[] expected = {"Во вторник после обеда"};
        String[] actual = {meeting.getStart()};
    }

    @Test
    public void getTitle() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        simpleTask.getTitle();

        String[] expected = {"Позвонить родителям"};
        String[] actual = {simpleTask.getTitle()};
    }

/*
    @Test
    public void equalsNull() {
        Task task = new Task(5);

        boolean expected = false;
        boolean actual = task.equals(null);
        Assertions.assertEquals(expected, actual);
        Assertions.assertFalse(actual);
    }

    @Test
    public void equals5() {
        Task task = new Task(5);

        //System.out.println(task.hashCode());
        boolean expected = false;
        boolean actual = task.equals(5);
        Assertions.assertEquals(expected, actual);
        Assertions.assertFalse(actual);
    }*/

    @Test
    public void matchesForTaskFalse() {
        Task task = new Task(5);

        task.matches(String.valueOf(5));

        boolean expected = false;
        boolean actual = task.matches(String.valueOf(5));
        Assertions.assertEquals(expected, actual);
        Assertions.assertFalse(actual);

    }
}
