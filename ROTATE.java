/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotate;

/**
 *
 * @author aseel
 */
public class ROTATE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] original = {{1,2,3} , {4,5,6} , {7,8,9}};
        int [][] result = rotate(original);
        print(original);
        print(result);
    }
    static int [][] rotate( int [][] o){
        int [][]result = new int[3][3];
        
        for( int i = 0 ; i < o[i].length ; i++){
            
                int k = 0;
            for( int j = o.length-1 ; j >= 0 ; j--){
                result[i][k] = o[j][i];
                k++;
            }
            System.out.println();
            if( i == o.length-1 )
                break;
        }
        
        return result;
    }
    
    static void print(int [][] a){
        
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                System.out.print(a[i][j]+"  ");
            
            }
            System.out.println();
        }
        System.out.println("--------");
    }
    
}
