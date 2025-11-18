public class Cone {
    double height;
    double volume;
    double surfaceArea;
    double base;
    double radius;

    public static void main(String[] args) {
        Cone cone1 = new Cone();
        Cone cone2 = new Cone();
        cone1.base = 81.713;
        cone1.height = 10.3;
        cone1.volume = ((1.0 / 3) * Math.PI * cone1.base * cone1.base * cone1.height);

        cone2.base = 962.113;
        cone2.height = 10.3;
        cone2.volume = ((1.0 / 3) * Math.PI * cone2.base * cone2.base * cone2.height);

        System.out.println("cone1.volume = " + Math.round(cone1.volume * 1000) / 1000.0);
        System.out.println("cone2.volume = " + Math.round(cone2.volume * 1000) / 1000.0);
    }

}
