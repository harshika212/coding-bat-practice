
Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.


biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2]

public int[] biggerTwo(int[] a, int[] b) {
  int sumA=0;
  int sumB=0;
  for(int i = 0; i<a.length; i++){
    sumA= sumA+a[i];
  }
  for(int j=0;j<b.length;j++){
    sumB= sumB+b[j];
  }
  if(sumA > sumB){
    return a;
  }
  else if(sumB>sumA){
    return b;
  }
  else {
    return a;
  }
}
