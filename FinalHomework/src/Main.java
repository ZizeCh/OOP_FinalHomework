public class Main {

    public static void main(String[] args) {
        User a = new User("xiaoA","21371274","123456");
        Organization zhuzhi1 = new Organization();
        zhuzhi1.member.add(a);
        System.out.println(zhuzhi1.member.get(0).getSchoolId());
    }
}