package Project;

import Project.AbsrtactHouse;

public class AllProject extends AbsrtactHouse {
    public AllProject(boolean basement, int number_floors,String material,int roof,String roof_material){
        this.basement=basement;
        this.number_floors=number_floors;
        this.material=material;
        this.roof=roof;
        this.roof_material=roof_material;
    }

    @Override
    void status() {
        System.out.println("Заказ: построить дом");
    }

    @Override
    void digBasement() {
        if (this.basement==true){
            System.out.println("\tРоем подвал");
        }
    }

    @Override
    void constructFloor(String material) {
        for (int i=1;i<=number_floors;i++){
            if (material=="дерево")
                System.out.println("\tСтроим деревянные стены");
            else
                System.out.println("\tСтроим каменные стены");
            constructWindows();
        }
    }

    @Override
    void constructWindows() {
        System.out.println("\tУстанавливаем окна");
    }

    @Override
    void constructDoors() {
        System.out.println("\tУстанавливаем дверь");
    }

    @Override
    void constructRoof(int roof, String roof_material) {
        System.out.println("\tДелаем "+roof+"-скатную крышу, материал: " + roof_material);
    }

    @Override
    void constructBase() {
        System.out.println("\tЗаливаем фундамент");
    }

    @Override
    void paintHouse() { System.out.println("\tКрасим дом");}
}
