class HW7_2_3{
    public static void getDiagnos_pat(Patient[] pat, String diagnozz) {
        for(Patient pa: pat) {
            if(pa.getDiagnoz()==diagnozz) {
                System.out.println(pa.PIB);
            }
        }
    }
    public static void getMedical_card(Patient[] pat, int from, int to) {
        for(Patient pa: pat) {
            if(pa.getMedical()>=from && pa.getMedical()<=to) {
                System.out.println(pa.PIB);
            }
        }
    }
    public static void main(String[] args) {
        Patient mass []= new Patient [1];
        Patient mas= new Patient ();
        mas.id=1;
        mas.PIB="Ivanov";
        mas.adress="Volodumurska97";
        mas.phone=456;
        mas.medical_card=6;
        mas.diagnoz="fghj";
        mass[0]=mas;
        getMedical_card(mass, 5,7);
        getDiagnos_pat(mass, "fjjghj");

    }

}

