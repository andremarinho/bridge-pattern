public class Main {

    public static void main(String[] args) {
        Radio radio = new Radio();
        RemoteWithVolume remoteWithVolume = new RemoteWithVolume(radio);
        remoteWithVolume.ligar();

        Tv tv = new Tv();
        RemoteWithVolume remoteWithVolume1 = new RemoteWithVolume(tv);
        remoteWithVolume1.upVolume();
        remoteWithVolume1.upVolume();
        remoteWithVolume1.downVolume();

    }
}
