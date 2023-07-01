public class Test1 {
    public static void main(String[] args) {

    String description = "type:gas; name:civic; due:1000; length:3; monthly:295; mile/unit:34; allowance:1200;";

    int nameLoc = description.indexOf("name:");
    String nameSplit = description.substring(nameLoc+5);
    String name = nameSplit.substring(0, nameSplit.indexOf(";"));

    int typeLoc = description.indexOf("type:");
    String typeSplit = description.substring(typeLoc+5);
    String type = typeSplit.substring(0, typeSplit.indexOf(";"));


    int dueLoc = description.indexOf("due:");
    String dueSplit = description.substring(dueLoc+4);
    String dueAtSigningS = dueSplit.substring(0, dueSplit.indexOf(";"));
    double dueAtSigning = Double.parseDouble(dueAtSigningS);

    int lengthLoc = description.indexOf("length:");
    String lengthSplit = description.substring(lengthLoc+7);
    String leaseLengthS = lengthSplit.substring(0, lengthSplit.indexOf(";"));
    int leaseLength = Integer.parseInt(leaseLengthS);

    int monthlyLoc = description.indexOf("monthly:");
    String monthlySplit = description.substring(monthlyLoc+8);
    String monthlyCostS = monthlySplit.substring(0, monthlySplit.indexOf(";"));
    double monthlyCost = Double.parseDouble(monthlyCostS);

    int allowanceLoc = description.indexOf("allowance:");
    String allowanceSplit = description.substring(allowanceLoc+10);
    String mileageAllowanceS = allowanceSplit.substring(0, allowanceSplit.indexOf(";"));
    int mileageAllowance = Integer.parseInt(mileageAllowanceS);

    int mileLoc = description.indexOf("mile/unit:");
    String mileSplit = description.substring(mileLoc+10);
    String milePUnitS = mileSplit.substring(0, mileSplit.indexOf(";"));
    double milePUnit = Double.parseDouble(milePUnitS);

    int chargerLoc;
    String chargerSplit;
    String chargerS;
    double charger;

    if(type.equals("electric")) {
        chargerLoc = description.indexOf("charger:");
        chargerSplit = description.substring(chargerLoc+8);
        chargerS = chargerSplit.substring(0, chargerSplit.indexOf(";"));
        charger = Double.parseDouble(chargerS);
        System.out.println(charger);
    }



  System.out.println(name + " " + type + " " + dueAtSigning + " " + leaseLength + " " + monthlyCost + " " + mileageAllowance + " " + milePUnit);
        
    }
       

       

    }
    

