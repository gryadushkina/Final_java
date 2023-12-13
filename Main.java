import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
// Создание объектов класса Laptop
        Labtop hp_pailion_g6 = new Labtop("hp_pailion_g6", 16, "4k", 
        true, 500, "16", "Windows", "black"); 
        Brand brandHp = new Brand("HP", "U.S.A.", "AmericaLanguage");
        hp_pailion_g6.addBrand(brandHp); 
        Labtop hp_galaxy_x64 = new Labtop("hp_galaxy_x64", 14, "FullHD", 
        true, 500, "8", "Windows", "white");
        hp_galaxy_x64.addBrand(brandHp);
        Labtop samsung_a52 = new Labtop("samsung_a52", 18, "FullHD", 
        true, 300, "8", "Windows", "black");
        Brand brandSamsung = new Brand("Samsung", "Korea", "KoreaLanguage");
        samsung_a52.addBrand(brandSamsung);
        Labtop samsung_m31s = new Labtop("samsung_m31s", 16, "4k", 
        false, 1000, "16", "Linux", "black");
        samsung_m31s.addBrand(brandSamsung);
        Labtop lenovo_gtx76 = new Labtop("lenovo_gtx76", 16, "FullHD", 
        true, 700, "8", "Windows", "white");
        Brand brandLenovo = new Brand("Lenovo", "China", "ChinaLanguage");
        lenovo_gtx76.addBrand(brandLenovo);
        Labtop macbook_14pro = new Labtop("macbook_14pro", 17, "4k", 
        false, 1000, "8", "ios", "white");
        Brand brandMacbook = new Brand("Apple", "U.S.A.", "AmericaLanguage");
        macbook_14pro.addBrand(brandMacbook);
        Labtop asus_x515 = new Labtop("asus_x515", 17, "FullHD", 
        true, 300, "4", "Windows", "black");
        Brand brandAsus = new Brand("Asus", "taiwan", "ChinaLanguage");
        asus_x515.addBrand(brandAsus);
        Labtop acer_air5 = new Labtop("acer_air5", 19, "FullHD", 
        true, 600, "8", "Windows", "black");
        Brand brandAcer = new Brand("Acer", "taiwan", "ChinaLanguage");
        acer_air5.addBrand(brandAcer);
        Labtop acer_air6 = new Labtop("acer_air6" ,18, "4k", 
        false, 500, "16", "Windows", "black");
        acer_air6.addBrand(brandAcer);
        Labtop acer_a313 = new Labtop("acer_a313", 16, "FullHD", 
        true, 500, "8", "Windows", "black");
        acer_a313.addBrand(brandAcer);
// Создание множества
        Set <Labtop> laptop = new HashSet<>();
        laptop.add(hp_pailion_g6);      
        laptop.add(hp_galaxy_x64);
        laptop.add(samsung_a52);
        laptop.add(samsung_m31s);
        laptop.add(lenovo_gtx76);
        laptop.add(macbook_14pro);
        laptop.add(asus_x515);
        laptop.add(acer_air5);
        laptop.add(acer_air6);
        laptop.add(acer_a313);
// создание нового объекта вызова методов
        Labtop FilterLaptop = new Labtop();
// вызов метода фильтрации по определеннеым параметрам
        // System.out.println("по вашему запросу найдено: " + FilterLaptop.filter(laptop));

// вызод метода фильтрации по заданным пользователем критериям
        System.out.println(FilterLaptop.newFilter(laptop));
    }
}