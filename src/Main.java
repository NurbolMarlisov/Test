public class Main {
    public static void main(String[] args) {
String [] words = {"java ","kotlin", "python", "javascript", "nodejs", "go", "react", "react native", "swift", "dart"};
boolean hasAndroid = false;
for (String word : words){
if(word.contains("android")){
    hasAndroid = true;
    break;
    }
   }
if(hasAndroid){
    System.out.println("Массив содержит слово android");
}else {
    System.out.println("Массив не содержит слово android");
}
    }
}