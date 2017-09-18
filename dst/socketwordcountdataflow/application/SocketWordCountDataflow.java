package socketwordcountdataflow.application;

import socketwordcountdataflow.datatypes.WordCount;
      
import socketwordcountdataflow.functions.LineSplitter;
            

public class SocketWordCountDataflow {

    public static void main(String[] args) throws Exception {

       final StreamExcecutionEnvironment env = StreamExcecutionEnvironment
               .getExcecutionEnvironment();

       env.setParallelism(1);

       DataStream<> text = env.socketTextStream("localhost", 9999)
                .setParallelism(1);

       DataStream<> tokens = text
          .setParallelism(1);

       DataStream<> counts = tokens
          .setParallelism(1);

       counts
          .keyBy("")
          .writeAsText("/home/utente/word-count-output.txt")
          .setParallelism(1);
    }

}
