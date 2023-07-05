public class Epic extends Task {
    protected String[] subtasks;

    public Epic(int id, String[] subtasks) { // конструктор класса Epic
        super(id); // вызов родительского класса
        this.subtasks = subtasks; // заполнение своих полей
    }

    public String[] getSubtasks() {
        return subtasks;
    }

    @Override
    public boolean matches(String query) {
        for (String result : subtasks)
            if (result.contains(query)) {
                return true;
            }
        return false;
    }
}