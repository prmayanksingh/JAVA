package Reursion;

public class GeometricSum {

    public static double findGeometricSum(int k){
        if (k == 0) return 1;
        return (findGeometricSum(k-1) + (1/Math.pow(2, k)));
    }
    public static void main(String[] args) {
        int k = 4;
        System.out.println(findGeometricSum(k));
    }
}
