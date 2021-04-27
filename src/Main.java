public class Main {
    public static void main(String[] args) {
        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock= new MusicCollection();
        MusicCollection country = new MusicCollection();
        Music music1 = new Music("darya",1397,"MasihoArash");
        Music music2 = new Music("sheida",1391,"ashvan");
        Music music3 = new Music("ghatar",1389,"mohsen chavoshi");

        pop.addFile(music1);
        pop.addFile(music2);
        pop.addFile(music3);
        pop.addFavorite(music3);
        pop.addFavorite(music1);
        pop.removeFavorite(0);


        System.out.println(pop.getNumberOfFiles());
        pop.listAllFiles();
        System.out.print("\n\n");
        pop.listAllFavorite();
        System.out.print("\n\n");
        pop.startPlaying(2);
        pop.stopPlaying();
        System.out.print("\n\n");
        pop.search("ashvan");
        System.out.print("\n\n");
        pop.search("tttt");

    }
}
