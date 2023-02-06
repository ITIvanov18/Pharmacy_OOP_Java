public class Pharmacy {

    private Medicine medicine;
    private Provider provider;
    private Manufacturer manufacturer;
    private Importer importer;

    public Pharmacy(Medicine medicine, Provider provider, Manufacturer manufacturer, Importer importer) {
        this.medicine = medicine;
        this.provider = provider;
        this.manufacturer = manufacturer;
        this.importer = importer;
    }

    public Pharmacy() {
        this.medicine = new Medicine();
        this.provider = new Provider();
        this.manufacturer = new Manufacturer();
        this.importer = new Importer();
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Importer getImporter() {
        return importer;
    }

    public void setImporter(Importer importer) {
        this.importer = importer;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "medicine=" + medicine +
                ", provider=" + provider +
                ", manufacturer=" + manufacturer +
                ", importer=" + importer +
                '}';
    }
}