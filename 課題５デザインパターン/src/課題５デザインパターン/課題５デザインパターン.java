package 課題５デザインパターン;

class Television extends Seihin {
private int tvSerialNumber;
private String date;
public void numberring() {
tvSerialNumber = Counter.getTvNumber();
}
public void setDate(String date) {
this.date = date;
}
public void print() {
System.out.println("このテレビに関する情報:");
System.out.println(" <製造番号>:" + tvSerialNumber);
System.out.println(" <製造年月日>:" + date);
}
}
class Radio extends Seihin {
private int radioSerialNumber;
public void numberring() {
radioSerialNumber = Counter.getRadioNumber();
}
public void print() {
System.out.println("このラジオに関する情報:");
System.out.println(" <製造番号>:" + radioSerialNumber);
}
}
class Date {
public static String today() {
return "2004/01/20";
}
}
class Counter {
private static int tvNum = 100;
private static int radioNum = 76;
public static int getTvNumber() {
return tvNum++;
}
public static int getRadioNumber() {
return radioNum++;
}
}