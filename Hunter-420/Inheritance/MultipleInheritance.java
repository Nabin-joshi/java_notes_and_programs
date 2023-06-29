package Inheritance;

interface Student{
    public void s_name();
    public void s_faculty();
}

interface Teacher{
    public void t_name();
    public void t_department();
}


class College implements Student,Teacher{
    @Override
    public void s_name() {
        System.out.println("Student Name");
    }

    @Override
    public void s_faculty() {
        System.out.println("Student Faculty");
    }
    @Override
    public void t_name() {
        System.out.println("Teacher Name");
    }

    @Override
    public void t_department() {
        System.out.println("Teacher Department");
    }
}

class MultipleInheritance{
    public static void main(String[] args) {
        College obj = new College();
        obj.s_name();
        obj.s_faculty();
        obj.t_name();
        obj.t_department();
    }
}