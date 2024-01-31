

import java.util.HashMap;
import java.util.*;
public class Solution1 {
        public int[] Twosum(int[] A, int target) {
            int N = A.length;
            int[] out= new int[2];

            Map <Integer, Integer> map = new HashMap <>();
            for( int i=0 ; i<N; i++)
            {
                int b = target - A[i];
                if(map.containsKey(b))
                {
                    out[0] = map.get(b);
                    out[1] = i;
                    return out;
                }
                else
                {
                    map.put(i,A[i]);
                }
            }
            return out;
        }
     public static void main(String[] args){
         Solution1 b = new Solution1 ();
         int A[] ={ 2,7,11,15};
          int target = 9;
         int[] out =  b.Twosum( A, target);
         if( out != null)
         {
             System.out.println("There the the two indices " +A[0]+" ,"+A[1] );
         }
         else
         {
             System.out.println( "None" );
         }
     }

    }

