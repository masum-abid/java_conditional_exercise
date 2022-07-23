//Problem 3:4
//Find out how many images are in the given array: ["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]

public class fileExtension {
    public static void main(String[] args){
      String[] data = {"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};
      int count = 0;
      for( String result : data){      
        if(result.contains(".jpg")  || result.contains(".png") ){
          count += 1;
        }
      }
      System.out.println("The total number of image file is " + count);
  
    }
  }