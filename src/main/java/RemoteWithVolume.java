public class RemoteWithVolume extends RemoteControl{
    public RemoteWithVolume(EntertainmentDevice device) {
        super(device);
    }

    public void upVolume(){
        device.upVolume();
    }

    public void downVolume(){
        device.downVolume();
    }
}
