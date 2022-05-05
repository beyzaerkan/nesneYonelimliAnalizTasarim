package b201210038;

public interface IObserver {
    int kritikDurum(int kritikSicaklik, IEyleyici eyleyici, String tur) throws InterruptedException;
}
