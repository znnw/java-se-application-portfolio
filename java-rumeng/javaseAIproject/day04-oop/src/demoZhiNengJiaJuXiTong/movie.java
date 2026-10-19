package demoZhiNengJiaJuXiTong;

public class movie {
    private String name;
    private int id;
    private double price;
    private String actor;
    public movie(){}
    public movie(String name,int id,double price,String actor) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.actor = actor;
    }
        public String getName () {
            return name;
        }
        public void setName () {
            this.name = name;
        }

        public int getId () {
            return id;
        }

        public void setId () {
            this.id = id;
        }
        public double getPrice () {
            return price;
        }
        public void setPrice () {
            this.price = price;
        }
        public String getActor () {
            return actor;
        }
        public void setActor () {
            this.actor = actor;
        }

    }
