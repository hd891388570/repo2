package cn.itcast.Test_7_25.Test01;

public class Test1 {
        public static void main(String[] args) {
            Person man = new Man();
            Person woman = new Woman();
            test(man);
            test(woman);
        }
        public static void test(Person person){
            if (person instanceof Man){
                person.eat();
                ((Man) person).speak("英文");
            }else if (person instanceof  Woman){
                person.eat();
                ((Woman) person).speak("英文");
            }
        }
}
