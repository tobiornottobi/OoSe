public class Test {
    public static void main (String[] args) {
    C1 a=new C2();
    C2 b=new C2();
    C1 c = new C1(); ((C2) c).f1();
    }
    }
/*
    1. ((C2) a).f1(); -> C2 :: f1
    2. ((C1) b).f1(); -> C2 :: f1
    3. System.out.println(a.s); -> 1  1
    4. b.f1(); -> C2 :: f1
    5. b.f2(); -> C1 :: f2
    6. b.f3(); -> C2 :: f3
    7. C1 c = new C1(); c.f3(); -> Kompilierungsfehler "cannot find c"
    8. C1 c = new C1(); ((C2) c).f1(); -> kompiliert, aber Laufzeitfehler "class C11 cannot be cast to class C2"
*/