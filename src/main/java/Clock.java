public abstract class Clock {
    private String colour;
    private int delaySeconds;
    protected Time time = new Time(delaySeconds);
    private String words = "";



    public void setWords(String words) {
        this.words = words;
    }

    public void say(){
        System.out.println(words);
    };

    public Time readTime(){
        return time;
    };
}
