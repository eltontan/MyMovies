package sg.edu.rp.c346.id18016094.mymovies;

public class test {

    private String name;
    private String phoneNum;
    private String email;
    private int contactBy;

    public test(String name, String phoneNum, String email, int contactBy) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.contactBy = contactBy;
    }

    public int getContactBy() {
        return contactBy;
    }
}
