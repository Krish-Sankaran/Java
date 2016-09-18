/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//comment
/**
 *
 * @author agmo2_000
 */
public class TestSuff {
    int n;
    int a;
    int b;
    int c;
    String answer;
    
    public TestSuff(int count){
        n = count;
        a = 0;
        b = 1;
    }
    
    public void doThings(){
        if (n == 1){
            System.out.print(a + " ");
        }
        else if (n == 2){
            System.out.print(a + " " + b + " ");
        }
        else {
            System.out.print(a + " " + b + " ");
            for(int i = 2; i < n; i++){
                c = a+b;
                a = b;
                b = c;
                System.out.print(c + " ");
            }
        }
    }
    
}
