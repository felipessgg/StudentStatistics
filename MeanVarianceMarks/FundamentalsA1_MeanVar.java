/**
 * Calculating and printing mean and variance.
 *
 * @author Felipe Sepulveda
 * @version 1
 */
import java.util.Scanner;

public class FundamentalsA1_MeanVar
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N;
        double min = 31;
        double max = 0;
        
        double sum = 0;
        double sum2 = 0;
        double mean = 0;
        double var = 0;
        
        System.out.print("Enter number of marks: ");
        N = scanner.nextInt();
        double[] student_marks = new double[N];
        
        for (int i = 0; i < N; i++){
            System.out.print("Insert mark number " + (i+1) + ":");
            student_marks[i] = scanner.nextDouble();
            
            if (student_marks[i] < min){ // New min
                min = student_marks[i];
            }else if (student_marks[i] > max){
                max = student_marks[i];
            }
            
            sum += student_marks[i];
        }
        
        mean = sum/N;
        
        sum2 = 0;
        for (int i = 0; i < N; i++){
            sum2 += (student_marks[i] - mean)*(student_marks[i] - mean);
        }
        
        var = sum2/N;
        
        System.out.println("Mean: " + mean);
        System.out.println("Variance: " + var);
    }
}