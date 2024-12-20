package Model;

import java.util.ArrayList;
import java.util.List;

class Store {
    private String name;
    private String owner;
    private String taxId;
    private List<Computer> computers;

    public Store(String name, String owner, String taxId) {
        this.name = name;
        this.owner = owner;
        this.taxId = taxId;
        this.computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputerByBrand(String brand) {
        computers.removeIf(computer -> computer.getBrand().equals(brand));
    }

    public List<Computer> findComputerByBrand(String brand) {
        List<Computer> result = new ArrayList<>();
        for (Computer computer : computers) {
            if (computer.getBrand().equals(brand)) {
                result.add(computer);
            }
        }
        return result;
    }

    public List<Computer> listComputers() {
        return computers;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public String getTaxId() {
        return taxId;
    }
}