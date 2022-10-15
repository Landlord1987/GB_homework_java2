public class Main {
    public static void main(String[] args) {

        // task 1
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Task1: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
            System.out.print(arr[i] + " ");
        }

        //task 2
        int[] arr2 = new int[8];
        arr2[0] = 0;
        System.out.print("\n" + "Task2: ");
        System.out.print(arr2[0] + " ");
        for (int i = 1; i < arr2.length; i++) {
            arr2[i] = arr2[i - 1] + 3;
            System.out.print(arr2[i] + " ");
        }
        //Task3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("\n" + "Task3: ");
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
            System.out.print(arr3[i] + " ");
        }
        // Task4
        byte f = 1;
        int[][] table = new int[4][4];
        System.out.println("\n" + "Task4: ");
        for (int g = 0; g < table.length; g++) {
            for (int h = 0; h < table.length; h++) {
                if (g == h) {
                    table[g][h] = f;
                } else table[g][h] = 0;
                System.out.print(table[g][h] + " ");
            }
            System.out.println();
        }
        // Task5
        int[] arr4 = {1, 5, 3, 18, 11, 4, 6, 7, 12, 8, 9, 10};
        int min = arr4[0], max = arr4[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr4[i] < min) {
                min = arr4[i];
            } else if (arr4[i] > max) {
                max = arr4[i];
            }
        }
        System.out.println("\n" + "Task5:" + "\n" + "min=" + min);
        System.out.println("max=" + max);
        // Task6
        int[] arr6 = {1, 1, 2, 2, 1};
        checkBalance(arr3);

        // Task7 I solve the task before 16.10.2022 г.
    }

    // Task6
    public static void checkBalance(int[] arr5) {
        int sum1 = 0, sum2 = 0, counter1 = 0, q = 0;
        for (int i = 0; i < arr5.length; i++) {
            sum1 += arr5[i];
            sum2 = 0;
            counter1++;
            for (int j = i + 1; j < arr5.length; j++) {
                sum2 += arr5[j];
            }
            if (sum1 == sum2) {
                System.out.println("\n" + "Task6: " + "sum1 " + sum1 + " =" + " sum2 " + sum2);
                System.out.print("[");
                for (q = 0; q < arr5.length; q++) {
                    if (q < counter1) {
                        System.out.print(arr5[q] + ", ");
                    }
                }
                System.out.print("||");
                for (q = 0; q < arr5.length; q++) {
                    if (q >= counter1) System.out.print(arr5[q] + ", ");
                }
                System.out.println("]");
                return;
            }

        }
        System.out.println("\n" + "Баланса нет");
    }
}