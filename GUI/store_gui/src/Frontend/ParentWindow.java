/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Frontend;

/**
 *
 * @author 20127
 */
public class ParentWindow {
    private static Object parent = null;
    public ParentWindow(){
        
    }
    public static void setParentWindow(Object parent1){
        parent = parent1;
    }
    public static Object getParentWindow(){
        return parent;
    }
}
