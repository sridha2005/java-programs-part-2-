class enca
{
    private String name;
    private int rollno;
    public void setName(String name){
        this.name = name;
    }
    public void setrollno(int rollno){
        this.rollno = rollno;
    }
    public String getname(){
        return name;
    }
    public int getrollno(){
        return rollno;
    }
    public static void main(String[] args){
        enca e = new enca();
        e.setName("sri");   
        e.setrollno(44);
        System.out.println(e.getname());
        System.out.println(e.getrollno());
    }
}