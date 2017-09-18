

public class WordCount {
    private  word;

    private  count;
 
    public WordCount() {

    }

    public WordCount( word, count) {
        this.word = word;
        this.count = count;
    }

    public  getword() {
        return word;
    }

    public void setword( word) {
        this.word = word;
    }

    public  getcount() {
        return count;
    }

    public void setcount( count) {
        this.count = count;
    }
 
    @Override
    public String toString() {
        return "(" + this.word + this.count + ")";
    }

}
