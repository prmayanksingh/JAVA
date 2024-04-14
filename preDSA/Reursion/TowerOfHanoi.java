package Reursion;

public class TowerOfHanoi {
    public static void towerOfHanoi(int disk, int source, int auxiliary, int distination){
        if (disk == 0){
            return;
        }else if (disk == 1){
            System.err.println(source + " " + distination);
        }

        towerOfHanoi(disk -1, source, distination, auxiliary);
        System.out.println(source + " " + distination);
        towerOfHanoi(disk-1, auxiliary, source, distination);
    }
}
