package adapter;

public class LoginQQAdapter extends LoginService{
    //新增一个方法
    void qqLogin(String loginKey){
        //1、注册QQ账户
        //2、根据账户调用已经存在的登录
        login("","");
    }
}
