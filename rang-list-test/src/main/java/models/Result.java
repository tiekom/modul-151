package models;

public class Result {
    Integer number;
    String time;

    public Result(Integer number, String time) {
        this.number = number;
        this.time = time;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "models.Result{" +
                "number=" + number +
                ", time='" + time + '\'' +
                '}';
    }
}
