package Project;

import Project.AbsrtactHouse;

public class NewFloor extends AbsrtactHouse {
    public NewFloor(boolean basement, int number_floors,String material,int roof,String roof_material){
        this.basement=basement;
        this.number_floors=++number_floors;
        this.material=material;
        this.roof=roof;
        this.roof_material=roof_material;
    }

    @Override
    void status() {
        System.out.println("Заказ: построить новый этаж");
    }

    @Override
    void digBasement(){ }

    @Override
    void constructFloor(String material) {
        System.out.println("\tУбираем крышу");
        if (material=="дерево")
            System.out.println("\tСтроим деревянные стены");
        else
            System.out.println("\tСтроим каменные стены");
        constructWindows();
    }

    @Override
    void constructWindows() {
        System.out.println("\tУстанавливаем окна");
    }

    @Override
    void constructDoors() { }

    @Override
    void constructRoof(int roof, String roof_material) {
        System.out.println("\tДелаем "+roof+"-скатную крышу, материал: " + roof_material);
    }

    @Override
    void constructBase() { }

    @Override
    void paintHouse() {
        System.out.println("\tКрасим дом");
    }
}
