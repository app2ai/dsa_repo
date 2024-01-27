package com.toffee.dsastudy.patterns

/*
Created By: Vishal Rana
Remember -> Every Patterns u can consider as MATRIX
*/


fun main() {
    val obj = Patterns()
    obj.pattern3(5)
}
class Patterns {
    fun pattern1(n: Int){
    /*  n= 5
        * * * * *
        * * * *
        * * *
        * *
        *
    */
        // num of row = num of times outer loop will run
        for (row in 0..<n){
            // for each row how many columns are there: here 1st row = 5 cols, 2nd row = 4 cols ....
            var col = n-row
            while (col > 0){
                print("* ")
                col--
            }
            println()
        }
    }

    fun pattern2(n: Int){
        /*      n = 5
                *
                * *
                * * *
                * * * *
                * * * * *
                * * * *
                * * *
                * *
                *
        */
        // run outer loop = num of rows
        for (row in 1..<n*2){
            var col = if (row > n) 2*n - row  else row
            while (col > 0){
                print("* ")
                col--
            }
            println()
        }
    }

    fun pattern3(n: Int){
        /*      n = 5
                 *
               * * *
             * * * * *
           * * * * * * *
         * * * * * * * * *
           * * * * * * *
             * * * * *
               * * *
                 *
        */
        // Space should be equal to that of star and one space i.e " " == " *"
        // row vs col-> 1-1,2-3,3-5,4-7,5-9,6-7,7-5,8-3,9-1
        for (row in 1..n*2){
            var spaces = if (row>n) row-n else n-row
            while (spaces>0){
                print("  ")
                spaces--
            }
            var col = if (row>n) 3*n-2*row+4 else 2*row-1
            while (col>=1){
                print(" *")
                col--
            }
            println()
        }
    }

    fun pattern4(n: Int){
    /*
                *
              * *
            * * *
          * * * *
        * * * * *
    */
        for (row in 1..n){
            var space = n-row
            while (space > 0){
                print("  ") // Space should be equal to that of star and one space i.e "  " == " *" or " "=="*"
                space--
            }
            var col = row
            while (col>=1){
                print(" *")
                col--
            }
            println()
        }
    }

    fun pattern5(n: Int){

    }
}
