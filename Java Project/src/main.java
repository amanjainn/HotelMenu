import java.util.*;
public class main {

            public static void main(String [] args)
            {
                Scanner sc=new Scanner(System.in);
                Date date=new Date();
                System.out.println("Enter Your Name");
                String name=sc.nextLine();
                System.out.println("---------------------------------------------------");
                System.out.println(" ");
                System.out.println("Hotel Name\t\t\t"+"User Name\t\t\t\t"+"Date and Time");
                System.out.println("Welcome to Taj Hotel"+"\t"+name+"\t\t\t"+date.toString());
                System.out.println("---------------------------------------------------");
                int a,b,c,d,e;
                int i;
                int eachcost=0;
                int cost=0;
                int price=0;
                int y=0;
                String item=" ";
                //int press [];
                System.out.println(" ");
                System.out.println("---------------------------------------------------");
                System.out.println("See Menu card ");
                System.out.println("---------------------------------------------------");
                System.out.println(" ");
                System.out.println("---------------------------------------------------");
                System.out.println("Item Name\t\t"+"Price\t\t"+"Press to order");
                System.out.println("---------------------------------------------------");
                System.out.println(" ");
                System.out.println("Rice and Dal\t\t"+"60\t\t"+"1");
                System.out.println("Dosa\t\t\t\t"+"40\t\t"+"2");
                System.out.println("Pav and Bhaji\t\t"+"50\t\t"+"3");
                System.out.println("Misal and Pav\t\t"+"50\t\t"+"4");
                System.out.println("Biryani\t\t\t\t"+"70\t\t"+"5");
                System.out.println(" ");
                System.out.println("---------------------------------------------------");
                System.out.println(" ");
                ArrayList order=new ArrayList();
                ArrayList pric=new ArrayList();
                ArrayList plate=new ArrayList();


                do
                {
                    System.out.println("---------------------------------------------------");
                    System.out.println("Press to order");
                    a=sc.nextInt();
                    int press[]=new int[]{a};
                    System.out.println(press[0]);

                    System.out.println(" ");

                    System.out.println("You Have Pressed"+"\t"+a);
                    System.out.println(" ");
                    System.out.println("---------------------------------------------------");
                    System.out.println("Enter the Number of plates");
                    b=sc.nextInt();
                    System.out.println(" ");
                    System.out.println("---------------------------------------------------");
                    System.out.println("Item Name\t\t"+"Number of plates\t\t\t"+"Total");
                    System.out.println(" ");

                    //Code for item select

                    if(a==1)
                    {
                        item="Rice and Dal";
                        price=60;
                        eachcost=price*b;
                        cost+=eachcost;
                        System.out.println(item+"\t\t"+b+"\t\t\t\t"+eachcost);
                        System.out.println("---------------------------------------------------");
                        boolean of=order.contains(item);
                        if(of)
                        {
                            order.add("");
                            pric.add(eachcost);
                            plate.add(b);
                        }
                        else
                        {
                            pric.add(eachcost);
                            plate.add(b);
                            order.add(item);
                        }
                    }
                    if(a==2)
                    {
                        item="Dosa";
                        price=40;
                        eachcost=price*b;
                        cost+=eachcost;
                        System.out.println(item+"\t\t\t"+b+"\t\t\t\t\t\t"+eachcost);
                        System.out.println("---------------------------------------------------");
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==3)
                    {
                        item="Pav and Bhaji";
                        price=50;
                        eachcost=price*b;
                        cost+=eachcost;
                        System.out.println(item+"\t\t"+b+"\t\t\t\t"+eachcost);
                        System.out.println("---------------------------------------------------");
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==4)
                    {
                        item="Misal and Pav";
                        price=50;
                        eachcost=price*b;
                        cost+=eachcost;
                        System.out.println(item+"\t\t"+b+"\t\t\t\t"+eachcost);
                        System.out.println("---------------------------------------------------");
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }
                    if(a==5)
                    {
                        item="Biryani";
                        price=70;
                        eachcost=price*b;
                        cost+=eachcost;
                        System.out.println(item+"\t\t\t"+b+"\t\t\t\t"+eachcost);
                        System.out.println("---------------------------------------------------");
                        order.add(item);
                        pric.add(eachcost);
                        plate.add(b);
                    }

                    System.out.println("---------------------------------------------------");
                    System.out.println(" ");
                    System.out.println("Report:");
                    System.out.println(" ");
                    for(int k=0;k<press.length;k++)
                    {
                        String fetchitemname= "  ";

                        System.out.println("Item Name\t\t"+"No. of plates\t\t\t"+"Price");
                        if(press[k]==1)
                        {
                            fetchitemname="Rice And Dal   ";
                            System.out.print(fetchitemname+"\t\t\t"+b+"\t\t\t\t\t\t"+eachcost);
                        }
                        if(press[k]==2)
                        {
                            fetchitemname="Dosa           ";
                            System.out.print(fetchitemname+"\t\t\t"+b+"\t\t\t\t\t\t"+eachcost);
                        }
                        if(press[k]==3)
                        {
                            fetchitemname="Pav and Bhaji  ";
                            System.out.print(fetchitemname+"\t\t\t"+b+"\t\t\t\t\t\t"+eachcost);
                        }
                        if(press[k]==4)
                        {
                            fetchitemname="Misal and Pav  ";
                            System.out.print(fetchitemname+"\t\t\t"+b+"\t\t\t\t\t\t"+eachcost);
                        }
                        if(press[k]==5)
                        {
                            fetchitemname="Biryani        ";
                            System.out.print(fetchitemname+"\t\t\t"+b+"\t\t\t\t\t\t"+eachcost);
                        }




                    }
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("Do You Want To Continue the Order(Press 1 for continue/Otherwise Press 0)");
                    y=sc.nextInt();


            System.out.println(" ");


        }while(y!=0);

        System.out.println(" ");
        System.out.println("Report:");
        System.out.println(" ");
        //System.out.println(press[0]);
        System.out.println(" ");

        System.out.println("Items Names"+"\t\t\t\t\t\t\t"+"No. of plates"+"\t\t\t\t\t\t\t"+"Sub Total");
        System.out.println("---------------------------------------------------");
        Iterator itr  =order.iterator();
        Iterator itr1 =pric.iterator();
        Iterator itr2 =plate.iterator();

        while(itr.hasNext() && itr1.hasNext() && itr2.hasNext())
        {
            System.out.print(itr.next()+"\t\t\t\t\t\t\t\t"+itr2.next()+"\t\t\t\t\t\t\t\t"+itr1.next());
            System.out.println(" ");

        }

        System.out.println(" ");
        System.out.println("Total"+"     "+cost);
        System.out.println(" ");
        System.out.println("Thank You for visiting our hotel :"+" "+name+"\t\t\t");

    }
}
