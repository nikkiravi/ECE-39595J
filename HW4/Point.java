public class Point extends ComparableArray {

   // create constructors as needed.
//   private int[] arr;

   public Point(ComparableArray _arr){
      super(_arr);
   }

   public Point(int _val1, int _val2){
      super(new int[] {_val1, _val2});
   }

   /*
    * haschCode( ) should return an int based on the values of the object fields
    * equals( ) should return true if two objects are equal based on the values of the
    * object fields.  Given IntArray objects i1, i2 and i3, it must also be the case 
    * that 
    * 1. if i1.equals(i2) == i2.equals(i1).
    * 2. i1.equals(i1) is true, for any i1
    * 3. if i1.equals(i2) is true, and i2.equals(i3) is true, then it must be that
    *    i1.equals(i3) is true.
    * 3. if i1.equals(i2) is true, then i1.hashCode( ) == i2.hashCode( )
    *
    * Note that if i1.equals(i2) is false, then i1.hashCode( ) can be equal or not
    *      equal to i2.hashCode( ).
    *
    * As long as these rules are followed, you can implement hashCode( ) and equals( )
    * any way you want.
    */
   public int hashCode( ){
      int id = 17;
      for (int i = 0; i < this.getLength(); i+=2){
          id = id * 19 + this.getElement(i);

          if(i != this.getLength() - 1){
             id = id % 19 + this.getElement(i+1);
          }
      }

      return id;
   }

   public boolean equals(Point a){
      if(a == null){
         return false;
      }

      if(this.getLength() < a.getLength()){
         int[] temp = new int[a.getLength()];
         for(int i = 0; i < this.getLength(); i++){
            temp[i] = this.getElement(i);
         }

         for(int j = this.getLength() + 1; j < this.getLength(); j++){
            temp[j] = 0;
         }

         for(int k = 0; k < a.getLength(); k++){
            if(temp[k] != a.getElement(k)){
               return false;
            }
         }

         return true;
      }

      else if(this.getLength() > a.getLength()){
         int[] temp2 = new int[this.getLength()];
         for(int k = 0; k < a.getLength(); k++){
            temp2[k] = a.getElement(k);
         }

         for(int v = a.getLength() + 1; v < this.getLength(); v++){
            temp2[v] = 0;
         }

         for(int k = 0; k < this.getLength(); k++){
            if(temp2[k] != this.getElement(k)){
               return false;
            }
         }

         return true;
      }

      for(int i = 0; i < this.getLength(); i++){
         if(this.getElement(i) != a.getElement(i)){
            return false;
         }
      }

      return true;
   }
}
