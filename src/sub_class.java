public class sub_class {
    public  class Sub_class extends Super_class{
        int num=70;
        public void display(){
            System.out.println("Это метод display подкласса");
        }
        public void  myMethod(){
            Sub_class sub = new Sub_Class();
            sub.display();
            super.display();

        }
    }
}
