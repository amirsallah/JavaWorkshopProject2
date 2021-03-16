public class Main {
    public static void main(String[] args) {
        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock= new MusicCollection();
        MusicCollection country = new MusicCollection();

        pop.addFile("darya-masihoarash");
        pop.addFile("sheida-ashvan");
        pop.addFile("ghatar-mohsen chavoshi");

//        System.out.println(pop.getNumberOfFiles());
//        pop.listAllFiles();
//        pop.startPlaying(2);
//        pop.stopPlaying();

        pop.removeFile(2);
        System.out.println(pop.getNumberOfFiles());
        pop.startPlaying(2);
    }
}
