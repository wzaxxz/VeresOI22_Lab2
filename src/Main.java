import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Patient> generatePatients() {
        List<Patient> patients = new ArrayList<>();

        patients.add(new Patient(0, "Олексій", "Верес", "В'ячеславович", "вул. Генерала Юнаківа 9в, Львів", 67283, 812, "Алергія" ));
        patients.add(new Patient(1, "Олена", "Коваль", "Іванівна", "вул. Богдана Хмельницького 12, Київ", 29401, 237, "Грип"));
        patients.add(new Patient(2, "Іван", "Петренко", "Олександрович", "пр. Перемоги 23, Харків", 89140, 948, "Бронхіт"));
        patients.add(new Patient(3, "Марія", "Лисенко", "Петрівна", "вул. Дружби Народів 17, Одеса", 94862, 502, "Цукровий діабет"));
        patients.add(new Patient(4, "Андрій", "Шевчук", "Миколайович", "вул. Володимира Великого 5, Дніпро", 19238, 296, "Алергія"));
        patients.add(new Patient(5, "Вікторія", "Іваненко", "Володимирівна", "пр. Свободи 19, Львів", 28233, 129, "Гастрит"));

        return patients;
    }

    // Метод виконання критерію А
    public static List<Patient> getPatientsByDiagnosis(List<Patient> patients, String diagnosis) {
        List<Patient> result = new ArrayList<>();
        for (Patient ln : patients) {
            if(ln.getDiagnose().equalsIgnoreCase(diagnosis)) {
                result.add(ln);
            }
        }
        return result;
    }

    // Метод виконання критерію Б
    public static List<Patient> getPatientsByRange(List<Patient> patients, int startRange, int endRange) {
        List<Patient> result = new ArrayList<>();
        for (Patient ln : patients) {
            if (ln.getMedCard() >= startRange && ln.getMedCard() <= endRange) {
                result.add(ln);
            }
        }
        return result;
    }

    // Метод виконання критерію В
    public static List<Patient> getPatientsByNumber(List<Patient> patients, String symbol) {
        List<Patient> result = new ArrayList<>();
        for (Patient ln : patients) {
            if (String.valueOf(ln.getNumber()).startsWith(symbol)) {
                result.add(ln);
            }
        }
        return result;
    }

    // К-сть пацієнтів
    public static int countPatients(List<Patient> patients, String symbol) {
        return getPatientsByNumber(patients, symbol).size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Patient> patients = generatePatients();

        System.out.println("Список пацієнтів:");
        for (Patient ln : patients) {
            System.out.println(ln);
        }

        List<Patient> sickPatients = getPatientsByDiagnosis(patients, "Алергія");
        System.out.println("\nПацієнти з діагнозом 'Алергія': ");
        for(Patient ln : sickPatients) {
            System.out.println(ln);
        }

        List<Patient> patientsInRange = getPatientsByRange(patients, 200, 550);
        System.out.println("\nПацієнти з номером карти в інтервалі '200-550': ");
        for(Patient ln : patientsInRange) {
            System.out.println(ln);
        }

        List<Patient> patientsBySymbol = getPatientsByNumber(patients, "2");
        System.out.println("\nПацієнти з номером телефону, що починається на '2': ");
        for(Patient ln : patientsBySymbol) {
            System.out.println(ln);
        }

        int countPatients = countPatients(patients, "2");
        System.out.println("\nКількість пацієнтів номер телефону, яких починається з '2': " + countPatients);
    }
}