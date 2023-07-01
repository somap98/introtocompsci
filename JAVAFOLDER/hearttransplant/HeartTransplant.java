/**
 * 
 * HeartTransplant class
 * 
 * @author Ana Paula Centeno
 * @author Haolin (Daniel) Jin
 */
public class HeartTransplant {

    // patient array, each Patient is read from the data file
    private Patient[] patients;

    // SurvivabilityByAge array, each rate is read from data file
    private SurvivabilityByAge survivabilityByAge;

    // SurvivabilityByCause array, each rate is read from data file
    private SurvivabilityByCause survivabilityByCause;

    /*
     * Default constructor
     * Initializes patients to null.
     * Initializes survivabilityByAge to null.
     * Initializes survivabilityByCause to null. 
     */
    public HeartTransplant() {

        patients = null;
        survivabilityByAge = null;
        survivabilityByCause = null;
    }

    /*
     * Returns patients
     */
    public Patient[] getPatients() {

        return patients;
     } 

    /*
     * Returns survivabilityByAge
     */
    public SurvivabilityByAge getSurvivabilityByAge() {
       return survivabilityByAge;
    }

    /*
     * Returns survivabilityByCause
     */
    public SurvivabilityByCause getSurvivabilityByCause() {
       return survivabilityByCause;
    }

    /*
     * 1) Initialize the instance variable patients array with numberOfLines length.
     * 
     * 2) Reads from the command line data file, use StdIn.readInt() to read an integer.
     *    File Format: 
     *      ID, ethnicity, Gender, Age, Cause, Urgency, State of health
     * 
     *    Each line refers to one Patient, all values are integers.
     * 
     */
    public void readPatients (int numberOfLines) {
        patients = new Patient[numberOfLines];
        int id, ethnicity, gender, age, cause, urgency, stateOfHealth;

        for(int i = 0; i < numberOfLines; i++) {
            id = StdIn.readInt();
            ethnicity = StdIn.readInt();
            gender = StdIn.readInt();
            age = StdIn.readInt();
            cause = StdIn.readInt();
            urgency = StdIn.readInt();
            stateOfHealth = StdIn.readInt();

            patients[i] = new Patient(id, ethnicity, gender, age, cause, urgency, stateOfHealth);

        }

    }

    /*
     * 1) Initialize the instance variable survivabilityByAge with a new survivabilityByAge object.
     * 
     * 2) Reads from the command line file to populate the object. 
     *    Use StdIn.readInt() to read an integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Age YearsPostTransplant Rate
     *    Each line refers to one survivability rate by age.
     * 
     */
    public void readSurvivabilityByAge (int numberOfLines) {
        survivabilityByAge = new SurvivabilityByAge();
        int age, years;
        double rate;

        for(int i = 0; i < numberOfLines; i++) {
            age = StdIn.readInt();
            years = StdIn.readInt();
            rate = StdIn.readDouble();


            survivabilityByAge.addData(age, years, rate);

        }


    }

    /*
     * 1) Initialize the instance variable survivabilityByCause with a new survivabilityByCause object.
     * 
     * 2) Reads from the command line file to populate the object. Use StdIn.readInt() to read an 
     *    integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Cause YearsPostTransplant Rate
     *    Each line refers to one survivability rate by cause.
     * 
     */
    public void readSurvivabilityByCause (int numberOfLines) {
        survivabilityByCause = new SurvivabilityByCause();

        int cause, years;
        double rate;

        for(int i = 0; i < numberOfLines; i++) {
            cause = StdIn.readInt();
            years = StdIn.readInt();
            rate = StdIn.readDouble();

            survivabilityByCause.addData(cause, years, rate);
        }

    }
    
    /*
     * Returns a Patient array containing the patients, 
     * from the patients array, that have age above the parameter age.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with age above the parameter age.
     * 
     * Return null if there is no Patient with age above the 
     * parameter age.
     */ 
    public Patient[] getPatientsWithAgeAbove(int age) {
        
        int counter = 0;

        for(int i = 0; i < patients.length; i++) {
            if(patients[i] != null && patients[i].getAge() >= age) {
                counter++;
            }
        }

        if(counter == 0) {
            return null;
        }

        Patient[] patientsAboveAge = new Patient[counter];

        int counter1 = 0;

        for(int i = 0; i < patients.length; i++) {
            if(patients[i] != null && patients[i].getAge() >= age) {
                patientsAboveAge[counter1] = patients[i];
                counter1++;
            }
        }

  
        return patientsAboveAge;
    }

    /*
     * Returns a Patient array containing the patients, from the patients array, 
     * that have the heart condition cause equal to the parameter cause.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the heart condition cause equal to the parameter cause.
     * 
     * Return null if there is no Patient with the heart condition cause 
     * equal to the parameter cause.
     */ 
    public Patient[] getPatientsByHeartConditionCause(int cause) {



        int counter = 0;

        
        for(int i = 0; i < patients.length; i++) {
            if(patients[i].getCause() == cause) {
                counter++;
            }
        }


        if(counter == 0) {
            return null;
        }


        Patient[] patientsWithHeartCondition = new Patient[counter];

        int counter1 = 0;

        for(int i = 0; i < patients.length; i++) {
            if(patients[i].getCause() == cause) {
                patientsWithHeartCondition[counter1] = patients[i];
                counter1++;
            }
        }

        
        return patientsWithHeartCondition;
    }

    /*
     * Returns a Patient array containing patients, from the patients array,
     * that have the state of health equal to the parameter state.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the state of health equal to the parameter state.
     * 
     * Return null if there is no Patient with the state of health 
     * equal to the parameter state.
     */ 
    public Patient[] getPatientsByUrgency(int urgency) {

        int counter = 0;

        for(int i = 0; i < patients.length; i++) {
            if(patients[i].getUrgency() == urgency) {
                counter++;
            }
        }


        if(counter == 0) {
            return null;
        }

        Patient[] patientsUrgency = new Patient[counter];

        int counter1 = 0;

        for(int i = 0; i < patients.length; i++) {
            if(patients[i].getUrgency() == urgency) {
                patientsUrgency[counter1] = patients[i];
                counter1++;
            }
        }

        
        return patientsUrgency;
    }

    /*
     * Assume there is a heart available for transplantation surgery.
     * Also assume that the heart is of the same blood type as the
     * Patients on the patients array.
     * This method finds the Patient to be the recepient of this
     * heart.
     * 
     * The method returns a Patient from the patients array with
     * he highest potential for survivability after the transplant.
     * 
     * Assume the patient returned by this method will receive a heart,
     * therefore the Patient will no longer need a heart.
     * 
     * There is no correct solution, you may come up with any 
     * function to find the patient with the highest potential 
     * for survivability after the transplant.
     */ 
    public Patient getPatientForTransplant () {

	Patient[] ePatients = getPatientsByUrgency(9);
    
        if(ePatients != null) {
            int count = 0;
            for(int i = 0; i < ePatients.length; i++) {
                if(ePatients[i].getNeedHeart() == true) {
                    break;
                }
                count++;
            }
            ePatients[count].setNeedHeart(false);
            return ePatients[count];
        } else {
            ePatients = getPatientsByHeartConditionCause(4);
            if(ePatients!= null) {
                
            int count = 0;
            for(int i = 0; i < ePatients.length; i++) {
                if(ePatients[i].getNeedHeart() == true) {
                    break;
                }
                count++;
            }
            
                ePatients[count].setNeedHeart(false);
                return ePatients[count];
            }
        }

        
        int counter = 0;
        for(int i = 0; i < patients.length; i++) {
            if(patients[i].getNeedHeart() == true) {
                break;
            }
            counter++;
        }
        
        patients[counter].setNeedHeart(false);
	return patients[counter];
    }
}
