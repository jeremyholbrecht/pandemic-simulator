package be.intecbrussel;

import be.intecbrussel.comparators.AgeSorter;
import be.intecbrussel.comparators.InsuranceSorter;
import be.intecbrussel.comparators.TemperatureSorter;

import java.util.*;


public class PatientApp {
    public static void main(String[] args) {

        // collection that returns unique data only and keeps insertion order
        LinkedHashSet<Patient> patients = new LinkedHashSet<>(Patient.getAllPatients());
        patients.forEach(System.out::println);


        System.out.println("------------------------------");

        // collection that gives priority based on temp, age, and insurance
        Set<Patient> patients1 = new TreeSet<>(new TemperatureSorter().thenComparing(new AgeSorter()).thenComparing(new InsuranceSorter()));
        patients1.addAll(Patient.getAllPatients());
        patients1.forEach(System.out::println);

        System.out.println("-------------------------------");

        Queue<Patient> patientQueue = new LinkedList<>();
        patients1.addAll(Patient.getAllPatients());
        patients1.forEach(System.out::println);





    }
}
