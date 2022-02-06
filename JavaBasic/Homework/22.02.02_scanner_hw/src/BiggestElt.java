import java.util.Scanner;
// Задача №68
// Количество элементов больших обоих соседей

class BiggestElt {

    private Scanner sc;

    public BiggestElt() {
        sc = new Scanner(System.in);
    }

    public void printABiggestNum() {
        System.out.println("Print a num of elt more than 2: ");
        int numOfElt = sc.nextInt();

        int[] nums = new int[numOfElt];

        System.out.println("Print a " + numOfElt + " numbers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        int res = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1])
                res++;
        }
        System.out.println("The count of biggest numbers is " + res);
    }
}
