package workkk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Register register = new Register(userManager);
        Login login = new Login(userManager);
        Logout logout = new Logout(userManager);
        WorkoutRoutineManager workoutRoutineManager = new WorkoutRoutineManager(userManager);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (userManager.getCurrentUser() == null) {
                System.out.println("1. 회원가입");
                System.out.println("2. 로그인");
                System.out.println("3. 종료");
                System.out.print("선택하세요: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // 개행 문자 소비

                switch (choice) {
                    case 1:
                        register.registerUser(scanner);
                        break;
                    case 2:
                        login.loginUser(scanner);
                        break;
                    case 3:
                        System.out.println("앱을 종료합니다.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                }
            } else {
                System.out.println("1. 운동 루틴 설정");
                System.out.println("2. 운동 루틴 수정");
                System.out.println("3. 운동 루틴 보기");
                System.out.println("4. 로그아웃");
                System.out.print("선택하세요: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // 개행 문자 소비

                switch (choice) {
                    case 1:
                        workoutRoutineManager.setWorkoutRoutine(scanner);
                        break;
                    case 2:
                        workoutRoutineManager.modifyWorkoutRoutine(scanner);
                        break;
                    case 3:
                        workoutRoutineManager.viewWorkoutRoutine();
                        break;
                    case 4:
                        logout.logoutUser();
                        break;
                    default:
                        System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                }
            }
        }
    }
}