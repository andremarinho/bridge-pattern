public class Main {

    public static void main(String[] args) {
        Radio radio = new Radio();
        RemoteWithVolume remoteWithVolume = new RemoteWithVolume(radio);
        remoteWithVolume.ligar();
    }
}
