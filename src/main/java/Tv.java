public class Tv extends EntertainmentDevice{

    private boolean power = false;
    private int volume = 0;

    @Override
    public String getNome() {
        return "Tv";
    }

    @Override
    public boolean setPower() {
        return false;
    }

    @Override
    public void upVolume() {
        System.out.println("O volume da " + getNome() + " era " + this.volume + " e agora é " + (this.volume = this.volume + 1));
    }

    @Override
    public void downVolume() {
        System.out.println("O volume da"  + getNome() + " era " + this.volume + " e agora é " + (this.volume - 1));
    }
}
