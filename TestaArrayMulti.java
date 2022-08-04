public class TestaArrayMulti {
    public static void main(String[] args){
        //Para declarar um Array com múltiplas dimensões:

        int [] [] dois;
        int [] [] [] tres;
        int [] [] quatro [] [] ;

        dois = new int[10][5];
        tres = new int[10][][];
        quatro = new int[5][5][5][5];

        int [][] teste = new int [][]{{1,2,3},{1,2,3},{1,2,3}};

        int estranho [][] = new int[2][];
        estranho [0] = new int[20];
        estranho [1] = new int[10];

        for(int i = 0 ; i < estranho.length ; i++){
            System.out.println(estranho[i].length);
        }
    }
}
