public class SimpleTask extends Task {
    protected String title;

    public SimpleTask(int id, String title) {// конструктор класса Simple Task
        super(id); // вызов родительского класса
        this.title = title; // заполнение своих полей
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean matches(String query) {
        return title.contains(query);
    }
}