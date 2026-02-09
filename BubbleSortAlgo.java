public class BubbleSortAlgo {
    public  void BubbleSort(int x[]){
    
        
        for(int turn = 0 ; turn < x.length-1 ; turn++){
            for(int j = 0 ; j <  x.length-1-turn ; j++){
                if(x[j]  > x[j+1]){
                    int temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }
        }
    }


    public void printArray(int x[]){
        for(int i = 0 ; i < x.length ; i++){
            System.out.println(x[i]);
        }
    }

    public static void main(String[] args) {
        int arr []= { 5 ,4 , 1 , 3, 2};
        BubbleSortAlgo b = new BubbleSortAlgo();
        b.BubbleSort(arr);
        b.printArray(arr);
    }
}
