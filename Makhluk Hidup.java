public abstract class MakhlukHidup {
    private String nama;

    public MakhlukHidup(String nama) {
        this.nama = nama;
    }

    public String getNama() { return nama; }

    // Method Abstract
    public abstract void bernafas();

    public void info() {
        System.out.println("Nama: " + nama);
    }
}
