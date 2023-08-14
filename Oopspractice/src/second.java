class movie{
   private String title,studio,rating;

   public movie(String title,String studio,String rating){
       this.title=title;
       this.studio=studio;
       this.rating=rating;
   }

   public movie(String title,String studio){
       this.title=title;
       this.studio=studio;
       this.rating="pg";
   }

   public void display(){
       System.out.println(title+" "+studio+" ");
   }
}
public class second {
    public static void main(String[] args) {
        movie m1 = new movie("RRR","r");
        movie m2 = new movie("kgf","prashanth neel");
        m1.display();
        m2.display();
        System.out.println();
//        movie[] ans = movie.getpg(m);
    }

}
