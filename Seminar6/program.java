package Seminar6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class program {
    public static Set<notebook> filterNotebook(Set<notebook> setNotebook, Scanner scanner) {
        HashMap<String, String> flt = new HashMap<>();
        Set<notebook> fltNotebookList = new HashSet<>();
        boolean finish = false;
        while (!finish){
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            System.out.println("1 - RAM");
            System.out.println("2 - CPU");
            System.out.println("3 - SSD");
            System.out.println("4 - OS");
            System.out.println("5 - Color");
            System.out.println("6 - Price");
            System.out.println("7 - Вывести ноутбуки, соответствующие выбранным критериям.");
            int choiceKey = scanner.nextInt();
            switch (choiceKey) {
                case 1:
                    System.out.println("Введите минимальное значение RAM: ");
                    flt.put("RAM", scanner.next());
                    break;
                case 2:
                    System.out.println("Введите минимальное значение CPU: ");
                    flt.put("CPU", scanner.next());
                    break;
                case 3:
                    System.out.println("Введите минимальное значение SSD: ");
                    flt.put("SSD", scanner.next());
                    break;
                case 4:
                    System.out.println("Введите наименование OS: ");
                    flt.put("OS", scanner.next());
                    break;
                case 5:
                    System.out.println("Выберете цвет: ");
                    flt.put("Color", scanner.next());
                    break;
                case 6:
                    System.out.println("Введите максимальное значение Price: ");
                    flt.put("Price", scanner.next());
                    break;
                case 7:
                    finish = true;
                    break;
            }
        }
        // for (notebook elem : setNotebook) {
        //     System.out.println(elem);
        for (notebook elem : setNotebook) {
            boolean match = true;
            for (Entry<String, String> pair : flt.entrySet()) {
                switch (pair.getKey()) {
                    case "RAM":
                        if (elem.RAM < Integer.parseInt(pair.getValue()))
                            match = false;
                        break;
                    case "CPU":
                        if (elem.CPU < Integer.parseInt(pair.getValue()))
                            match = false;
                        break;  
                    case "SSD":
                        if (elem.RAM < Integer.parseInt(pair.getValue()))
                            match = false;
                        break;
                    case "OS":
                        if (!elem.OS.equals(pair.getValue()))
                            match = false;
                        break;
                    case "Color":
                        if (!elem.color.equals(pair.getValue()))
                            match = false;
                        break;  
                    case "Price":
                        if (elem.price > Integer.parseInt(pair.getValue()))
                            match = false;
                        break; 
                }
            }
                if (match)
                    fltNotebookList.add(elem);
        } 
        return fltNotebookList;
    }
    public static void main(String[] args) {
        notebook note1 = new notebook(1, 8, 4, 256, "Win10", "Black", 35000);
        notebook note2 = new notebook(2, 16, 4, 256, "Win11", "Silver", 45000);
        notebook note3 = new notebook(3, 32, 8, 500, "Win11", "White", 60000);
        notebook note4 = new notebook(4, 8, 2, 256, "Win8", "Black", 30000);
        notebook note5 = new notebook(5, 4, 2, 128, "Win8", "Silver", 25000);
        notebook note6 = new notebook(6, 16, 4, 500, "MacOS", "Grey", 70000);
        notebook note7 = new notebook(7, 32, 12, 1000, "MacOS", "Black", 100000);
        notebook note8 = new notebook(8, 4, 4, 128, "Win10", "Silver", 25000);
        notebook note9 = new notebook(9, 16, 8, 256, "MacOS", "Black", 85000);
        notebook note10 = new notebook(10, 16, 8, 256, "MacOS", "Black", 105000);
        
        Set<notebook> notebooks = new HashSet<>(Arrays.asList(note1, note2, note3, note4, note5, note6, note7, note8, note9, note10));
        for (notebook elem : notebooks) {
            System.out.println(elem);    
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        for (notebook elem : filterNotebook(notebooks, scanner)) {
            System.out.println(elem);    
        }
        scanner.close();
    }
}
