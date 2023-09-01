import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    Map<String, Medication> medications = new HashMap<>();

    public void addMedication(String name, double price, boolean availability) {
        medications.put(name, new Medication(name, price, availability));
    }

    public void printMedicationInfo(String name) {
        System.out.println(medications.get(name));
    }

    public void medicationSoldOut(String name) {
        medications.get(name).setAvailability(false);
    }

    public void medicationBackInStock(String name) {
        medications.get(name).setAvailability(true);
    }

    public int getCount() {
        return medications.size();
    }

    public void save(Medication medication) {
        medications.put(medication.getName(), medication);
    }

    public Medication find(String medicationName) {
        return medications.get(medicationName);
    }

    public void delete(String medicationName) {
        medications.remove(medicationName);
    }

    public void listMedications() {
        System.out.println(medications);
    }
}
