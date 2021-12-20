public class RemoteControl {
    private Device device;

    public RemoteControl(Device device){
        this.device = device;
    }

    public void ligar(){
        System.out.println("Ligando o " + this.device.getNome());
    }
}
