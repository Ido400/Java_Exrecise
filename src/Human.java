import java.util.ArrayList;



public class Human{
    private String FirstName;
    private String LastName;
    private int age;
    private int medicalID;

    private ArrayList<Boolean> MedicalCondition = new ArrayList<Boolean>();
    
    private boolean asthma;
    private boolean diabetes;
    private boolean hepatitis;
    private boolean neurological;
    private boolean canccer;
    private boolean rabies;
    private boolean hospitalize;

    
    public void SetFirstName(String FirstName){
        this.FirstName = FirstName;
    }

    public void SetLastName(String LastName){
        this.LastName = LastName;
    }

    public void SetAge(int age){
        this.age = age;
    }
    public void SetMedicalId(int medicalID){
        this.medicalID = medicalID;
    }

    public String GetFirstName(){
        return this.FirstName;
    }

    public String GetLastName(){
        return this.LastName;
    }

    public int GetAge(){
        return this.age;
    }
    public int GetMedicalID(){
        return this.medicalID;
    }
    public ArrayList<Boolean> GetMedicalCondition(){
        return this.MedicalCondition;
    }

    
    public void SetMedicalCondition(ArrayList<Boolean> MedicalCondition){
        this.MedicalCondition.add(this.asthma);
        this.MedicalCondition.add(this.diabetes);
        this.MedicalCondition.add(this.hepatitis);
        this.MedicalCondition.add(this.neurological);
        this.MedicalCondition.add(this.canccer);
        this.MedicalCondition.add(this.rabies);
        this.MedicalCondition.add(this.hospitalize);
        this.MedicalCondition = MedicalCondition;
    }
    
    

    public int GetTheCountOfDisease(){
        //this function will return the number of diseases that the women have  
        int count_diseases = 0;
          
        for (boolean disease : this.MedicalCondition) {
            if(disease == true){
                  count_diseases++;
              }
        }
    
        return count_diseases;
    }

    public void PrintHuman(){
        //this function will print the person
        System.out.println("First Name:" + " " + this.FirstName + ", " + "Last Name:" + " " + this.LastName);
        System.out.println("Age:" + " " + this.age + ", " + "medicalID" + this.medicalID);
    }

}