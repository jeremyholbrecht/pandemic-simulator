package be.intecbrussel.comparators;

import be.intecbrussel.Patient;
import java.util.Comparator;


public class AgeSorter implements Comparator<Patient> {
    @Override
    public int compare(Patient o1, Patient o2) {
        return o1.getAge() - o2.getAge();
    }
}
