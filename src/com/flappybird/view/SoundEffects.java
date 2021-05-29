package com.flappybird.view;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author vanshaj
 */
public class SoundEffects {
    
    public static void playMusic(){
    try {
            URL url = SoundEffects.class.getResource("/assets/Music_coinSound.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(url);
            AudioFormat af = ais.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, af);

            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(ais);
            clip.start();
            //System.out.println("Drain...");
            clip.drain();
            //System.out.println("...Drained");
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException exp) {
            exp.printStackTrace();
        }
    }
}
