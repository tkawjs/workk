package workkk;

public class Logout {
    private UserManager userManager;

    public Logout(UserManager userManager) {
        this.userManager = userManager;
    }

    public void logoutUser() {
        userManager.logout();
        System.out.println("로그아웃되었습니다.");
    }
}