package java_intermediate_study.Interface.playable;

public class MediaTest {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer("Bohemian Rhapsody - Queen");

        System.out.println("=== 뮤직 플레이어 ===\n");

        player.play();
        player.volumeUp();
        player.volumeUp();

        System.out.println();
        player.pause();

        System.out.println();
        player.changeSong("Hotel California = Eagles");
        player.play();

        System.out.println();
        player.volumeDown();
        player.mute();

        System.out.println();
        player.stop();
    }
}
