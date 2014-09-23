//mixStart
public boolean mixStart(String str) {
   if (str.length()<3) return false;
   String ix=str.substring(1,3);
   if (ix.equals("ix")) {return true;}
   else {return false;}
}

//makeOutWord
public String makeOutWord(String out, String word) {
  String out1=out.substring(0,2);
  String out2=out.substring(2);
  return out1+word+out2;
}

//firstHalf
public String firstHalf(String str) {
   int strlen=str.length();
   int halflen=strlen/2;
   return str.substring(0,halflen);
}
