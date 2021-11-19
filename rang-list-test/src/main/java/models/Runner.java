package models;

public class Runner extends Result {
    Kategory kategory;
    String name;

    public Runner(Integer number, Kategory kategory, String name, String time) {
        super(number, time);
        this.kategory = kategory;
        this.name = name;
    }

    public Kategory getKategory() {
        return kategory;
    }

    public void setKategory(Kategory kategory) {
        this.kategory = kategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "models.Runner{" +
                "number=" + number +
                ", time='" + time + '\'' +
                ", kategory=" + kategory +
                ", name='" + name + '\'' +
                '}';
    }

}
