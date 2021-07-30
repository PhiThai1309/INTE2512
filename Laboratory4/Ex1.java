package Laboratory4;

public class Ex1 {
    class A {
        public A() {}
        public A(int x) {
        }
    }
    class B extends A {
        public B() {
        }
    }
    public class C {
        public void main(String[] args) {
            B b = new B();
        }
    }
}
