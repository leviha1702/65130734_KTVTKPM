package behavioral.observer.youtube;

public class MainYouTube {
    static void main(String[] args) {
        YouTubeChannel damSau= new YouTubeChannel();
        Subcriber sv1 = new Subcriber("sv A");
        Subcriber sv2 = new Subcriber("sv B");
        Subcriber sv3 = new Subcriber("sv C");
        damSau.attach(sv1);
        damSau.attach(sv2);
        damSau.attach(sv3);
        damSau.uploadVideo("Huong dan Design Pattern");
        System.out.println("-->Sinh vien B huy dang ky kenh.");
        damSau.detach(sv2);
        damSau.uploadVideo("Cau truc du lieu va giai thuat");
    }
}
