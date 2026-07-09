import java.util.*;
class Scope{
  public static void main(String args[]){
    
  }
  public static boolean issLetter(char ch){
    int asci = (char)ch;
    if((asci<=122 && asci>=97) || (asci>=65 && asci<=90))
      return true;
    else
      return false;
  }
}
