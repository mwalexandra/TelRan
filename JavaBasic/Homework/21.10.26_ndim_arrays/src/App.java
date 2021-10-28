public class App {
    public static void main(String[] args) {
        
        int[][] dim2Array = new int[][]
        {
            {1, 7, 5},
            {-13, 19},
            {2, 5, 18, 13}
        };

        System.out.println(dim2Array.length); // 3
        System.out.println(dim2Array[2].length); // second array length

        int[] secondSubarray = dim2Array[2]; // {2, 5, 18, 13}
        System.out.println(secondSubarray.length);

        int numOfArray = dim2Array[2][3]; // 13

        // неявный способ задать массив

        int[][] dim2OtherArray  = new int[10][];      //   ссылки на субмассивы = null
        int[][] dim2YetOtherArray  = new int[10][4]; //    каждый подмассив {0, 0, 0, 0}
        dim2OtherArray[0] = new int[]{3, 6, 1};
        dim2OtherArray[1] = secondSubarray;

        int [][][] dim3Array = new int [][][]
            {
                {
                    {1, 7, 5},
                    {-13, 19},
                    {2, 5, 18, 13}
                },
                {
                    {1, 7, 5, 54},
                    {-11, 0},
                }
            };
        System.out.println(dim3Array.length); // 2
        System.out.println(dim3Array[0][2][3]); // 13

        int [][][] dim3OtherArray = new int [3][][]; //первый размер указывать обязательно!!! 

        // Максимальная размерность - 255

        // Fill an 10x10 array with numbers from 0 to 99
            int[][] array10x10 = new int[10][10];

            for (int i = 0; i < array10x10.length; i++) {
                for (int j = 0; j < array10x10[i].length; j++) {
                    array10x10[i][j] = i * 10 + j;
                }
            }
            System.out.println();
    }
}
