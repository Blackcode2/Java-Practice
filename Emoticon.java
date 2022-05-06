public class Emoticon {
    private String emotion;
    private static int count = 0;

    public Emoticon(String str) {
        this.emotion = str;
        count++;
    }

    public static int gethowmany() {
        return count;
    }

    public void emoticonStyle() {
        System.out.println("Neo is " + this.emotion + ".");
    }

    public static void main(String[] args)
    {
    Emoticon emoticon1 = new Emoticon("Smile");
    Emoticon emoticon2 = new Emoticon("Angry");
    Emoticon emoticon3 = new Emoticon("Fighting");
    Emoticon emoticon4 = new Emoticon("Sad");
    Emoticon emoticon5 = new Emoticon("Happy");
    Emoticon emoticon6 = new Emoticon("Sleepy");

    System.out.println("The number of Emoticons: " + Emoticon.gethowmany());
    emoticon1.emoticonStyle();
    emoticon2.emoticonStyle();
    emoticon3.emoticonStyle();
    emoticon4.emoticonStyle();
    emoticon5.emoticonStyle();
    emoticon6.emoticonStyle();
    }
}
