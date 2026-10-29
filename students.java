import java.util.ArrayList;

public class students {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Priya");
        students.add("Amit");

        System.out.println("Students after adding:");
        System.out.println(students);

        students.remove("Priya");

        System.out.println("Students after removing Priya:");
        System.out.println(students);
    }
}