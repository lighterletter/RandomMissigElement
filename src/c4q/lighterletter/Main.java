package c4q.lighterletter;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

//Random thought: If I'm going to someday be an astronaut I'm going to need to learn how to build a space suit iron man time machine
//soup. I'll need lots of code.

//In the spirit of a true astronaut explorer scientist, I will document and edit my thought process throughout.

public class Main {

    //Okay this is what we're gonna do.
    //We're gonna describe the problem in our own words.
    //We're going to describe the first solution that comes into my head.
    //Then I'm going to slow down and evaluate how I'm going to implement it.

    //Let's begin by defining the problem. The way I see it there are two parts to this problem.
    //Problem Number One: Building an array of 99 random unique elements inside an array with a capacity for 100 elements.
    //Problem Number Two: In this case being integers, sorting and returning the value that's missing.

    //Now each problem has it's own set of sub-problems. This is an attempt to learn how to build and understand complexity.

    //Sub-Problem Number One: Building an array of 99 random unique elements
        //Constraints: All elements must be randomized within index.

    //Now, I'm pretty sure we can solve the rest of this problem by generating a random number within that same range,
    //before or after the loop, and adding it to the end or beginning of the array to create an array with 100 elements
    //99 unique and one duplicate.

    //If we sort this array, the remove the duplicate making sure that when we remove it from either end of the array, we use a bit-shift
    //operation to append it to the left or right of its duplicate and then remove it, by returning the index where we removed
    //the left-shifted duplicate element we will have found the value missing from the 99 random unique numbers within the
    //range of 1-100.

    //Problem solved but we're not finished yet.

    //edge case: If the duplicate is 0 then the missing number is 100.
    //Hurdles: Creating a collection of unique integers within a certain rage 1-100.
        //Sorting that in the most efficient way possible.

    //I thought about implementing this with a linked list, but in this case the linked list will be a lower level
    //implementation of the array we can simply use.

    //I think writing this in java will be quite verbose, (As if this article wasn't) Maybe writing it in Javascript will
    //be a simpler implementation. I'd like to do both.

    //It has taken me from around 1 am to 5:25 am to get to this point. (In writing.)

    // I will write about complexity if I can verify this is a working solution.

    //At this point I think this gives you a complexity of O(n): (without counting thr runtime complexity of creating the random numbers, which
    // I haven't thought about. In any case, creating the 99 random elements and putting them in a list: We can do this
    // in a single for loop  where n == 99.


    //Thoughts, problems I've encountered.
    //P2: Sub-Problem Number two: finding the index of an element within this structure that has no data/
    //solution. using a duplicate and performing a bit-shift.

    /**/

    //epiphany. I'm only diving this deep into the code because It's an interesting and relevant sequence of logical
    //incubation. In other words.. Wat?" I feel like I shouldn't get bogged down with defining it all
    //but I feel like I need to in order to understand complexity. I feel like even though that can seem like an
    //abstraction of communication, writing it down helps me understand what it is my mind is trying to achieve with it's
    //thoughts.



    public static void main(String[] args) {
	// write your code here
        //inititalize array that we'll be working with.
        int[] randArr = new int[100];

        //(after I created the loop I realized I needed variables, one to hold a random integer within the range
        // we need to check if the array contains the number we just generated
        // so that we can generate another if the array already has that value.(recursion)

        // we have to take into account that every element initialized in a set size array will be initialized to zero.

        int randomNum = ThreadLocalRandom.current().nextInt(1,100);
        int contained = 0;

        //we add a random number to the first index of the array to ensure it starts with a random number: This helps us
        //set up the conditions to create our conditional below.
        randArr[0] = randomNum;

        // this would be so simple if only: Set<int> (IntSet.Java)

        for(randArr[randomNum] :  ) //I was trying to create a set and put each item in the array.
        //if successful we'd create duplicate, sort, remove left or right duplicate (just keep track) and return index.
        //this is your missing value.


        //another attempt at doing this through iteration:
        //create loop that we'll iterate through: 100 elements indexed 0-99
        for (int i = 0; i < 99; i++) {
            //generate random number. Stuck here because of required unique value constraint.
                randomNum = ThreadLocalRandom.current().nextInt(1, 101); //<-this is inclusive which is why we use 101


        }



        }
    }


    //Timed myself. Spent 20 minutes simply trying to create a array with random elements. Scratch that. 6 hours 36 minutes
    //still havent made array with 99 unique random elements within range. -_- le sigh. 


        //suposed sort
//    public static int findMissingInt(int[] array){
//
//        int foundNum;
//
//
//
//
//
//
//
//
//
//    }



