package ModelComputerShop;

import java.util.ArrayList;
import java.util.List;

class Computer {
    private String brand;
    private int memory;
    private String processor;
    private String operatingSystem;
    private double price;

    public Computer(String brand, int memory, String processor, String operatingSystem, double price) {
        this.brand = brand;
        this.memory = memory;
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String marca) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memoria) {
        this.memory = memory;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String procesador) {
        this.processor = procesador;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Memory: " + memory + "GB, Processor: " + processor + ", SO: " + operatingSystem + ", Price: $" + price;
    }
}

class Shop {
    private String name;
    private String owner;
    private String taxId;
    private List<Computer> computers;

    public Shop(String name, String owner, String taxId) {
        this.name = name;
        this.owner = owner;
        this.taxId = taxId;
        this.computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public boolean deleteCompaterByBrand(String brand) {
        return computers.removeIf(c -> c.getBrand().equalsIgnoreCase(brand));
    }

    public Computer searchComputerByBrand(String brand) {
        for (Computer c : computers) {
            if (c.getBrand().equalsIgnoreCase(brand)) {
                return c;
            }
        }
        return null;
    }

    public List<Computer> listComputers() {
        return computers;
    }

    @Override
    public String toString() {
        return "Shop: " + name + ", Owner: " + owner + ", Tax Id: " + taxId;
    }
}

