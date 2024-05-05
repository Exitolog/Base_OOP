import java.io.Serializable;
@FunctionalInterface
public interface Goable {
    public static final int i = 0;
  double run();



  default double acceleration (){
      return 9.8;
   }
}
