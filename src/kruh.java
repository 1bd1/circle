public class kruh {


    public static void main(String[] args)

    {

// pouzite jednotky - cm

double polomer = 100;

     double obvodKruhu = vypocetObvoduKruhu(polomer);
     double obsahKruhu = vypocetObsahuKruhu(polomer);


        System.out.print("obvod kruhu s polomerom (cm): ");
        System.out.println(polomer);
        System.out.print("je (cm, zaokruhlene): ");
        System.out.println(Math.round(obvodKruhu));


        System.out.print("obsah kruhu s polomerom (cm): ");
        System.out.println(polomer);
        System.out.print("je (cm2, zaokruhlene): ");
        System.out.println(Math.round(obsahKruhu));
    }

    public static double vypocetObvoduKruhu(double polomer)
    {
        return ((polomer*2)*Math.PI);
    }


    public static double vypocetObsahuKruhu(double polomer) {

        return (Math.pow(polomer,2))*Math.PI;
    }




}

