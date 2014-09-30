//3 min
public String frontTimes(String str, int n) {
  String r = new String();
  String frag = new String();
  if (str.length()<=3) frag=str;
  else frag=str.substring(0,3);
  while (n>0) {
  r+=frag;
  n-=1;
  }
  return r;
  
}

