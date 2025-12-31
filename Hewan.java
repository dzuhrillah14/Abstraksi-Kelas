public class Hewan extends MakhlukHidup {
    public Hewan(String nama) { super(nama); }
    @Override
    public void bernafas() { System.out.println(getNama() + " bernafas dengan Insang/Paru-paru."); }
}
