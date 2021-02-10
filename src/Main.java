import java.util.*;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner();
        HumanList humanList = new HumanList();
        while(true){
            System.out.println("Choose if you want to add a person [1] or print data [2]");
            String chosen = scanner.next();
         
            if(chosen == "1"){

            }
            else if(chosen == "2"){

            }

            else{
              System.out.println("You should write 1 for \"Add a Person\" or 2 for \"Print Data\"" )
            }

        }
    }

    public void AddHuman(Scanner scanner, HumanList humanList){
        System.out.println("Write your First Name:")
        String FirstName = scanner.next();

        System.out.println("Write your Last Name:");
        String LastName = scanner.next();

        System.out.println("Write your Age:");
        int age = scanner.next();

        System.out.println("Write your Gender M/F:");
        String Gender = scanner.next();

        if(Gender.toUpperCase() == "M"){
            ArrayList<boolean> MedicalCondition = new ArrayList<boolean>();
            MedicalCondition = Human(MedicalCondition, scanner);
            MedicalCondition = Man(MedicalCondition, scanner);
            
            Man man = new Man();
            man.SetFirstName(FirstName);
            man.SetLastName(LastName);
            man.SetAge(age);
            man.SetMedicalCondition(MedicalCondition);
            humanList.AddHuman(man);
        }
        
        else if(Gender.toUpperCase() == "F"){
            ArrayList<boolean> MedicalCondition = new ArrayList<boolean>();
            MedicalCondition = Human(MedicalCondition, scanner);
            MedicalCondition = Women(MedicalCondition, scanner);
            
            Women women = new Women();
            women.SetFirstName(FirstName);
            women.SetLastName(LastName);
            women.SetAge(age);
            women.SetMedicalCondition(MedicalCondition);
            humanList.AddHuman(women);
  
        }

        else{
            System.out.println("You should write F for women and M for man")
        }

    }
    
    public ArrayList<boolean> Human(ArrayList<boolean> MedicalCondition, Scanner scanner){
        System.out.println("Do you have Astma?");
        boolean bool = scanner.nextBoolean();
        MedicalCondition.add(bool);
        System.out.println("Do you have diabetes?");
        boolean bool = scanner.nextBoolean();
        MedicalCondition.add(bool);
        System.out.println("Do you have hepatitis?");
        boolean bool = scanner.nextBoolean();
        MedicalCondition.add(bool);
        System.out.println("Do you have neurological?");
        boolean bool = scanner.nextBoolean();
        MedicalCondition.add(bool);
        System.out.println("Do you have canccer?");
        boolean bool = scanner.nextBoolean();
        MedicalCondition.add(bool);
        System.out.println("Do you have rabies?");
        boolean bool = scanner.nextBoolean();
        MedicalCondition.add(bool);
        System.out.println("Do you have hospitalize?");
        boolean bool = scanner.nextBoolean();
        MedicalCondition.add(bool); 
        
        return MedicalCondition;
    }
    public ArrayList<boolean> Man(ArrayList<boolean> MedicalCondition, Scanner scanner){
        System.out.println("Do you have bald?");
        boolean bool = scanner.nextBoolean();
        MedicalCondition.add(bool);
        System.out.println("Do you have heartAttack?");
        boolean bool = scanner.nextBoolean();
        MedicalCondition.add(bool);
        
        return MedicalCondition;
    }

    public ArrayList<boolean> Women(ArrayList<boolean> MedicalCondition, Scanner scanner){
        System.out.println("Do you have pregment?");
        boolean bool = scanner.nextBoolean();
        MedicalCondition.add(bool);
        System.out.println("Do you have breastCanccer?");
        boolean bool = scanner.nextBoolean();
        MedicalCondition.add(bool);

        return MedicalCondition;
    }
    

    public void PrintData(Scanner scanner, HumanList humanList){ 
       String Message = "For printing all the human press 1. \n
                        For printing all the man press 2. \n
                        For printing all the women press 3. \n
                        For printig all the women at risk press 4. \n
                        For printing all the man at risk press 5. \n
                        For printing all the kisd press 6. \n
                        For printing a spesific human press 7.";
                        
        System.out.println(Message);
        String number = scanner.nex();

        if(number == "1"){
            humanList.PrintHumanList();
        }
        else if(number == "2"){
            humanList.GetManList();
        }
        else if(number == "3"){
            humanList.GetWomenList();
        }
        else if(number == "4"){
            humanList.GetHumansAtRisk("M");
        }
        else if(number == "5"){
            humanList.GetHumansAtRisk("F");
        }
        else if(number == "6"){
            humanList.PrintUnder18();
        }
        else if(number == "7"){
            System.out.println("Write the medical id");
            int MedicalId = scanner.nexInt();
            
            humanList.GetHuman(MedicalId);
        }
        else{
          System.out.println("You Chose worng!");
        }
    }
}
