package Project;

abstract public class AbsrtactHouse {
    protected int number_floors;
    protected boolean basement;
    protected String material;
    protected int roof;
    protected String roof_material;

    public final void build() {
        status();
        digBasement();
        constructBase();
        constructFloor(material);
        constructDoors();
        constructRoof(roof, roof_material);
        paintHouse();
        decorateHouse();
        report();
    }
    abstract void status();
    abstract void digBasement();
    abstract void constructFloor(String material);
    abstract void constructWindows();
    abstract void constructDoors();
    abstract void constructRoof(int roof,String roof_material);
    protected void report(){
        System.out.print(number_floors+" этажный ");
        if (material=="дерево")
            System.out.print("деревянный ");
        else
            System.out.print("каменный ");
        System.out.print("дом ");
        if (this.basement==true){
            System.out.print("с подвалом ");
        }
        System.out.println("с " + roof + "-скатной крышей (материал: " + roof_material + ") готов.\n");
    }

    abstract void constructBase();
    abstract void paintHouse();
    protected void decorateHouse(){
        System.out.println("\tДекорируем интерьер");
    }
}
