package lesson13.hw.abstractClass;

import java.util.Objects;

public abstract class Ducks {
    protected String duckType;

    public Ducks(String duckType) {
        this.duckType = duckType;
    }

    public abstract void swim();

    public String getDuckType() {
        return duckType;
    }

    public void setDuckType(String duckType) {
        this.duckType = duckType;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ducks ducks = (Ducks) o;
        return Objects.equals(duckType, ducks.duckType);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(duckType);
    }

    @Override
    public String toString() {
        return "Ducks - " + duckType + "\n";
    }
}
