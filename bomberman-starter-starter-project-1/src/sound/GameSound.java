package sound;

import java.applet.AudioClip;
import java.applet.Applet;
import java.util.ArrayList;
import java.util.HashMap;

public class GameSound {
	public static GameSound instance;

	public static final String MENU = "menu.wav";
	public static final String PLAYGAME = "playgame.mid";
	public static final String BOMB = "newbomb.wav";
	public static final String BOMBER_DIE = "bomber_die.wav";
	public static final String MONSTER_DIE = "monster_die.wav";
	public static final String BONG_BANG = "bomb_bang.wav";
	public static final String ITEM = "item.wav";
	public static final String WIN = "win.wav";
	public static final String LOSE = "lose.mid";
	
        private HashMap<String, AudioClip> audioMap = new HashMap<String,AudioClip>();
        public GameSound() {
		audioMap = new HashMap<>();
		loadAllAudio();
	}

	public static GameSound getIstance() {
		if (instance == null) {
			instance = new GameSound();
		}

		return instance;
	}

	public void loadAllAudio() {
		putAudio(MENU);;
		putAudio(PLAYGAME);
		putAudio(BOMB);
		putAudio(MONSTER_DIE);
		putAudio(BOMBER_DIE);
		putAudio(BONG_BANG);
		putAudio(ITEM);
		putAudio(WIN);
		putAudio(LOSE);
	}

	public void stop() {
		getAudio(MENU).stop();;
		getAudio(PLAYGAME).stop();
		getAudio(BOMB).stop();
		getAudio(BONG_BANG).stop();
		getAudio(WIN).stop();
		getAudio(LOSE).stop();
	}

	public void putAudio(String name) {
		AudioClip auClip = Applet.newAudioClip(GameSound.class.getResource(name));
		audioMap.put(name, auClip);
	}

	public AudioClip getAudio(String name) {
		return audioMap.get(name);
	}
       /* public static ArrayList<AudioClip> arrSound = new ArrayList<AudioClip>();
        public static HashMap<String,AudioClip> mapS = new HashMap<String,AudioClip>();
        public GameSound()
        {
            putSound(MENU);
            putSound(PLAYGAME);
            putSound(BOMB);
            putSound(BOMBER_DIE);
            putSound(MONSTER_DIE);
            putSound(BONG_BANG);
            putSound(ITEM);
            putSound(WIN);
            putSound(LOSE);
            
            
        }
        public void putSound(String name)
        {
            AudioClip audio = Applet.newAudioClip(GameSound.class.getResource(name));
            mapS.put(name, audio);
            
        }
        public AudioClip getSound(String name)
        {
            
             return mapS.get(name);
        }
        public static void main(String[] args) {
        GameSound g = new GameSound();
        g.getSound(BOMB).play();
    }*/
        

	
}
