import java.io.Serializable;

public class FootBallPlayer implements Serializable {
    private String name;
    private int age;
    private String team;
    private double salary;

    public FootBallPlayer(String name, int age, String team, double salary) {
        this.name = name;
        this.age = age;
        this.team = team;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.team + " " + this.salary;
    }
}
