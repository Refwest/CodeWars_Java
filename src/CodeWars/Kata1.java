package CodeWars;

public class Kata1 {
    //Suma wartości tablicy
    public static void main(String[] args) {
        double[] array = {1.1, 2, 3};
        System.out.println(SumArray(array));

    }
    public static double SumArray(double[] array)
    {
        double sum = 0;
        if ( array.length == 0){
            return 0;
        }
        else{
            for(int i = 0; i < array.length; i++){
                sum += array[i];
            }
            return sum;
        }
    }
}
