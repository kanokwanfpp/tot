public class fone {
 public static void main(String args[]) {
int a[]={10,9,13,5};
int max=0; int min=999; int tot=0;
  for (int i=0; i<a.length; i++) {
 if(max<a[i])max=a[i];
if(min>a[i])min=a[i];
tot+=a[i];
}
System.out.println("max="+max);
System.out.println("min="+min);
System.out.println("tot="+tot);
}
}
