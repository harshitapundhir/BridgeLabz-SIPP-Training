public class EarthVolume {
    public static void main(String[] args) {
        double r = 6378, km3 = (4.0 / 3) * Math.PI * Math.pow(r, 3);
        double mile3 = km3 / Math.pow(1.6, 3);
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f\n", km3, mile3);
    }
}

