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
        students.removeIf(n ->( n.length())%2!=0);
        System.out.println("Students name with odd length ");
        for (String str : students) {
            System.out.println(str);
        }
    }
}
