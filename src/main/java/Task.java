import java.util.Objects;

public class Task {
    protected int id;

    public Task(int id) { // конструктор класса Task
        this.id = id;
    }

    public int getId() {
        return id;
    }

/*    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }*/

    public boolean matches(String query) {
        return false;
    }
}
