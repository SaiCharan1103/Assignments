package q4;

import java.util.ArrayList;

public class removeoddwords {


    public static void main(String[] args)
    {
        ArrayList<String> students = new ArrayList<String>();

        students.add("Ramu");
        students.add("Mohankrishna");
        students.add("Shiva");
        students.add("Ravi");
        students.add("Sai");
        students.removeIf(n -> (n.charAt(0) == 'S'));
  
        System.out.println("Students name Does not start with S");
        for (String str : students) {
            System.out.println(str);
        }
    }
}