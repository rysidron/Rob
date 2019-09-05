// R1.7

//public class Test {
//  public static void main(String[] args) {
//    System.out.println("39 + 3");
//    System.out.println(39 + 3);
//  } 
//}

// 39 + 3 , 42

// R1.8
//public class Test {
// public static void main(String[] args) {
//    System.out.println("Hello");
//    System.out.println("World");
//  } 
//}
// Hello
// World

// R1.9
//public class Test
//{
 // public static void main(String[] args)
  //{
   // System.out.println("Hello", "World!");
  //}
//}

// Error: no suitable method found for println(java.lang.String,java.lang.String)
//    method java.io.PrintStream.println() is not applicable
//      (actual and formal argument lists differ in length)
    
// E1.8

//public class Test
//{
//  public static void main(String[] args)
//  {
//    System.out.println("   /////");
//    System.out.println("   *****");
//    System.out.println(" +      +");
//    System.out.println("(|  O O  |)");
//    System.out.println(" |   ^   |");
//    System.out.println(" |  '-'  |");
//    System.out.println(" +-------+");                        
//  }
//}

// E1.15

//import javax.swing.JOptionPane;
//
//public class Test
//{
//  public static void main(String[] args)
//  {
//    JOptionPane.showMessageDialog(null, "Hello, Rob!");
//  }
//}

// E1.16

//import javax.swing.JOptionPane;
//
//public class Test
//{
//  public static void main(String[] args)
//  {
//    String name = JOptionPane.showInputDialog("What is your name?");
//    System.out.println("Hello, "+name +"!");
//  }
//}

// E1.17

//import javax.swing.JOptionPane;
//
//public class Test
//{
//  public static void main(String[] args)
//  {
//    String name = JOptionPane.showInputDialog("What is your name?");
//    System.out.println("Hello, "+name +"!");
//    JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
//    System.out.println("Im sorry, "+name +". I'm afrid I can't do that.");                        
//  }
//}

// E1.18

//import java.net.URL;
//import javax.swing.ImageIcon;
//import javax.swing.JOptionPane;
//
//public class Test
//{
//  public static void main(String[] args) throws Exception
//  {
//    URL imageLocation = new URL(
//          "https://www.rallys.com/wp-content/themes/checkers/img/rallys_logo.png");
//    JOptionPane.showMessageDialog(null, "Howdy", "Title",
//          JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
//  }
//}

// R2.5

//public class Test
//{
//  public static void main(String[] args)
//  {
//    int mystery = 1;
//    mystery = 1 - 2 * mystery;
//    mystery = mystery + 1;
//    System.out.println(mystery);
//  }
//}
// 0

// R2.6

//public class Test
//{
//  public static void main(String[] args)
//  {
//    int mystery = 1;
//    mystery = mystery + 1;
//    int mystery = 1 - 2 * mystery;
//    System.out.println(mystery);
//  }
//}

// Error: variable mystery is already defined in method main(java.lang.String[])

import java.math.BigDecimal;

//public class Test
//{
//  public static void main(String[] args)
//  {
//    System.out.println(1 + 2);
//    BigDecimal a, b;
//    a = new BigDecimal("1");
//    b = new BigDecimal("2");
//    System.out.println(a.add(b));
//  }
//}

//public class Test
//{
//  public static void main(String[] args)
//  {
//    System.out.println(2 * 3);
//    BigDecimal a, b;
//    a = new BigDecimal("2");
//    b = new BigDecimal("3");
//    System.out.println(a.multiply(b));
//  }
//}

//public class Test
//{
//  public static void main(String[] args)
//  {
//    System.out.println(1 - (2 -(3 - 4)));
//    BigDecimal a, b, c, d;
//    a = new BigDecimal("1");
//    b = new BigDecimal("2");
//    c = new BigDecimal("3");
//    d = new BigDecimal("4");
//    System.out.println(a.subtract(b.subtract(c.subtract(d))));
//  }
//}

//public class Test
//{
//  public static void main(String[] args)
//  {
//    System.out.println(1 - 2 - 3 - 4);
//    BigDecimal a, b, c, d;
//    a = new BigDecimal("1");
//    b = new BigDecimal("2");
//    c = new BigDecimal("3");
//    d = new BigDecimal("4");
//    System.out.println(a.subtract(b).subtract(c).subtract(d));
//  }
//}

public class Test
{
  public static void main(String[] args)
  {
    System.out.println(2 * 3 - 4 * 5);
    BigDecimal a, b, c, d;
    a = new BigDecimal("2");
    b = new BigDecimal("3");
    c = new BigDecimal("4");
    d = new BigDecimal("5");
    System.out.println(a.multiply(b).subtract(c).multiply(d));
  }
}

















