package workkk;

import java.util.Scanner;

public class Login {
    private UserManager userManager;

    public Login(UserManager userManager) {
        this.userManager = userManager;
    }

    public void loginUser(Scanner scanner) {
        System.out.print("사용자 이름을 입력하세요: ");
        String username = scanner.nextLine();
        System.out.print("비밀번호를 입력하세요: ");
        String password = scanner.nextLine();

        User user = userManager.getUser(username);
        if (user != null && user.password.equals(password)) {
            userManager.setCurrentUser(user);
            System.out.println("로그인되었습니다.");
        } else {
            System.out.println("사용자 이름 또는 비밀번호가 잘못되었습니다. 다시 시도하세요.");
        }
    }
}