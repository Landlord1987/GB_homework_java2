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
        // 4-7 Выполню в срок до 16.10.2022 г.
    }
}