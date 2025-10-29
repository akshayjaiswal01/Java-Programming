class Table{
public static void printTable(int num)
{
for(int i=1; i<=10 ;i++)
{
System.out.println(num+"x"+i+"="+(num*i));
}
}
public static void main(String[] args){
if(args.length<=0){
System.out.println("error pass one argument");


}
else {
int num= Integer.parseInt(args[0]);
printTable(num);
}

}





}