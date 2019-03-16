import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test {

/** 请完成下面这个函数，实现题目要求的功能 **/
 /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    public static int process(int width, int[] modules,int module_size) {
        int row=0,i=0;
        for(i=0;i<module_size;i++){
          if(modules[i]+modules[i+1]>width){
            row++;
          }
          else{
            row++;
            i++;
          }
        }
        return row;

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;
            
        int _width;
        _width = Integer.parseInt(in.nextLine().trim());
        
        int _modules_size = 0;
        _modules_size = Integer.parseInt(in.nextLine().trim());
        int[] _modules = new int[_modules_size];
        int _modules_item;
        for(int _modules_i = 0; _modules_i < _modules_size; _modules_i++) {
            _modules_item = Integer.parseInt(in.nextLine().trim());
            _modules[_modules_i] = _modules_item;
        }
        in.close();
        res = process(_width, _modules,_modules_size);
        System.out.println(String.valueOf(res));    

    }
}