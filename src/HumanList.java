import java.util.ArrayList;

public class HumanList{
private ArrayList<Man> manList = new ArrayList<Man>();
private ArrayList<Women> womenList = new ArrayList<Women>();

public void AddHuman(Man man){
    //this function will add a man
    manList.add(man);     
}
public void AddHuman(Women women){
    //this function will add a women
    womenList.add(women);
}

public void GetManList(){
    //this function will return the man list 
    ArrayList<Human> humanList = new ArrayList<Human>();
    for (Man man : this.manList) {
        humanList.add(man);
    }
    PrintHumans(humanList);    
}

public void GetWomenList(){
    //this function will return the womens list
    ArrayList<Human> humanList = new ArrayList<Human>();
    for(Women women : this.womenList){
        humanList.add(women);
    }
    PrintHumans(humanList);
}

public void PrintHumanList(){
    //this function will print the list of all humans
    ArrayList<Human> humanList = new ArrayList<Human>();
    for (Man man : this.manList) {
        humanList.add(man);
    }

    for (Women women : this.womenList) {
        humanList.add(women);
    }

    PrintHumans(humanList);
}

public void GetHumansAtRisk(String gender){
    //this function will get the gender and it wil print the mans or womens that are in risk
    ArrayList<Human> humanList = new ArrayList<Human>();
    
    if(gender.equals("M")){
        SetListManAtRisk(humanList);
        PrintHumans(humanList);
    }
    else if(gender.equals("F")){
        SetListWomenAtRisk(humanList);
        PrintHumans(humanList);
    }
    else{
        PrintHumans(humanList);
    }
}

private void SetListManAtRisk(ArrayList<Human> humanList){
    //this function will set all mans that are in risk in the human list
    for (Man man : this.manList) {
        if(man.CheckManAtRisk()){
            humanList.add(man);
        }
    }
}

private void SetListWomenAtRisk(ArrayList<Human> humanList){
    //this function will set all womens that are in risk in the human list
    for (Women women : this.womenList) {
        if(women.CheckWomenAtRisk()){
            humanList.add(women);
        }
    }
}

public void PrintUnder18(){
    //this function will this print all the humans that are underthe age 18
    ArrayList<Human> humanList = new ArrayList<Human>();
    for (Man man : this.manList) {
        if(man.GetAge() <= 18){
            humanList.add(man);
        }
    }
    for (Women women : this.womenList) {
        if(women.GetAge() <= 18){
            humanList.add(women);
        }
    }
    PrintHumans(humanList);
}

public void PrintHumans(ArrayList<Human> humanList){
    //this function will print a human list
    for (Human human : humanList) {
        human.PrintHuman();
    }
}

public void GetHuman(int medicalID){
    //this function will return a spesific person
    int count = 0;
    int man_lst_len =  this.manList.size();
    int women_lst_len = this.womenList.size();
    Human human  = new Human();

    while(women_lst_len > count || man_lst_len > count){
        if(women_lst_len > count){
           if(this.womenList.get(count).GetMedicalID() == medicalID){
               human = this.womenList.get(count); 
               human.PrintHuman();
           }
        }
        if(man_lst_len > count){
            if(this.manList.get(count).GetMedicalID() == medicalID){
                human = this.manList.get(count);
                human.PrintHuman();
            }
        }
        count++;
    }
    System.out.println("Not Found!");;
}


}