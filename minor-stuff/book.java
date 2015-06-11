public class Drawbook {
       public static final int SUB_HEIGHT = 10;
       public static void main(String[] args) {
              drawTopline ();
              drawCover ();
              drawCenterline ();
              drawSpine ();
              drawBottomline ();
       }
      
       //this is the cover
       public static void drawCover() {
              for (int line = 1; line <= (SUB_HEIGHT ); line++){
              for (int j =1; j <=((1+( SUB_HEIGHT ))-line); j++){
              System. out .print(" ");
              }
              System. out .print("/");
              for (int b =1; b <=(( SUB_HEIGHT )-line); b++){
              System. out .print("   ");
              }
              System. out .print("___/");
              for (int h =2; h <=line; h++){
              System. out .print("__/");
              }
              for (int j =2; j <=line; j++){
              System. out .print("/");
              }
              System. out .println();
 
              }
       }
       //this is the top indented line
       public static void drawTopline() {
              for (int i=1; i <=(1+(SUB_HEIGHT )); i++)
              System. out .print(" ");
              System. out .print("+");
              for (int i=1; i <= (3* SUB_HEIGHT ); i++)
              System. out .print("-");
              System. out .print("+");
              System. out .println();
       }
 
       // this is the center line with the /'s
       public static void drawCenterline() {
              System. out .print("+");
              for (int i=1; i <= (3* SUB_HEIGHT ); i++) {
                     System. out .print("-");
              }
             
              System. out .print("+");
              for (int i=1; i <= (SUB_HEIGHT ); i++) {
                     System. out .print("/");
              }
             
              System. out .println();
       }
 
       //this is the spine
       public static void drawSpine() {
              int k = 0;
              k = k + 2;          
              for (int line = 1; line <= ((SUB_HEIGHT/2 )); line++){
              System. out .print("|");
              for (int j=1; j<=((SUB_HEIGHT*3 - 21)/2); j++){
              System. out .print(" ");
              }
              System. out .print("Building Java Programs");
              for (int j=1; j<=((SUB_HEIGHT*3- 22)/2); j++){
              System. out .print(" ");
              }
              System. out .print("|");
              for (int j =1; j <=((SUB_HEIGHT + 2)- 2*line); j++){ 
              System. out .print("/");
              }
              System. out .println();
              }
       }
 
       //this the bottom line
       public static void drawBottomline() {
              System. out .print("+");
              for (int i=1; i <= ( 3* SUB_HEIGHT ); i++)
              System. out .print("-");
              System. out .print("+");
              System. out .println();
       }
}