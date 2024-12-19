public class Main
{
	public static void main(String[] args) {
		bankaccount customer1=new bankaccount("ahmed", 1000);
		customer1.deposite(200);
		customer1.withdraw(500);
		customer1.printdata();
	}
}


class bankaccount{
    
    private String name;
    private int money;
    
    bankaccount(String name, int money){
        this.name=name;
        this.money=money;
    }
    
    public int deposite(int x){
        this.money+=x;
        return money;
    }
    
    public int withdraw(int x){
        if(x > money){
            System.out.println("your don't have enough money");
        }else{
            this.money-=x;
        }
        return money;
    }
    
    public void printdata(){
        System.out.println("your name is: " + name + "\n your money is: "+ money);
    }
}