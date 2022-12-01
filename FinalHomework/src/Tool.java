public class Tool {
    //学号规则同scs
    public static boolean CheckschoolID(String id){
        boolean ret = false;
        if(id.length()==5) {
            if(id.matches("\\d+")) {
                int n = Integer.parseInt(id);
                if(n>0) ret = true;
            }
        }
        else if(id.length()==8) {
            if(id.matches("\\d+")) {
                int n = Integer.parseInt(id);
                int y = n/1000000;
                int xy = (n/10000)%100;
                int db = (n/1000)%10;
                int xh = n%1000;
                if(y>=17 && y<=22 && xy>=1 && xy<=43 && db>=1 && db<=6 && xh>=1)
                    ret = true;
            }
        }
        else if(id.length()==9) {
            if(id.matches("SY\\d+")||id.matches("ZY\\d+")) {
                id = id.replace('S', '0');
                id = id.replace('Z', '0');
                id = id.replace('Y', '0');
                int n = Integer.parseInt(id);
                int y = n/100000;
                int xy = (n/1000)%100;
                int db = (n/100)%10;
                int xh = n%100;
                if(y>=19 && y<=22 && xy>=1 && xy<=43 && db>=1 && db<=6 && xh>=1)
                    ret = true;
            }
            if(id.matches("BY\\d+")) {
                id = id.replace('B', '0');
                id = id.replace('Y', '0');
                int n = Integer.parseInt(id);
                int y = n/100000;
                int xy = (n/1000)%100;
                int db = (n/100)%10;
                int xh = n%100;
                if(y>=17 && y<=22 && xy>=1 && xy<=43 && db>=1 && db<=6 && xh>=1)
                    ret = true;
            }
        }
            return ret;
    }
    //密码规则同scs
    public static boolean CheckPassword(String str){
        boolean res = false;
        if(str.matches("[a-zA-Z]{1}\\w+")&&str.length()>=8&&str.length()<=16)
            res = true;
        if(!res)
            System.out.println("password illegal");
        return res;
    }
    //邮箱规则
    public static boolean CheckEmail(String email){
        return email.matches("\\w+@\\w+(\\.\\w+)+");
    }
    //电话号规则：11位数字
    public static boolean CheckPhone(String phone){
        return phone.matches("\\d{11}");
    }
    //输入字符串str,开始下标l,结束下标r，讲该段字符转换成数字
    public static int getNumber(String str,int l,int r) {
        int ret = 0;
        for(int i = l;i<=r;i++) {
            ret *= 10;
            ret += str.charAt(i) - '0';
        }
        return ret;
    }
    //日期格式 xxxxxxxx 如20221130
    public static boolean checkDate(String str) {
        if(!str.matches("\\d{8}"))
            return false;
        int y = getNumber(str,0,3);
        int m = getNumber(str,4,5);
        int d = getNumber(str,6,7);
        int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(y<1900||m>12) return false;
        if((y%100!=0 && y%4 == 0)||(y%100==0 && y%400 == 0))
            days[2] = 29;
        if(m>=1&&m<=12&&d>=1&&d<=days[m])
            return true;
        else
            return false;
    }

}
