package HeadFirstJavaBook.exercise.Pages96;

import com.company.Array;

import java.util.ArrayList;
import java.util.List;

public class SimpleDotCom {

    private ArrayList<Integer> locationCells;
//    int numOfHits = 0;

    public void setLocationCells(ArrayList<Integer> locs){
        locationCells = locs;
    }

    public String checkYourself(String userInput) {
        int guess = Integer.parseInt(userInput);

        String result = "miss";
        int index = locationCells.indexOf(guess);
        if(index >= 0){
            locationCells.remove(index);
            if (locationCells.isEmpty()){
                result = "kill";
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

        System.out.println(result);
        return result;
    }
}
