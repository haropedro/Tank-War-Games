
package tank;

public class GameStart {
    public static void main( String[] args ) {
        
    SoundEffects play_sound = new SoundEffects();    
    play_sound.play_continously("src/resource/Music.wav");   
    new GameFrame( new ControlPanel() );
  }
}
