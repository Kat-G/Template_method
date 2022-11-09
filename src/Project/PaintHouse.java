package Project;

import Project.AbsrtactHouse;

public class PaintHouse extends AbsrtactHouse {
    public PaintHouse(boolean basement, int number_floors,String material,int roof,String roof_material){
        this.basement=basement;
        this.number_floors=number_floors;
        this.material=material;
        this.roof=roof;
        this.roof_material=roof_material;
    }

    @Override
    void status() {
        System.out.println("Заказ: покрасить дом");
    }
    @Override
    void digBasement() { }
    @Override
    void constructFloor(String material) { }
    @Override
    void constructWindows() { }
    @Override
    void constructDoors() { }
    @Override
    void constructRoof(int roof, String roof_material) { }
    @Override
    void constructBase() {  }

    @Override
    void paintHouse() {
        System.out.println("\tКрасим дом");
    }
}
