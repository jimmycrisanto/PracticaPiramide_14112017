package PiramideSerie;

import java.util.ArrayList;

public class Piramide {

public void drawPiramideExample(int input) {
int n = input;
int totaldigit = 0;

for (int i = 0; i < input; i++) {
totaldigit = totaldigit + n;
}
int x = 0;
int a = 0;
int Num = 6;

ArrayList arr = new ArrayList();
for (int i = 0; i < totaldigit; i++) {
a = a + ((16 * x) + Num);
arr.add(a);
x++;
}
int m = 0;
for (int i = 0; i < input; i++) {
for (int j = 0; j <= i; j++) {
System.out.print(arr.get(j + m) + " ");
}

m = m + i + 1;

System.out.println(" ");
}
}
public static void main(String[] args) {
Piramide patt=new Piramide();
patt.drawPiramideExample(5);

}
}