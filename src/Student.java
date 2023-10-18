import java.util.ArrayList;
public class Student {
    public String name;
    public int age;
    public int grade;
    ArrayList<Integer> pupils = new ArrayList<Integer>();
    public Student(String name, int age, int grade) {
        name = name;
        age = age;
        grade = grade;
        pupils.add(grade);
    }

    public void detailsPrint() {
        System.out.println(name + " " + age + " " + grade);
    }

    public int averageAge() {
        int sum = 0;
        for (int i = 0; i < pupils.size(); i++) {
            sum += pupils.get(i);
        }
        return sum;
    }
}
