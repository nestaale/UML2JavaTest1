package socketwordcountdataflow.datatypes;

public class WordCount {
    private String word;
// org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@271f18d3 (name: String, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false)

    private Integer count;
// org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@77b325b3 (name: Integer, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false)
 
    public WordCount() {

    }

    public WordCount(String word,Integer count) {
        this.word = word;
        this.count = count;
    }

    public String getword() {
        return word;
    }

    public void setword(String word) {
        this.word = word;
    }

    public Integer getcount() {
        return count;
    }

    public void setcount(Integer count) {
        this.count = count;
    }
 
    @Override
    public String toString() {
        return "(" + this.word + this.count + ")";
    }

}
