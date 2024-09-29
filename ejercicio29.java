public class ejercicio29 {
    public static void main(String[] args) {
        int [][] matriz1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int [][] matriz2 = {
            {9,8,7},
            {6,5,4},
            {3,2,1}
        };

        int [][] suma = new int[3][3];

        for(int i = 0; i < matriz1.length; i++){
            for (int j = 0; j < matriz1[i].length; j++){      
                suma [i][j] = matriz1[i][j] + matriz2[i][j];    
            }
        }

        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {
                System.out.println(suma[i][j] + " ");
            }
            System.out.println();
        }
    }
}
