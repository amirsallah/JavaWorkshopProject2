public class Music {
    private final String address;
    private final int yearOfPublication;
    private final String singerName;

    public Music(String address, int yearOfPublication, String singerName){
        this.address = address;
        this.singerName = singerName;
        this.yearOfPublication = yearOfPublication;
    }

    public String getAddress() {
        return address;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getSingerName() {
        return singerName;
    }
}
