/**
  * Created by Administrator on 15/06/2017.
  */
object Main {
  def main(args: Array[String]): Unit = println("hello world")

  //language fundamentals
  var x = 10
  println(x)
  x=11
  println(x)
  x += 1
  println(x)
  x -= 1
  println(x)

  val y = 10
  //y=11

  val z:Double = 10
  println(z)
  val greeting:String = null
  val greeting1: Any = "hello"
  println(greeting)
  println(greeting1)

  val xmax, ymax = 100
  val a0=1
  var b0=3
  val c0= 2.4
  println(xmax, ymax)
  println(a0, b0, c0)

  val (a, b, c) = (5, "Hello", 3.14)
  println(a) //  println(a, b, c)


  //String declarations
  val s1 = "String"
  println(s1)
  val s2 = "My " + s1
  println(s2)
  val s3 = s1 + " " + 100
  println(s3)
  val s4 = 100.toString
  println(s4)
  val s5 =
    """first line
      second line"""
  println(s5)

  //Strings are java.lang.string
  println("".isEmpty())
  println("abc".getBytes)
  println("abc".charAt(2)) // zero index based
  println("abc".length()) // the number of elements

  //Strings are Sea (scala list abstraction)
  println("Hello".intersect("world"))
  println("Hello" intersect "world") //takes common letter, in this case "lo"
  println("aabbbccc".distinct) //doesn't print repeated chars so this gives "abc"
  println("abcde".head) //takes first element
  println("abcde".size) // the number of elements
  println("abcde".reverse) //reverses elements
  println("aBcDe".filter(x => x.isUpper)) //prints upper case
  println("aBcDe".filter(x => x.isLower)) // prints lower case


  //Variable length arrays
  import scala.collection.mutable.ArrayBuffer
  val b2 = ArrayBuffer[Int]()
  b2 +=1
  println(b2)
  b2 += (1,2,3,5) // adding to array buffer
  println(b2)
  b2 ++= Array(8, 13, 21) // ++= adds onto b2 further
  println(b2)
  b2.trimEnd(5) //trims off last 5 elements
  println(b2)
  b2.insert(1, 6)// inserts int at elements outlined in first number. In this case 6 is implemented into position 1
  println(b2)
  b2.insert(2, 7, 8, 9)// puts 7, 8, 9 in array starting at element 2
  println(b2)
  b2.remove(2) //removes element 2
  println(b2)
  b2.remove(2, 3) //removes 3 elements starting from position 2
  println(b2)
  val c2 = b2.toArray
  println("c2=", c2.toBuffer)

  //multi-dimensional arrays
  val matrix = Array.ofDim[Double](3, 4) //3 rows and 4 columns
  println(matrix(2)(3))
  matrix(2)(3) = 42
  println(matrix(2)(3))

  /*Jave to Scal collection conversions
  val list = new ArrayBuffer[String]()
  list.add("abc")
  println(list)
  println(list.)
  list.toBuffer*/

  val map = Map (a -> 10)
  println(map)


  //collections
  val l1 = List(1,2,3)
  println(l1)
  val l2 = List()
  println (l1.isEmpty) //false
  println (l2.isEmpty) //true
  val l3 = List(2,"a")
  println(l3)
  println(l3(1)) //prints element 1 which is A
  val l4 = List(1,-2,3,2,-1,0,3)
  println(l4.sorted) //sorts the list
  println(l4.sorted.reverse)//prints sort in reverse
  println(List("b", "a").sorted) //sorts chars
  //println(List(1,"a").sorted) //cant do different data types
  //println(l4.sortwith((x,y) => x+"" < y+"")) compares 2 elements and sees if left is smaller that right

  //mutable list
  import scala.collection.mutable.ListBuffer
  val lb = ListBuffer.empty[String]
  lb += "a"
  println(lb)
  lb += ("c", "d", "e")
  println(lb)
  lb -= "d"
  println(lb)
  lb++= List("f","g")
  println(lb)

  println(List(1,1,2,2)) // prints 1,1,2,2
  println(Set(1,1,2,2)) // does not print repeated elements
  println(List(1,2,3,4) ++ List(3,4,5,6))
  println(Set(1,2,3,4)++ Set(3,4,5,6))
  println(Set(1,2,3) == Set(3,1,2))
  println(List(1,2,3) == List(3,1,2))
  println(Set(1,2,3) + 2)
  println(Set(1,2,3,4,5).toList)
  println(Set(5,4,3,2,1).toList)









}

