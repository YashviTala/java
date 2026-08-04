class person {
    String fname, lname;

    person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }
}

class student extends person {
    int rollno;
    String stream; 
    int sem;

    student(String fname, String lname, int rollno, String stream, int sem) {
        super(fname, lname);
        this.rollno = rollno;
        this.stream = stream;
        this.sem = sem;
    }

    void display() {
       
        System.out.println("name: " + fname + " " + lname);
        System.out.println("rollno: " + rollno);
        System.out.println("division: " + stream + " sem: " + sem);
    }
}

class studdemo {
    public static void main(String args[]) {
        student s1 = new student("mina", "tilala", 90, "bca", 2);
        s1.display();
    }
}