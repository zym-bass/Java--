/*编写程序模拟用户注册:
        1:程序开始执行时，提示用户输入"用户名"和\密码"信息。
        2、输入信息之后，后台java程序模拟用户注册.
        3、注册时用户名要求长度在[6-14]之间，小于或者大于都表示异常。
        注意:
        完成注册的方法放到-一个单独的类中。
        异常类自定义即可。
class UserService {
    public void register (string username , string password) {
    //这个方法中完成注册!
    }
}
编写main方法，在ma=in方法中接收用户输入的信息，在main方法
        中调用UserService的register方法完成注册。*/

import java.util.Scanner;
public class Practice01 {
    public static void main(String[] args){
        /*Scanner s = new Scanner(System.in);
        String username = s.next();
        String password = s.next();
*/
        UserService a = new UserService();
        try {
            a.register("32", "424");
        } catch (LoginException e) {
            System.out.println(e.getMessage());
        }
    }
}
class UserService {

    /**
     * 用户注册
     * @param username
     * @param password
     * @throws LoginException  当用户名小于6或者大于16时出错
     */
    public void register (String username , String password) throws LoginException {
        //这个方法中完成注册!
        if( username == null || username.length() > 16 ||  username.length() < 6){
            throw new LoginException("用户名长度不符合规范");
        }
        System.out.println("用户输入成功");
    }

}
class LoginException extends RuntimeException{
    public LoginException (){
        super();
    }
    public LoginException (String s ){
        super(s);
    }

}
