package workkk;

import java.util.Scanner;

public class Register {
    private UserManager userManager;

    public Register(UserManager userManager) {
        this.userManager = userManager;
    }

    public void registerUser(Scanner scanner) {
        System.out.print("사용자 이름을 입력하세요: ");
        String username = scanner.nextLine();
        System.out.print("비밀번호를 입력하세요: ");
        String password = scanner.nextLine();
        User user = new User(username, password);
        if (userManager.addUser(user)) {
            System.out.println("회원가입이 완료되었습니다.");
        } else {
            System.out.println("이미 존재하는 사용자 이름입니다. 다시 시도하세요.");
        }
    }
}