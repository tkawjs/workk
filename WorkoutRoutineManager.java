package workkk;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkoutRoutineManager {
    private UserManager userManager;

    public WorkoutRoutineManager(UserManager userManager) {
        this.userManager = userManager;
    }

    public void setWorkoutRoutine(Scanner scanner) {
        User currentUser = userManager.getCurrentUser();
        if (currentUser == null) {
            System.out.println("로그인 후 이용해 주세요.");
            return;
        }

        System.out.println("운동 루틴을 입력하세요 (종료하려면 빈 줄을 입력하세요): ");
        ArrayList<String> routine = new ArrayList<>();
        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            routine.add(line);
        }
        currentUser.workoutRoutine = routine;
        System.out.println("운동 루틴이 설정되었습니다.");
    }

    public void modifyWorkoutRoutine(Scanner scanner) {
        User currentUser = userManager.getCurrentUser();
        if (currentUser == null) {
            System.out.println("로그인 후 이용해 주세요.");
            return;
        }

        System.out.println("현재 운동 루틴:");
        for (int i = 0; i < currentUser.workoutRoutine.size(); i++) {
            System.out.println((i + 1) + ". " + currentUser.workoutRoutine.get(i));
        }
        System.out.println("수정할 항목 번호를 입력하세요 (취소하려면 0을 입력하세요): ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // 개행 문자 소비
        if (index == -1) {
            System.out.println("수정을 취소합니다.");
            return;
        }
        if (index < 0 || index >= currentUser.workoutRoutine.size()) {
            System.out.println("잘못된 번호입니다. 다시 시도하세요.");
            return;
        }
        System.out.print("새로운 내용을 입력하세요: ");
        String newRoutine = scanner.nextLine();
        currentUser.workoutRoutine.set(index, newRoutine);
        System.out.println("운동 루틴이 수정되었습니다.");
    }

    public void viewWorkoutRoutine() {
        User currentUser = userManager.getCurrentUser();
        if (currentUser == null) {
            System.out.println("로그인 후 이용해 주세요.");
            return;
        }

        System.out.println("현재 운동 루틴:");
        for (int i = 0; i < currentUser.workoutRoutine.size(); i++) {
            System.out.println((i + 1) + ". " + currentUser.workoutRoutine.get(i));
        }
    }
}