/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * Program: Assignment 5 Super Calculator 
 * Input: Coordinates of two lines and numbers that need to be compared/need info about
 * Processing: Slopes, distance, y-intersects, midpoints, and point of intersection are being calculated in Linear Equations. Numbers are being compared and used for simple calculations in Number Fun. 
 * Output: Slope, distance, midpoint, and equation of first line and point of intersection between both lines in Linear Equations. Whether a number is a factor of another, whether a number is odd, even, positive, negative, or zero, and the highest of five input numbers are output in Number Fun.
 *
 */
//Import Statements Listed Alphabetically
import java.io.*;           //used for any type of input or output
import java.util.*;         //useful utilities like Scanner
import java.text.*;
import hsa.Console;
import hsa.*;
import java.awt.Color;

/**
 *
 * @author 073853186
 */
public class SuperCalcParts4and5 {
    
    public static void main(String[] args) {

        //FIRST WRITE YOUR PSEUDOCODE USING COMMENTS, THEN FILL IN WITH CODE
        System.out.println("Starting...");
        Console d = new Console(150, 80);
        //go to asciiArt method
        asciiArt(d);
        //go to mainMenu method
        mainMenu(d);    
    }
    
    public static void asciiArt(Console d){
        //printing ascii art (output)
        d.println("                                                                     _______   ");
        d.println("                                                                   LLLLLLLLLLL ");
        d.println("                                                               __LLLLLLLLLLLLLL");
        d.println("                                                              LLLLLLLLLLLLLLLLL");
        d.println("                                                            _LLLLLLLLLLLLLLLLLL");
        d.println("                                                           LLLLLLLLLLLLLLLLLLLL");
        d.println("                                                         _LLLLLLLLLLLLLLLLLLLLL");
        d.println("                   Emily Anas                            LLLLLLLLLLLLLLLLLLLLLL");
        d.println("                                                 L     _LLLLLLLLLLLLLLLLLLLLLLL");
        d.println("                                                LL     LLLLLL~~~LLLLLLLLLLLLLL ");
        d.println("                                               _L    _LLLLL      LLLLLLLLLLLLL ");
        d.println("                                               L~    LLL~        LLLLLLLLLLLLL ");
        d.println("                                              LL   _LLL        _LL   LLLLLLLL  ");
        d.println("                                             LL    LL~         ~~     ~LLLLLL  ");
        d.println("                                             L   _LLL_LLLL___         _LLLLLL  ");
        d.println("                                            LL  LLLLLLLLLLLLLL      LLLLLLLL   ");
        d.println("                                            L  LLLLLLLLLLLLLLL        LLLLLL   ");
        d.println("                                           LL LLLLLLLLLLLLLLLL        LLLLL~   ");
        d.println("                     LLLLLLLL_______       L _LLLLLLLLLLLLLLLL     LLLLLLLL    ");
        d.println("                            ~~~~~~~LLLLLLLLLLLLLLLLLLLLLLLLL~       LLLLLL     ");
        d.println("                          ______________LLL  LLLLLLLLLLLLLL ______LLLLLLLLL_   ");
        d.println("                      LLLLLLLLLLLLLLLLLLLL  LLLLLLLL~~LLLLLLL~~~~~~   ~LLLLLL  ");
        d.println("                ___LLLLLLLLLL __LLLLLLLLLLLLL LLLLLLLLLLLLL____       _LLLLLL_ ");
        d.println("             LLLLLLLLLLL~~   LLLLLLLLLLLLLLL   LLLLLLLLLLLLLLLLLL     ~~~LLLLL ");
        d.println("         __LLLLLLLLLLL     _LLLLLLLLLLLLLLLLL_  LLLLLLLLLLLLLLLLLL_       LLLLL");
        d.println("        LLLLLLLLLLL~       LLLLLLLLLLLLLLLLLLL   ~L ~~LLLLLLLLLLLLL      LLLLLL");
        d.println("      _LLLLLLLLLLLL       LLLLLLLLLLLLLLLLLLLLL_  LL      LLLLLLLLL   LLLLLLLLL");
        d.println("     LLLLLLLLLLLLL        LLLLLLLLLLLLL~LLLLLL~L   LL       ~~~~~       ~LLLLLL");
        d.println("    LLLLLLLLLLLLLLL__L    LLLLLLLLLLLL_LLLLLLL LL_  LL_            _     LLLLLL");
        d.println("   LLLLLLLLLLLLLLLLL~     ~LLLLLLLL~~LLLLLLLL   ~L  ~LLLL          ~L   LLLLLL~");
        d.println("   LLLLLLLLLLLLLLLL               _LLLLLLLLLL    LL  LLLLLLL___     LLLLLLLLLL ");
        d.println("   LLLLLLLLLLLLLLLL              LL~LLLLLLLL~     LL  LLLLLLLLLLLL   LLLLLLL~  ");
        d.println("   LLLLLLLLLLLLLLLL_  __L       _L  LLLLLLLL      LLL_ LLLLLLLLLLLLLLLLLLLLL   ");
        d.println("    LLLLLLLLLLLLLLLLLLLL        L~  LLLLLLLL      LLLLLLL~LLLLLLLLLLLLLLLL~    ");
        d.println("     LLLLLLLLLLLLLLLLLLLL___L_ LL   LLLLLLL       LLLL     LLLLLLLLLLLLLL      ");
        d.println("      ~~LLLLLLLLLLLLLLLLLLLLLLLL     LLLLL~      LLLLL        ~~~~~~~~~        ");
        d.println("              LLLLLLLLLLLLLLLLLL_ _   LLL       _LLLLL                         ");
        d.println("                  ~~~~~~LLLLLLLLLL~             LLLLLL                         ");
        d.println("                            LLLLL              _LLLLLL                         ");
        d.println("                            LLLLL    L     L   LLLLLLL                         ");
        d.println("                             LLLLL__LL    _L__LLLLLLLL                         ");
        d.println("                             LLLLLLLLLL  LLLLLLLLLLLL                          ");
        d.println("                              LLLLLLLLLLLLLLLLLLLLLL                           ");
        d.println("                               ~LLLLLLLLLLLLLLLLL~~                            ");
        d.println("                                  LLLLLLLLLLLLL                                ");
        d.println("                                    ~~~~~~~~~                                  ");
        d.getChar();
        d.clear();
        //printing colourful ascii art (output)
        d.setTextColor(Color.red);
        d.println("                                                                     _______   ");
        d.println("                                                                   LLLLLLLLLLL ");
        d.println("                                                               __LLLLLLLLLLLLLL");
        d.println("                                                              LLLLLLLLLLLLLLLLL");
        d.println("                                                            _LLLLLLLLLLLLLLLLLL");
        d.println("                                                           LLLLLLLLLLLLLLLLLLLL");
        d.println("                                                         _LLLLLLLLLLLLLLLLLLLLL");
        d.setTextColor(Color.orange);
        d.println("                   Emily Anas                            LLLLLLLLLLLLLLLLLLLLLL");
        d.println("                                                 L     _LLLLLLLLLLLLLLLLLLLLLLL");
        d.println("                                                LL     LLLLLL~~~LLLLLLLLLLLLLL ");
        d.println("                                               _L    _LLLLL      LLLLLLLLLLLLL ");
        d.println("                                               L~    LLL~        LLLLLLLLLLLLL ");
        d.println("                                              LL   _LLL        _LL   LLLLLLLL  ");
        d.setTextColor(Color.yellow);
        d.println("                                             LL    LL~         ~~     ~LLLLLL  ");
        d.println("                                             L   _LLL_LLLL___         _LLLLLL  ");
        d.println("                                            LL  LLLLLLLLLLLLLL      LLLLLLLL   ");
        d.println("                                            L  LLLLLLLLLLLLLLL        LLLLLL   ");
        d.println("                                           LL LLLLLLLLLLLLLLLL        LLLLL~   ");
        d.println("                     LLLLLLLL_______       L _LLLLLLLLLLLLLLLL     LLLLLLLL    ");
        d.setTextColor(Color.green);
        d.println("                            ~~~~~~~LLLLLLLLLLLLLLLLLLLLLLLLL~       LLLLLL     ");
        d.println("                          ______________LLL  LLLLLLLLLLLLLL ______LLLLLLLLL_   ");
        d.println("                      LLLLLLLLLLLLLLLLLLLL  LLLLLLLL~~LLLLLLL~~~~~~   ~LLLLLL  ");
        d.println("                ___LLLLLLLLLL __LLLLLLLLLLLLL LLLLLLLLLLLLL____       _LLLLLL_ ");
        d.println("             LLLLLLLLLLL~~   LLLLLLLLLLLLLLL   LLLLLLLLLLLLLLLLLL     ~~~LLLLL ");
        d.println("         __LLLLLLLLLLL     _LLLLLLLLLLLLLLLLL_  LLLLLLLLLLLLLLLLLL_       LLLLL");
        d.println("        LLLLLLLLLLL~       LLLLLLLLLLLLLLLLLLL   ~L ~~LLLLLLLLLLLLL      LLLLLL");
        d.setTextColor(Color.cyan);
        d.println("      _LLLLLLLLLLLL       LLLLLLLLLLLLLLLLLLLLL_  LL      LLLLLLLLL   LLLLLLLLL");
        d.println("     LLLLLLLLLLLLL        LLLLLLLLLLLLL~LLLLLL~L   LL       ~~~~~       ~LLLLLL");
        d.println("    LLLLLLLLLLLLLLL__L    LLLLLLLLLLLL_LLLLLLL LL_  LL_            _     LLLLLL");
        d.println("   LLLLLLLLLLLLLLLLL~     ~LLLLLLLL~~LLLLLLLL   ~L  ~LLLL          ~L   LLLLLL~");
        d.println("   LLLLLLLLLLLLLLLL               _LLLLLLLLLL    LL  LLLLLLL___     LLLLLLLLLL ");
        d.println("   LLLLLLLLLLLLLLLL              LL~LLLLLLLL~     LL  LLLLLLLLLLLL   LLLLLLL~  ");
        d.println("   LLLLLLLLLLLLLLLL_  __L       _L  LLLLLLLL      LLL_ LLLLLLLLLLLLLLLLLLLLL   ");
         d.setTextColor(Color.blue);
        d.println("    LLLLLLLLLLLLLLLLLLLL        L~  LLLLLLLL      LLLLLLL~LLLLLLLLLLLLLLLL~    ");
        d.println("     LLLLLLLLLLLLLLLLLLLL___L_ LL   LLLLLLL       LLLL     LLLLLLLLLLLLLL      ");
        d.println("      ~~LLLLLLLLLLLLLLLLLLLLLLLL     LLLLL~      LLLLL        ~~~~~~~~~        ");
        d.println("              LLLLLLLLLLLLLLLLLL_ _   LLL       _LLLLL                         ");
        d.println("                  ~~~~~~LLLLLLLLLL~             LLLLLL                         ");
        d.println("                            LLLLL              _LLLLLL                         ");
         d.setTextColor(Color.magenta);
        d.println("                            LLLLL    L     L   LLLLLLL                         ");
        d.println("                             LLLLL__LL    _L__LLLLLLLL                         ");
        d.println("                             LLLLLLLLLL  LLLLLLLLLLLL                          ");
        d.println("                              LLLLLLLLLLLLLLLLLLLLLL                           ");
        d.println("                               ~LLLLLLLLLLLLLLLLL~~                            ");
        d.println("                                  LLLLLLLLLLLLL                                ");
        d.println("                                    ~~~~~~~~~                                  ");
        d.getChar();
        d.clear();
        //changing program text colour back to black
        d.setTextColor(Color.black);
    }
    
    public static void mainMenu(Console d){
    //printing out super calculator menu
        d.println("Welcome to Super Calculator! Please select one of the numerical options below: ");
        d.println(" ");
        d.println("1) Linear Equations");
        d.println("2) Boolean Logic");
        d.println("3) Number Fun");
        d.println("4) Word Math");
        d.println("5) Quadratic Equations");
        d.println("6) Statistics");
        //read selection integer (input)
        int selection;
        selection = d.readInt();
        //tells computer which method to choose (program to run) or text to display based on selection
        switch (selection) {
            case 1: d.clear(); linearEquations(d);break;
            case 2: d.clear(); d.println("Coming soon!");break;
            case 3: d.clear(); numberFun(d); break;
            case 4: d.clear(); d.println("Coming soon!");break;
            case 5: d.clear(); d.println("Coming soon!");break;
            case 6: d.clear(); d.println("Coming soon!");break;
            default: d.clear(); d.println("Invalid entry");break;
        }
    }
    
    //method that runs the Linear Equations program
    public static void linearEquations(Console d){
    //output text that asks reader to input their line's coordinate points in a certain order
    d.println("Please enter the coordinate points of a line in this order: x1, y1, x2, y2");
    //declaration of coordinate points of both lines
    double x1,y1,x2,y2,x3,y3,x4,y4;
    //reading of first set of coordinate points that have been input
    x1 = d.readDouble();
    y1 = d.readDouble();
    x2 = d.readDouble();
    y2 = d.readDouble();
    //declaration of equations retrieved from methods
    double slope = calculateSlope(x1,x2,y1,y2);
    double distance = calculateDistance(x1,x2,y1,y2);
    double yint = calculateYInt(x1,x2,y1,y2);
    double xMidpoint = calculateXMidpoint(x1,x2);
    double yMidpoint = calculateYMidpoint(y1,y2);
    //allows doubles to be rounded to 2 decimal places
    DecimalFormat df = new DecimalFormat("#.##");
    d.clear();
    //outputs slope, distance, equation of the line, and midpoint (information received from methods)
    d.println("Equations for points ("+x1+", "+y1+") and ("+x2+", "+y2+"):");
    d.println(" ");
    d.println("Slope of Line: The slope of the given line is "+slope);
    d.println("Distance between Points: "+distance);
    d.print("Equation of Line: The equation of the line is: y="+(df.format(slope))+"x+("+df.format(yint)+")");
    d.println(" ");
    d.print("Midpoint: The midpoint of the line segment is: ("+df.format(xMidpoint)+", "+df.format(yMidpoint)+")");
    d.println("  ");
    d.println("  ");
    d.println("(Please press any character to continue)");
    d.getChar();
    d.clear();
    //text output asks user to enter coordinate points of another line
    d.println("Please enter the coordinate points of another line in this order: x3, y3, x4, y4");
    //reading of new coordinate points
    x3 = d.readDouble();
    y3 = d.readDouble();
    x4 = d.readDouble();
    y4 = d.readDouble();
    //declaration of equations retrieved from methods
    double slope2 = calculateSlope2(x3,x4,y3,y4);
    double yint2 = calculateYInt2(x3,x4,y3,y4);
    double xIntersect = calculateXIntersect(slope,slope2,yint,yint2);
    double yIntersect = calculateYInteresect(slope,yint,xIntersect);
    d.clear();
    //output of point of intersection of both lines (rounded to 2 decimal points)
    d.println("The point of intersection between y="+df.format(slope)+"x+("+df.format(yint)+") and y="+df.format(slope2)+"x+("+df.format(yint2)+") is: ");
    d.println("("+df.format(xIntersect)+", "+df.format(yIntersect)+")");
    d.println(" ");
    d.println("(Note: Point of intersection is rounded to a maximum of 2 decimal points)");
    }
    
    //method that calculates the slope of the first line
    public static double calculateSlope(double x1, double x2, double y1, double y2){
    //tells method what information it needs/will use (coordinate points)
    double slope = (y2-y1)/(x2-x1);
    //numerical calculation of slope (processing)
    return slope;
    //the method returns a double: the slope
    }
    
    //method that calculates the distance of the first line
    public static double calculateDistance(double x1, double x2, double y1, double y2){
    double distance = Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
    return distance;
    }

    //method that calculates the y-intercept of the first line
    public static double calculateYInt(double x1, double x2, double y1, double y2){
    double slope = calculateSlope(x1,x2,y1,y2);
    double yint = y1-slope*x1;
    return yint;
    }
   
    //method that calculates the x-midpoint of the first line
    public static double calculateXMidpoint(double x1, double x2){
    double xMidpoint = ((x1+x2)/2);
    return xMidpoint;
    }
    
    //method that calculates the y-midpoint of the first line
    public static double calculateYMidpoint(double y1, double y2){
    double yMidpoint = ((y1+y2)/2);
    return yMidpoint;
    }
    
    //method that calculates the slope of the second line
    public static double calculateSlope2(double x3, double x4, double y3, double y4){
    double slope2 = (y4-y3)/(x4-x3);
    return slope2;
    }

    //method that calculates the y-intercept of the second line
    public static double calculateYInt2(double x3, double x4, double y3, double y4){
    double slope = calculateSlope(x3,x4,y3,y4);
    double yint2 = y3-slope*x3;
    return yint2;
    }
    
    //method that calculates the x point of intersection of the 2 lines
    public static double calculateXIntersect(double slope,double slope2, double yint, double yint2){
        double xIntersect = ((yint2-yint)/(slope-slope2));
        return xIntersect;
    }
    
    //method that calculates the y point of intersection of the 2 lines
    public static double calculateYInteresect(double slope, double XIntersect, double yint){
        double YIntersect = (slope*XIntersect)+yint;
        return YIntersect;
    }

    //method that runs the Number Fun program
    public static void numberFun(Console d){
        //text output asks user to choose one of the options/programs listed below
        d.println("Welcome to Number Fun! Please choose one of the numerical options below:");
        d.println("1) Factors");
        d.println("2) Odd or Even");
        d.println("3) Positive/Negative");
        d.println("4) Highest Number");
        //declaration and reading of selection (choice) integer
        int choice = d.readInt();
        //tells java which method (program) to run based off of the user's selection
        switch (choice){
            case 1: d.clear(); factors(d); break;
            case 2: d.clear(); oddOrEven(d); break;
            case 3: d.clear(); positiveNegative(d); break;
            case 4: d.clear(); highestNumber(d); break;
        }
    }
    
    //method that runs the Factors program which determines whether a number is a factor of another
    public static void factors(Console d){
        //output that asks user for a number and a possible factor
        d.println("Welcome to factors! Please enter a number you would like to divide and a second number to see whether or not the second number is a factor of the first.");
        //declaration and reading of numbers entered by user
        int a = d.readInt();
        int b = d.readInt();
        //if the remainder of the first number divided by the second equals 0, then the program tells the user that the second number is a factor
        if (a % b == 0){
            d.println(" ");
            d.println("Yes, "+a+" is divisible by "+b+".");
        }
        //if the remainder does not equal 0, text output tells user that the second number is not a factor
        else{
            d.println(" ");
            d.println("No, "+a+" is not divisible by "+b+".");
        }
        d.println(" ");
        d.println("(Please select any character to continue)");
        d.getChar();
        d.clear();
        //lets user choose which menu to return to 
        d.println("Press 1 if you would like to go back to the Number Fun menu");
        d.println("Press 2 if you would like to go back to the Super Calculator main menu.");
        //declaration and reading of reader's selection
        int menuSelection = d.readInt();
        //tells java which method to choose based off of the selection variable
        switch (menuSelection){
            case 1: d.clear(); numberFun(d); break;
            case 2: d.clear(); mainMenu(d); break;
        }
    }
    
    //method that runs the program that determines whether a number is odd or even
    public static void oddOrEven(Console d){
        //output asking user for number (input) to find out whether it is odd or even
        d.println("Welcome to Odd or Even! Please enter a number to find out whether it is odd or even.");
        //declaration and reading of number
        int number = d.readInt();
        //if the number is even, the program will output that the number entered is even
        if (number%2 == 0){
            d.clear();
            d.println("The number "+number+" is even.");
        }
        //if the number is odd, the program will output that the number entered is odd
        else{
            d.clear();
            d.println("The number "+number+" is odd.");
        }
        d.println(" ");
        d.println("(Please select any character to continue)");
        d.getChar();
        d.clear();
        //lets user choose which menu to return to 
        d.println("Press 1 if you would like to go back to the Number Fun menu");
        d.println("Press 2 if you would like to go back to the Super Calculator main menu.");
        //declaration and reading of reader's selection
        int menuSelection = d.readInt();
        //tells java which method to choose based off of the selection variable
        switch (menuSelection){
            case 1: d.clear(); numberFun(d); break;
            case 2: d.clear(); mainMenu(d); break;
        }
    }
    
    //method that runs the Positive/Negative method that determines whether the number is positive, negative, or zero
    public static void positiveNegative(Console d){
    //asking user to enter a number to find out whether it is positive, negative, or zero
    d.println("Please enter a number to find out whether it is positive, negative, or zero.");
    //declaration and reading of the number the user entered
    int number = d.readInt();
    //if the number is greater than 0, the program will output that it is positive
    if (number>0){
        d.clear();
        d.println("The number "+number+" is positive.");
    }
    //if the program is smaller than 0, the program will output that it is negative
    else if(number<0){
        d.clear();
        d.println("The number "+number+" is negative.");
    }
    //if the number entered is 0, then the program will output that the number is 0
    else{
        d.clear();
        d.println("The number "+number+" is zero.");
    }
    d.println(" ");
        d.println("(Please select any character to continue)");
        d.getChar();
        d.clear();
        //lets user choose which menu to return to 
        d.println("Press 1 if you would like to go back to the Number Fun menu");
        d.println("Press 2 if you would like to go back to the Super Calculator main menu.");
        //declaration and reading of reader's selection
        int menuSelection = d.readInt();
        //tells java which method to choose based off of the selection variable
        switch (menuSelection){
            case 1: d.clear(); numberFun(d); break;
            case 2: d.clear(); mainMenu(d); break;
        }
    }
    
    //method that runs the Highest Number program that determines the highest number from the input
    public static void highestNumber(Console d){
        //asks user to input five numbers that they would like to compare to find the highest one
        d.println("Please enter five numbers to learn which number is the highest.");
        //declaration and reading of 5 numbers entered
        int a = d.readInt();
        int b = d.readInt();
        int c = d.readInt();
        int e = d.readInt();
        int f = d.readInt();
        //if a is the highest number, the program will output that the first number is the highest number
        if (a>b && a>c && a>e && a>f){
            d.println(" ");
            d.println("The highest number is "+a+".");
        }
        //if b is the highest number, the program will output that the second number is the highest number
        else if (b>a && b>c && b>e && b>f){
            d.println(" ");
            d.println("The highest number is "+b+".");
        }
        //if c is the highest number, the program will output that the third number is the highest number
        else if (c>a && c>b && c>e && c>f){
            d.println(" ");
            d.println("The highest number is "+c+".");
        }
        //if e is the highest number, the program will output that the fourth number is the highest number
        else if (e>a && e>b && e>c && e>f){
            d.println(" ");
            d.println("The highest number is "+e+".");
        }
        //if e is the highest number, the program will output that the fifth number is the highest number
        else if (f>a && f>b && f>c && f>e){
            d.println(" ");
            d.println("The highest number is "+e+".");
        }
        //tells user that they messed up
        else {
            d.println(" ");
            d.println("Invalid entry");
        }
        d.println(" ");
        d.println("(Please select any character to continue)");
        d.getChar();
        d.clear();
        //lets user choose which menu to return to 
        d.println("Press 1 if you would like to go back to the Number Fun menu");
        d.println("Press 2 if you would like to go back to the Super Calculator main menu.");
        //declaration and reading of reader's selection
        int menuSelection = d.readInt();
        //tells java which method to choose based off of the selection variable
        switch (menuSelection){
            case 1: d.clear(); numberFun(d); break;
            case 2: d.clear(); mainMenu(d); break;
        }
    }
}
