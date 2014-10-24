//frontPiece
public int[] frontPiece(int[] nums) {
  if (nums.length>=2) {
  int[] r = new int[2];
  r[0] = nums[0];
  r[1] = nums[1];
  return r;
  }
  else {
  return nums;
  }
}

//sum13
public int sum13(int[] nums) {
  int r=0;
  for (int i=0;i<nums.length;i++) {
  if (!(nums[i]==13)) {
     if (i==0) {r+=nums[i];}
     else if (!(nums[i-1]==13)) {
     r+=nums[i];
     }
  }
  }
  return r;
}
