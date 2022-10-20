package animals;

public class Main {
    public static void main(String[] args) {
        Cow cow1= new Cow(450,5,"Mujskoi","Deri");
        Cow cow2= new Cow(230,13,"Mujskoi","Marta");
        Cow cow3= new Cow(400,16,"Jenskii","Zoya");
        Cow cow4= new Cow(550,17,"Mujskoi","Murka");
        Cow cow5= new Cow(750,18,"Jemski","Zorka");
        Cow cow6= new Cow(700,15,"Jemski","Margo");

        Sheep sheep1=new Sheep(45,6,"Jenckii","Tom");
        Sheep sheep2 =new Sheep(50,5,"Jenckii","Tomi");
        Sheep sheep3 =new Sheep(48,6,"Jenckii","To");
        Sheep sheep4 =new Sheep(49,3,"Jenckii","Tomas");

        Horse horse1 = new Horse(465,12,"Mujskoi","Ahiles");
        Horse horse2 = new Horse(560,13,"Mujskoi","Tor");
        Horse horse3  = new Horse(500,17,"Mujskoi","Molniya");

       Farm farm1 = new Farm("Melnikova 3k2",new Cow[]{cow1,cow2,cow3,cow4,cow5},
               new Sheep[]{sheep1,sheep2,sheep3},
               new Horse[]{horse1,horse2},"Aikyn");

       Farm farm2 = new Farm("Ardynka 40",new Cow[]{cow6},
               new Sheep[]{sheep4},
               new Horse[]{horse3},"Bektur");

        System.out.println(farm1);
        System.out.println(farm2);


    }
}