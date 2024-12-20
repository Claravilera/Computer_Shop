package Model;

class Computer {
    private String brand;
    private int memory;
    private String processor;
    private String os;
    private double price;

    public Computer(String brand, int memory, String processor, String os, double price) {
        this.brand = brand;
        this.memory = memory;
        this.processor = processor;
        this.os = os;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Memory: " + memory + " GB, Processor: " + processor + ", OS: " + os + ", Price: $" + price;
    }
}
