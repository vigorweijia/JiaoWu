package MyPkg;

import java.util.Scanner;

public class Entrance {
    public static void main(String agrs[]) {

        GetJiaowu.init();

        Scanner scanner = new Scanner(System.in);
        //输入账号
        String username = scanner.nextLine();
        //输入密码
        String password = scanner.nextLine();
        //输入验证码
        String captcha = scanner.nextLine();

        int code = GetJiaowu.login_get(username, password, captcha);

        int length = CourseSoup.length();
        System.out.println("length: " + length);
        for(int j = 0; j < length; j++) {
            System.out.println(CourseSoup.CourseList.get(j));
        }
    }
}
