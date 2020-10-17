
public class ExtendsTest01 {
    public static  void main(String[] args ){
        Account act = new Account("ss",123);
        System.out.println("账号："+act.getAutno()+" 余额："+act.getBalance());
        Credit  at = new Credit(99);
       // at.setCredit(99);
        at.setAutno("fe");
        at.setBalance(324.23);
        System.out.println("账号："+at.getAutno()+" 余额："+at.getBalance()+"信用值："+at.getCredit());
    }
}
//银行账户类
//账户的属性，账号，余额
class Account {
    //属性
    private String autno;
    private double balance;

    //构造方法
    public Account(){

    }
    public Account(String autno , double balance){
        this.autno = autno;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAutno() {
        return autno;
    }

    public void setAutno(String autno) {
        this.autno = autno;
    }
}
class Credit extends Account{
    //属性
    private int  credit;
    //构造方法
    public Credit(){

    }
    public Credit(int credit){
        this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }


    public void setCredit(int credit) {
        this.credit = credit;
    }
}
class a extends Credit{

}
