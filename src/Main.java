import Project.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ){

        List<AbsrtactHouse> HouseList = new ArrayList<>();
        HouseList.add(new AllProject(false,2,"дерево",4,"металл"));
        HouseList.add(new NewFloor(true,1,"камень",2,"стекло"));
        HouseList.add(new PaintHouse(false,3,"дерево",1,"дерево"));
        HouseList.add(new DecorateHouse(true,2,"камень",5,"металл"));

        for(AbsrtactHouse item:HouseList){
            item.build();
        }


    }
}
