public class User {
    public User(){
    }
    public User(String name,String schoolId,String password){
        this.name = name;
        this.schoolId = schoolId;
        this.password = password;
    }
    public User(String name,String schoolId,String password,String ID,String phone,String email,String instructor){
        this.name = name;
        this.schoolId = schoolId;
        this.password = password;
        this.ID = ID;
        this.phone = phone;
        this.email = email;
        this.instructor = instructor;
    }
    //注册信息
    private String name;
    private String schoolId;
    private String password;
    //其他个人信息
    private String ID;
    private String phone;
    private String email;
    private String instructor;

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}
