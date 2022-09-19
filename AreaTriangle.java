public class AreaTriangle {
    public static double countAreaTriangle(double sideA, double sideB, double sideC) throws Exception {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new Exception("side lenght <= 0");
        }
        if (sideA + sideB < sideC || sideB + sideC < sideA || sideA + sideC < sideB) {
            throw new Exception("it's not a triangle");
        }
        double halfPerim = (sideA + sideB + sideC) / 2;
        return Math.sqrt(halfPerim * (halfPerim - sideA) * (halfPerim - sideB) * (halfPerim - sideC));

    }
}
