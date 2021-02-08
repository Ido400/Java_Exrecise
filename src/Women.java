import java.util.ArrayList;

public class Women extends Human {
  private ArrayList<Boolean> MedicalCondition = new ArrayList<Boolean>();
  private boolean pregment;
  private boolean breastCanccer;
  public Women(){
    MedicalCondition.add(pregment);
    MedicalCondition.add(breastCanccer);
  }

  public boolean CheckWomenAtRisk(){
      //this function will check if the women at risk
      int women_age = GetAge();
      int count_diseases = GetTheCountOfDisease();
      
      if(women_age >= 80 || women_age >= 60 && this.MedicalCondition.get(7) == true){
          return true;
      }
      if(women_age >= 50 && count_diseases >= 3 || women_age >= 30 && count_diseases >=5){
          return true;
      }
      if(count_diseases >= 7){
          return true;
      }

      return false;
  }


}
