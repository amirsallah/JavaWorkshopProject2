import java.util.ArrayList;


public class MusicCollection {
    // An ArrayList for storing the file names of music files.
    private final ArrayList<Music> files;
    // A player for the music files.
    private final MusicPlayer player;
    private final ArrayList<Music> favorite;


    /**
     * Create a MusicCollection
     */
    public MusicCollection() {
        files = new ArrayList<>();
        favorite = new ArrayList<>();
        player = new MusicPlayer();
    }

    /**
     * Add a file to the collection.
     *
     * @param music The file to be added.
     */
    public void addFile(Music music) {
        files.add(music);
    }

    public void addFavorite(Music music) {
        favorite.add(music);
    }

    /**
     * Return the number of files in the collection.
     *
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles() {
        return files.size();
    }

    /**
     * List a file from the collection.
     *
     * @param index The index of the file to be listed.
     */
    public void listFile(int index) {
        System.out.println(files.get(index));
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles() {
        for (Music temp : files)
            System.out.println(temp.getAddress() + "(" + temp.getSingerName() + ")");
    }

    public void listAllFavorite() {
        for (Music temp : favorite) {
            System.out.println(temp.getAddress() + "(" + temp.getSingerName() + ")");
        }
    }

    /**
     * Remove a file from the collection.
     *
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index) {
        if (validIndex(index))
            files.remove(index);
    }

    public void removeFavorite(int index) {
        if (validIndex(index))
            favorite.remove(index);
    }

    public void search(String name) {
        int correct = 0;
        for (Music temp : files) {
            if (temp.getAddress().equals(name) || temp.getSingerName().equals(name)) {
                System.out.println("found:)");
                System.out.println(temp.getAddress()+"("+temp.getSingerName()+")");
                ++correct;
            }
        }
            if (correct == 0)
                System.out.println("not found._.");

    }


    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     *
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index) {
        if (validIndex(index))
            player.startPlaying(files.get(index));
    }

    /**
     * Stop the player.
     */
    public void stopPlaying() {
        if (player.getIsPlaying())
            player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     *
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index) {
        if (index < 0 || index > (files.size() - 1)) {
            System.out.println("invalid");
            return false;
        } else
            return true;
        // The return value.
        // Set according to whether the index is valid or not.

    }
}