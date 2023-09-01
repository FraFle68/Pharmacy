public class Main {
    public static void main(String[] args) {
        Pharmacy apothekeUmDieEcke = new Pharmacy();

        apothekeUmDieEcke.addMedication("Aspirin", 12.95, true);
        apothekeUmDieEcke.addMedication("Ebrantil", 23.95, false);
        apothekeUmDieEcke.addMedication("Wick Medi Neit", 6.99, true);
        apothekeUmDieEcke.addMedication("Überteuerte Gummibärchen", 7.95, true);
        apothekeUmDieEcke.addMedication("Apotheken Umschau", 0, true);

        apothekeUmDieEcke.printMedicationInfo("Aspirin");
        System.out.println();
        apothekeUmDieEcke.listMedications();
        apothekeUmDieEcke.medicationSoldOut("Aspirin");
        apothekeUmDieEcke.listMedications();
        System.out.println(apothekeUmDieEcke.getCount());
        apothekeUmDieEcke.save(new Medication("Spalt N", 11.99, true));
        apothekeUmDieEcke.listMedications();
        System.out.println(apothekeUmDieEcke.find("Spalt N"));
        apothekeUmDieEcke.delete("Überteuerte Gummibärchen");
        apothekeUmDieEcke.listMedications();
    }
}
