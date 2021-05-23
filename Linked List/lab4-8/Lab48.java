/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg8;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Scanner;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab48 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Music music1 = new Music("Music 1", "Deva_Shree_Ganesha-(HindiMp3.Mobi).mp3");
        Music music2 = new Music("Music 2", "03 440 Volt - Sultan (Mika Singh) 190Kbps.mp3");
        Music music3 = new Music("Music 3", "Main-Agar-Kahoon.mp3");
        Music music4 = new Music("Music 4", "06. Kajra Re.mp3");
        
        CircularLinkedList<Music> musicPlayer = new CircularLinkedList<>();
        
        musicPlayer.addCircularNode(music1);
        musicPlayer.addCircularNode(music2);
        musicPlayer.addCircularNode(music3);
        musicPlayer.addCircularNode(music4);
        
        Iterator<Music> musicIterator = musicPlayer.circularLinkedListIterator();

        System.out.println("My Music Playlist");
        Scanner s = new Scanner(System.in);
        int choice;
        int index = 0;
        
        while (true) {
            musicPlayer.showCircularList();
            System.out.print("1 Play Music | 2 Forward | 3 Backward | 4 Stop | -1 Exit : ");
            choice = s.nextInt();
            s.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("Play Music : " + musicPlayer.getCircularItem(index));
                    play(musicIterator.next().getFileName());
                    break;
                case 2:
                    if (index == 3) {
                        index = 0;
                    } else {
                        index++;
                    }
                    if (mediaPlayer != null) mediaPlayer.stop();
                    System.out.println("Forward One Position - Play Music : " + musicPlayer.getCircularItem(index));
                    play(musicIterator.next().getFileName());
                    break;
                case 3:
                    if (index == 0) {
                        index = 3;
                    } else {
                        index--;
                    }
                    if(mediaPlayer != null) mediaPlayer.stop();
                    System.out.println("Backward One Position - Play Music : " + musicPlayer.getCircularItem(index));
                    play(musicPlayer.getCircularItem(index).getFileName());
                    break;
                case 4:
                    stop();
                    break;
                default:
                    break;
            }

            if (choice == -1) {
                System.out.println("Exit Music Player");
                System.exit(0);
                break;
            }
        }
     
    }
     static JFXPanel panel;
     static String paths;
     static Media hit;
     static MediaPlayer mediaPlayer;
    
     public static void stop() {
        mediaPlayer.stop();
    }
     public static void play(String song) {
        panel = new JFXPanel();
        paths = Paths.get(song).toUri().toString();
        hit = new Media(paths);
        mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
    }        
}
 