public class Tumbuhan extends MakhlukHidup {
    public Tumbuhan(String nama) { super(nama); }
    @Override
    public void bernafas() { System.out.println(getNama() + " bernafas melalui Stomata."); }
}
