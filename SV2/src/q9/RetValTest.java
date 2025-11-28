package SV2.src.q9;

public class RetValTest {
  public static String sEmail = "";
  public static void extractCamEmail ( String sentence ) {
    if ( sentence == null || sentence . length () == 0) {
      throw new IllegalArgumentException();
    }
    String tokens [] = sentence . split (" ") ; // split into tokens

    for ( int i = 0; i < tokens . length ; i ++) {
      if ( tokens [ i ]. endsWith (" @cam .ac.uk") ) {
        sEmail = tokens [ i ];
        return;
      }
    }
    throw new IllegalStateException();
  }


  public static void main ( String [] args ) {
    try {
      RetValTest.extractCamEmail ("My email is rkh23@cam .ac.uk") ;
      System.out.println(" Success : " + RetValTest . sEmail) ;
    } catch (IllegalArgumentException e) {
      System.out.println("Supplied string empty");
    } catch (IllegalStateException e) {
      System.out.println("No @cam address in supplied string") ;
    }
  }
}
