
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    public boolean equals(Object compared){
        /*You shouldn't use [return this == compared] since you don't 
        want to return something in the false case.*/
        
        if (this == compared){
            return true;
        }
        
        if (!(compared instanceof Song)){
            return false;
        }
        
        Song comparedSong = (Song) compared;
        
        return (this.artist.equals(comparedSong.artist) && this.name.equals(comparedSong.name)
                && this.durationInSeconds == comparedSong.durationInSeconds);
        }       
}

