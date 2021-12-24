public class RemoteControl {
    protected EntertainmentDevice device;

    public RemoteControl(EntertainmentDevice device){
        this.device = device;
    }

    public void ligar(){

        System.out.println("O " + this.device.getNome() + " esta " + this.device.setPower());
    }
}
