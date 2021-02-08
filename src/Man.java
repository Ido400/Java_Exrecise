
import java.util.ArrayList;
public class Man extends Human {
    private ArrayList<Boolean> MedicalCondition = new ArrayList<Boolean>();
    private boolean bald;
    private boolean heartAttack;
    
    public Man(){
        MedicalCondition.add(bald);
        MedicalCondition.add(heartAttack);
    }

    public boolean CheckManAtRisk(){
        //this function will return if the man is at risk
        int man_age = GetAge();
        int count_diseases = GetTheCountOfDisease();

        if(man_age >= 70 || man_age >= 50 && count_diseases >= 2){
            return true;
        }
        if(man_age >= 20 && count_diseases >= 4 || count_diseases >= 6 || this.MedicalCondition.get(7) == true){
            return true;
        }

        return false;
    }
}
