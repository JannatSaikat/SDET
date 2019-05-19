package coreJava;

public class Students {
    int SID;
    String Sname;
    int Sub1;
    int Sub2;
    int Sub3;


    void getStuData(int SID, String Sname) {
       this.SID = SID;
       this.Sname = Sname;
    }

    void getStuMarks(int Sub1, int Sub2, int Sub3){

        this.Sub1 = Sub1;
        this.Sub2 = Sub2;
        this.Sub3 = Sub3;
    }

    void totalMarks() {
        int total = Sub1 + Sub2 + Sub3;
        System.out.println("Total mark for " + Sname+ ", ID: " + SID+ " is: " + total);
    }

}
