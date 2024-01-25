package module_2_3.homework2.task3;

import java.util.Objects;

public class Detail {

    private String name;

    public Detail(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Detail detail = (Detail) o;
        this.name = detail.name;
        return Objects.equals(name, detail.name);
    }

    @Override
    public int hashCode() {
        return 42;
    }

    @Override
    public String toString() {
        return "detail(" + name + ")";
    }
}