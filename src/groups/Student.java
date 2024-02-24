package groups;

public class Student {
    private String name;
    private String initials;
    private int group;
    private int marks[];
    private int nMark;

    public Student(String name, String initials, int group) {
        this.name = name;
        this.initials = initials;
        this.group = group;
        this.marks = new int[5];
        this.nMark = 0;
    }
    public boolean addGrade(int grade){
        if (this.nMark >= this.marks.length){
            return false;
        }
this.marks[this.nMark] = grade;
this.nMark++;
        return true;
    }
    public boolean isGood(){
        for (int i = 0; i < this.marks.length; i++) {
            if (this.marks[i] < 7 && this.marks[i] >= 1){
                return false;
            }
        }
        return true;
    }
    public void print(){
        System.out.printf("%-16s %-8s", this.name, this.initials);
        System.out.printf("Группа: %-4d Оценки: ", this.group);
        for (int i = 0; i < this.marks.length; i++) {
            System.out.print(this.marks[i] + " ");
        }        System.out.println();
    }
}
