package HeadFirstJavaBook.exercise.Pages140;

import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells;
//    int numOfHits = 0;
    private String name = null;

    public void setLocationCells(ArrayList<String> locs){
        locationCells = locs;
    }

    public String checkYourself(String userInput) {

        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if(index >= 0){
            locationCells.remove(index);
            if (locationCells.isEmpty()){
                result = "kill";
                System.out.println("Ouch! You sunk" + name + " : (");
            }else{
                result = "hit";
            }
        }

//        for (int cell : locationCells){
//            if (cell == guess){
//                result = "hit";
//
//                numOfHits++;
//                break;
//            }
//        }
//
//        if(numOfHits == locationCells.length){
//            result = "kill";
//        }

//        System.out.println(result);
        return result;
    }

    public void setName(String name){
        name = name;
    }
}
