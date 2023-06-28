class Students{
  long  rolno;
  String name;
  int marks;

}



public class objectArray {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.rolno =1;
        s1.name="Nabin";
        s1.marks=98;

        Students s2 = new Students();
        s1.rolno =2;
        s1.name="joshi";
        s1.marks=99;

        Students students[] = new Students[2];
        students[0]=s1;
        students[1]=s2;

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name);
        }
    }
}
