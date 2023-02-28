public class Main{
    public static void main(String[] args) {
        PlaySong playsong = new PlaySong();
        MusicBox mbox = new MusicBox("S34TG65", 'Y', "Raindrops", "Misty", 
        "The path less traveled", "Country", "BZEE Music", "Rhythm Divine");

        System.out.println("Now playing the song");
        playsong.playSong(mbox.getSongID(), mbox.getPremiumSong(), 2);
        
        // --- TODO
        MusicBox nbox = new MusicBox("S34TG65", 'N', "Raindrops", "Misty",
                "The path less traveled", "Country", "BZEE Music", "Rhythm Divine");
        /* Repeat the above code to create another object  
         * Pass different parameters to the MusicBox constructor, but initialise premiumSong to N and when calling the
         * playSong method, pass ads parameter as just 1
         * 
         * 
        */
        System.out.println("Now playing the song");
       playsong.playSong(mbox.getSongID(), mbox.getPremiumSong(), 1);

    }
}




