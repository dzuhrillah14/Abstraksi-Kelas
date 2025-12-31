public class Manusia extends MakhlukHidup {
    public Manusia(String nama) { super(nama); }
    @Override
    public void bernafas() { System.out.println(getNama() + " bernafas dengan Paru-paru."); }
}
