public class Main {
     public static void main(String[] args){
         int[] arr = generateRandomArray();
     }
        //task 1
        public static int[] generateRandomArray () {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int u = 0; u < arr.length; u++) {
                arr[u] = random.nextInt(100_000) + 100_000;
            }
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
            //task 2
            int maxMoney = 0;
            int minMoney = 201_000;
            for (int t = 0; t < arr.length; t++) {
                if (arr[t] > maxMoney) {
                    maxMoney = arr[t];
                }
            }
            for (int r = 0; r < arr.length; r++) {
                if (arr[r] < minMoney) {
                    minMoney = arr[r];
                }
            }
            System.out.println("Минимальная сумма трат за день составила " + minMoney + " рублей. Максимальная сумма трат" +
                    "за день составила " + maxMoney + " рублей");
            //task 3
            float sum2 = 0;
            int daysInMonth = 30;
            for (int e = 0; e < arr.length; e++) {
                sum2 = sum2 + arr[e];
            }
            double mediumMoney = sum2 / daysInMonth;
            System.out.println("Средняя сумма трат за месяц составила " + mediumMoney + " рублей");

            //task 4
            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int q = reverseFullName.length - 1; q >= 0; q--) {
                System.out.print(reverseFullName[q]);
            }
            return arr;
        }
}