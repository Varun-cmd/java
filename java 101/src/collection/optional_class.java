package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class student{
    private String name;
    private int roll;

    public student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }
}



public class optional_class {


    public static void main(String[] args) {

        List<String> names = Arrays.asList("varun","ravi","brad","laxmi");
        Optional<String> target = names.stream()
                .filter(n -> n.contains("x"))
                .findFirst();
        System.out.println(target.orElse("Not found"));

        List<String> new_list= names.stream()
                .map(String::toUpperCase)
                .toList();

        new_list.forEach(System.out::println);


        List<student> stu = new ArrayList<>();
        for (String name :names)
            stu.add(new student(name));     // without constructor reference

        System.out.println(stu);






        List<student> s = new ArrayList<>();

        s = names.stream()
                .map(student::new)  // with constructor reference
                .toList();

        s.forEach(System.out::println);
        System.out.println(s);
    }




}
