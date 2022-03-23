public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    /*
    ==
tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.*/


    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    public Double tax(){
        if(this.salary>1000){
            return this.salary=this.salary-(this.salary*0.3);
        }
        else{
           return 0.0;
        }
    }

        public double bonus(){
            int fazlaSaat=workHours-40;
            if(workHours>40){
              return this.salary=(fazlaSaat*30)+salary;

            }
            else{
                return 0;
        }


    }
    Double raiseSalary(){
        int workTime=2021-hireYear;
        if(workTime<10){
            return salary=salary+(salary+0.5);
        }
        if((workTime>9)&&(workTime<20)){
            return salary=salary+(salary+0.1);
        }
        else{
            return salary=salary+(salary+0.15);
        }

    }

     public void Print(){
        System.out.println("calisanin adi:"+this.name);
        System.out.println("calisanin maasi:"+this.salary);
        System.out.println("calisanin aldigi bonus:"+this.bonus());
        System.out.println("calisanin aldigi calisma saati:"+this.workHours);
        System.out.println("ise giris yili:"+this.hireYear);
        System.out.println("Vergi Miktarı: " + tax());
        System.out.println("Maaş Zammı: " + raiseSalary());
        System.out.println("Bonus ve Vergi ile Maaş Miktarı: " + (this.salary + bonus() - tax()));

    }
}
