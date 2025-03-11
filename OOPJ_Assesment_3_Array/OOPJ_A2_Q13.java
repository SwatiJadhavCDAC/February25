import java.util.Scanner;

class OOPJ_A2_Q13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] physics = new int[20];
        int[] chemistry = new int[20];
        int[] maths = new int[20];

        int above75 = 0, below40 = 0;

        for (int i = 0; i < 20; i++) {
            physics[i] = scanner.nextInt();
            chemistry[i] = scanner.nextInt();
            maths[i] = scanner.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            int totalMarks = physics[i] + chemistry[i] + maths[i];
            double aggregate = (totalMarks / 300.0) * 100;

            if (aggregate >= 75) {
                above75++;
            }

            if (aggregate <= 40) {
                below40++;
            }
        }

        System.out.println("Number of students securing 75% and above: " + above75);
        System.out.println("Number of students securing 40% and below: " + below40);

        scanner.close();
    }
}