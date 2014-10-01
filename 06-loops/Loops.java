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

//5 min
public String stringBits(String str) {
  String r=new String();
  int n=0;
  while (n<str.length()) {
  if (n%2==0) {
  r+=str.charAt(n);
  n+=1;
  }
  else {
  n+=1;
  }
  }
  return r;
}

//10 min
public String stringYak(String str) {
  String r=new String();
  int n=0;
  while (n<str.length()){
  if (n+2<str.length() && str.charAt(n)=='y' && str.charAt(n+2)=='k') {
  n+=3;
  }
  else{
  r+=str.charAt(n);
  n+=1;
  }
  }
  return r;
}

//10 min
public int stringMatch(String a, String b) {
  int c=0;
  int n=0;
  int sh=0;
  if (a.length()<b.length()){
  sh=a.length();
  }
  else{
  sh=b.length();
  }
  while (n<sh-1){
  if (a.substring(n,n+2).equals(b.substring(n,n+2))){
  c+=1;
  n+=1;
  }
  else {
  n+=1;
  }
  }
  return c;

  
}



