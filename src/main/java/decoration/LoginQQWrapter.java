package decoration;

public class LoginQQWrapter implements LoginServiceWraper {
    private LoginService loginService;

    public LoginQQWrapter(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public void login(String account, String pwd) {
        loginService.login(account,pwd);
    }
    //扩展的方法
    @Override
    public void loginForQQ() {

    }
}
