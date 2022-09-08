package ru.mirea.task5;
import java.util.ArrayList;


abstract class Furniture {
    private String name;
    private int size;
    private int price;

    public Furniture(String name, int size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract String toString();
}

class Sofa extends Furniture {
    private int placesCount;

    public Sofa(String name, int size, int price, int placesCount) {
        super(name, size, price);
        this.placesCount = placesCount;
    }

    public int getPlacesCount() {
        return placesCount;
    }

    public void setPlacesCount(int placesCount) {
        this.placesCount = placesCount;
    }

    public String toString() {
        String tmp = "Sofa: name=" + super.getName() + ", size=" + super.getSize();
        tmp += ", price=" + super.getPrice() + ", places=" + this.getPlacesCount();
        return tmp;
    }
}

class ArmChair extends Furniture {
    private int width;

    public ArmChair(String name, int size, int price, int width) {
        super(name, size, price);
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String toString() {
        String tmp = "Armchair: name=" + super.getName() + ", size=" + super.getSize();
        tmp += ", price=" + super.getPrice() + ", width=" + this.getWidth();
        return tmp;
    }
}

class FurnitureShop {
    private String shopName;
    private String shopAdress;
    private ArrayList<Sofa> arraySofa = new ArrayList<Sofa>();
    private ArrayList<ArmChair> arrayArmchair = new ArrayList<ArmChair>();

    FurnitureShop(String shopName, String shopAdress) {
        this.shopName = shopName;
        this.shopAdress = shopAdress;
    }

    public String getShopName() {
        return shopName;
    }

    public String getShopAdress() {
        return shopAdress;
    }

    public void setShopAdress(String shopAdress) {
        this.shopAdress = shopAdress;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void addSofa(Sofa sofa) {
        this.arraySofa.add(sofa);
    }

    public void addArmchair(ArmChair armChair) {
        this.arrayArmchair.add(armChair);
    }

    public String getStringMenu() {
        String tmp = "---FURNITURE SHOP---\n";
        tmp += "Sofa:\n";
        if (arraySofa.isEmpty()) {
            tmp += "No sofas in the shop!\n";
        }
        else  {
            for (int i = 0; i < arraySofa.size(); i++) {
                tmp += (i + 1) +  ". name=" + this.arraySofa.get(i).getName();
                tmp += ", price=" + this.arraySofa.get(i).getPrice();
                tmp += ", places=" + this.arraySofa.get(i).getPlacesCount() + "\n";
            }
        }
        tmp += "Armchair:\n";
        if (arrayArmchair.isEmpty()) {
            tmp += "No armchairs in the shop!\n";
        }
        else  {
            for (int i = 0; i < arrayArmchair.size(); i++) {
                tmp += (i + 1) +  ". name=" + this.arrayArmchair.get(i).getName();
                tmp += ", price=" + this.arrayArmchair.get(i).getPrice();
                tmp += ", places=" + this.arrayArmchair.get(i).getWidth() + "\n";
            }
        }
        return  tmp;
    }

}

public class FurnitureTest {
    public static void main(String[] args) {
        Sofa objectSofa = new Sofa("Top", 13, 130000, 2);
        ArmChair objectArmChair = new ArmChair("Top", 13, 70000, 90);
        FurnitureShop objectFurnitureShop = new FurnitureShop("Main shop", "Pilugina 32");
        objectFurnitureShop.addArmchair(objectArmChair);
        objectFurnitureShop.addSofa(objectSofa);
        System.out.println(objectFurnitureShop.getStringMenu());
    }
}
