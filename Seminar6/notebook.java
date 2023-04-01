package Seminar6;

import java.util.Objects;

public class notebook {
    int SN;
    int RAM;
    int CPU;
    int SSD;
    String OS;
    String color;
    int price;

    public notebook(int SN, int RAM, int CPU, int SSD, String OS, String color, int price) {
        this.SN = SN;
        this.RAM = RAM;
        this.CPU = CPU;
        this.SSD = SSD;
        this.OS = OS;
        this.color = color;
        this.price = price;
    }
    @Override
    public boolean equals(Object object) {
       notebook obj = (notebook) object;
        return (this.RAM == obj.RAM && this.CPU == obj.CPU && 
                this.SSD == obj.SSD && this.OS.equals(obj.OS) && 
                this.color.equals(obj.color));
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        return String.format("SN:%d RAM:%d CPU:%d SSD:%d OS:%s color:%s price:%d", SN, RAM, CPU, SSD, OS, color, price);
    }
}
