package section2.section2_1.section2_1_3;

public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        ThreadA athread = new ThreadA(numRef1);
        athread.start();
        ThreadB bthread = new ThreadB(numRef2);
        bthread.start();
    }
}
