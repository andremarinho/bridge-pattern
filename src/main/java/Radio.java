public class Radio extends EntertainmentDevice {

    private boolean power = false;
    private int volume = 3;

    @Override
    public String getNome() {
        return "Radio";
    }

    @Override
    public boolean setPower() {
        return !this.power;
    }

    @Override
    public void upVolume() {
      System.out.println("Aumentando o volume para " + this.volume + 1);
    }

    @Override
    public void downVolume() {
        System.out.println("Diminuindo o volume para " + (this.volume - 1)
        );
    }
}
