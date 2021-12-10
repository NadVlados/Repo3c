
public class N322 {
    public static void main(String[] args) {
        double a = 1;
        double b = 1;
        double c = 1;
        double p = (a + b + c) / 2;

        double ma = Math.sqrt( (Math.pow(b,2) + Math.pow(c, 2)) / 2 - Math.pow(a, 2) / 4);
        double mb = Math.sqrt( (Math.pow(a,2) + Math.pow(c, 2)) / 2 - Math.pow(b, 2) / 4);
        double mc = Math.sqrt( (Math.pow(b,2) + Math.pow(a, 2)) / 2 - Math.pow(c, 2) / 4);
        System.out.println("Медіани: ");
        System.out.println(ma);
        System.out.println(mb);
        System.out.println(mc);
        System.out.println(" ");

        double ha =( 2 * Math.sqrt(p * (p - a) * (p - b) * (p - c))) / a;
        double hb =( 2 * Math.sqrt(p * (p - a) * (p - b) * (p - c))) / b;
        double hc =( 2 * Math.sqrt(p * (p - a) * (p - b) * (p - c))) / c;

        System.out.println("Висоти: ");
        System.out.println(ha);
        System.out.println(hb);
        System.out.println(hc);
        System.out.println(" ");

        //  AO + OC = b
        //  AO / c = OC / a        <-- AO з системи
        double AO = (b * c) / (c +a);
        double OC = b - AO;
        double lb = Math.sqrt(c * a - AO * OC);
        //System.out.println(AO);
        //System.out.println(OC);

        double CO = (a * b) / (b + c);
        double OB = a - CO;
        double la = Math.sqrt(b * c - CO * OB);
        //System.out.println(CO);
        //System.out.println(OB);

        double BO = (c * a)/ (a + b);
        double OA = c - BO;
        double lc = Math.sqrt(a * b - BO * OA);
        //System.out.println(BO);
        //System.out.println(OA);

        System.out.println("Бісектриси: ");
        System.out.println(la);
        System.out.println(lb);
        System.out.println(lc);


    }
}
