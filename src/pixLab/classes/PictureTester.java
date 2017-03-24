package pixLab.classes;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Todd Williamson
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture koala = new Picture("koala.jpg");
	  koala.explore();
	  koala.mirrorVerticalRightToLeft();
	  koala.explore();
	  koala.zeroBlue();
	  koala.explore();
  }
  
  public static void testMirrorHorizontalBottomToTop()
  {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.explore();
	  snowman.mirrorHorizantalBottomToTop();
	  snowman.explore();
	  snowman.zeroBlue();
	  snowman.explore();
  }
  
  public static void testMirrorGull()
  {
	  //seagull at ~230, ~235
	  Picture seagull = new Picture("seagull.jpg");
	  seagull.explore();
	  seagull.copyGull();
	  seagull.explore();
  }
  
  public static void testRandomize()
  {
	  Picture moon = new Picture("moon-surface.jpg");
	  moon.explore();
	  moon.copyGull();
	  moon.edgeDetection2(15);
	  moon.fullRandomRed();
	  moon.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.explore();
  }
  
  public static void testMirrorDiagonal()
  {
	  Picture seagull = new Picture("seagull.jpg");
	  //Picture koala = new Picture("koala.jpg");
	  seagull.explore();
	  seagull.mirrorDiagonal();
	  seagull.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.edgeDetection2(15);
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testSeganography()
  {
	  Picture message = new Picture("msg.jpg");
	  message.seganography();
	  message.explore();
  }
  
  public static void testValentine()
  {
	  Picture heart = new Picture("netflixh.jpg");
	  heart.valentinePic();
	  heart.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	//testRandomize();
	  testSeganography();
	//testValentine();
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontalBottomToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}